// Ensures only one instance of a class exists globally.
public class Main {
    public static void main(String[] args) {
        LoggerSingleton singletonObj = LoggerSingleton.getInstance();
        System.out.println(singletonObj);

        LoggerSingleton singletonObj2 = LoggerSingleton.getInstance();
        System.out.println(singletonObj2);
    }
}