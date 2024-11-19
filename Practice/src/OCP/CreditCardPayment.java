package OCP;

public class CreditCardPayment implements Payment{
    @Override
    public void ProcessPayment(double amount) {
        System.out.println("processing credit card payment of $"+ amount);
    }
}
