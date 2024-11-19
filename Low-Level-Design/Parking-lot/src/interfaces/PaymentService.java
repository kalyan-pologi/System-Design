package interfaces;

public interface PaymentService {
    void acceptCash(int amount);
    void acceptCreditCard(String cardNumber, int CVV, int amount);
}
