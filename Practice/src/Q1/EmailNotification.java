package Q1;

public class EmailNotification implements NotificationService{
    @Override
    public void sendNotification(String memberId, String message) {
        System.out.println("sending email to "+ memberId+ ":" + message);
    }
}
