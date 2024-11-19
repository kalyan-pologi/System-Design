package DIP;

public class DebitCardPayment implements PaymentMethod{
    @Override
    public void order(String message) {
        System.out.println("debit card payment: "+ message);
    }
}
