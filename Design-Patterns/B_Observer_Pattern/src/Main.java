// Notifies multiple observers when the subject's state changes.

public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();
        Subscriber kalyan = new Subscriber("Kalyan");
        channel.subscribe(kalyan);
        channel.newVideoUploaded();
    }
}