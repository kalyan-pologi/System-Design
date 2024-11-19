package dto.paymentMethods;

public class CreditCard extends PaymentMethod{

    private String cardNumber;
    private int CVV;

    public CreditCard(String cardNumber, int CVV) {
        this.cardNumber = cardNumber;
        this.CVV = CVV;
    }

    @Override
    public boolean initiatePayment(int amount) {
        return false;
    }
}
