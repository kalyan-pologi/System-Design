public class PayToMerchantFlow extends PaymentFlow{
    public void validateRequest() {
        System.out.println("validate logic for pay to merchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("calculate logic for pay to merchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit logic for pay to merchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit logic for pay to merchant");
    }
}
