package Q1;

public class PhysicalBook implements Book, Borrowable{

    private String title;
    public PhysicalBook(String title){
        this.title = title;
    }
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(String memberId) {
        System.out.println(memberId + " borrowed the physical book: "+ title);
    }

    @Override
    public void returnBook(String memberId) {
        System.out.println(memberId+ " returned the physical book: "+ title);
    }
}
