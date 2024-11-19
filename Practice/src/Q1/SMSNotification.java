package Q1;

public class SMSNotification implements NotificationService{
    @Override
    public void sendNotification(String memberId, String message) {
        System.out.println("sending sms to "+ memberId+ ":" + message);
    }
}
