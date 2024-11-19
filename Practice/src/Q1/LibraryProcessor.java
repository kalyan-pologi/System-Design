package Q1;

public class LibraryProcessor {

    private Membership membership;
    private NotificationService notificationService;

    public LibraryProcessor(Membership membership, NotificationService notificationService){
        this.membership = membership;
        this.notificationService = notificationService;
    }
    public void borrowBook(Borrowable book, String memberId, int currentBorrowedBooks){
        if (membership.canBorrow(currentBorrowedBooks)){
            book.borrow(memberId);
            notificationService.sendNotification(memberId, "you have borrowed: "+ ((Book)book).getTitle() );
        }else {
            System.out.println("borrowing limit exceed for "+ memberId);
        }
    }
    public void returnBook(Borrowable book,  String memberId){
        book.returnBook(memberId);
    }
    public void downloadBook(Downloadable book, String memberId){
        book.download(memberId);
        notificationService.sendNotification(memberId, " you have downloaded "+ ((Book)book).getTitle());
    }
}
