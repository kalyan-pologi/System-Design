package Q1;

public class DigitalBook implements Book, Downloadable{

    private String title;

    public DigitalBook(String title){
        this.title = title;
    }
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void download(String memberId) {
        System.out.println(memberId+ " download the digital book: "+ title);
    }
}
