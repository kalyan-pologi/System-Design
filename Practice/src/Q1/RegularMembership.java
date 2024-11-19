package Q1;

public class RegularMembership implements Membership{
    @Override
    public boolean canBorrow(int currentBorrowedBooks) {
        return currentBorrowedBooks < 5;
    }
}
