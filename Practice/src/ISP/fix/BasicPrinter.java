package ISP.fix;

public class BasicPrinter implements Print {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}
