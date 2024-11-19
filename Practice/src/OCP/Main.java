package OCP;

public class Main {
    public static void main(String[] args) {
        try {
            Payment payment = PaymentRegistry.getPaymentMethods("creditcard");
            payment.ProcessPayment(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
