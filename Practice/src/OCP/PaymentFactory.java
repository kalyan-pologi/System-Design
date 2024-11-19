package OCP;

public class PaymentFactory {
    public static Payment getPaymentMethod(String paymentType) {
        switch (paymentType.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment();
            case "googlepay":
                return new GooglePayPayment();
            default:
                throw new IllegalArgumentException("Invalid payment method: " + paymentType);
        }
    }
}
