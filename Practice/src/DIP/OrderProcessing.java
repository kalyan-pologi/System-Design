package DIP;

public class OrderProcessing {
    private PaymentMethod paymentMethod;
    OrderProcessing(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    public void order(String message){
        paymentMethod.order(message);
    }
//    private CreditCardPayment creditCardPayment;
//    OrderProcessing(){
//        this.creditCardPayment = new CreditCardPayment();
//    }
//    public void order(String type){
//        creditCardPayment.pay(type);
//    }
}
