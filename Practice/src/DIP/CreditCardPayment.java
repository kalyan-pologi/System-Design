package DIP;

public class CreditCardPayment implements PaymentMethod{

    public void order(String message){
        System.out.println("credit card payment: "+message);
    }
}
