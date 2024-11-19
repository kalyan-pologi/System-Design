package Q2;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public boolean processPayment(double amount) {
        return true;
    }
}
