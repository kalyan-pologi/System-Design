public class PayToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("validate logic for pay to friend");
    }

    @Override
    public void calculateFees() {
        System.out.println("calculate logic for pay to friend");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit logic for pay to friend");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit logic for pay to friend");
    }
}
