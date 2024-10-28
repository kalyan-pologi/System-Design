public class LoggerSingleton {

    private static volatile LoggerSingleton instance = null;
    private LoggerSingleton(){
        // To avoid reflection
        if(instance != null) {
            throw new RuntimeException("Please don't try to be smart");
        }
    }
    public static LoggerSingleton getInstance(){
        if (instance == null){
            // Thread safe - block level synchronize
            synchronized (LoggerSingleton.class){
                if (instance == null){
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }

}

    /*
    private static LoggerSingleton instance = new LoggerSingleton();
    private LoggerSingleton(){
    }
    public static LoggerSingleton getInstance(){
        return instance;
    }
    */

    /*
    private static LoggerSingleton instance = null;
    private LoggerSingleton(){
    }
    public static LoggerSingleton getInstance(){
        if(instance == null){
            instance = new LoggerSingleton()
        }
        return instance;
    }
    */


