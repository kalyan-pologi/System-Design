public class Subscriber implements Observer{

    String name;
    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void notified() {
        System.out.println("Hello " + this.name + " new video uploaded: notification");
    }
}
