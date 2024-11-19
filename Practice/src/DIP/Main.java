package DIP;

public class Main {
    public static void main(String[] args) {

        OrderProcessing creditOrder = new OrderProcessing(new CreditCardPayment());
        creditOrder.order("ordered using credit card");
        OrderProcessing debitOrder = new OrderProcessing(new DebitCardPayment());
        debitOrder.order("ordered using debit card");


        PaymentMethod credit = OrderRegistry.getPaymentMethods("credit");
        credit.order("ordered using credit card");
        PaymentMethod debit = OrderRegistry.getPaymentMethods("debit");
        credit.order("ordered using debit card");
    }
}
