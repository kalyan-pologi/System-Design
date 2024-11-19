public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentForFriend = new PayToFriend();
        paymentForFriend.sendMoney();

        PaymentFlow paymentForMerchant = new PayToMerchantFlow();
        paymentForMerchant.sendMoney();
    }
}