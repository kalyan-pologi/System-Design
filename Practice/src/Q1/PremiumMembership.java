package Q1;

public class PremiumMembership implements Membership {
    @Override
    public boolean canBorrow(int currentBorrowedBooks) {
        return true;
    }
}
