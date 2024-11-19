package Q2;

public class EmailNotification implements NotificationService{
    @Override
    public void sendNotification(String customerId, String message) {
        System.out.println("sending email to "+ customerId+ ": " + message );
    }
}
