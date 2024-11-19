package ISP;

public class BasicPrinter1 implements Printer{
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void fax(String document) {
        throw new UnsupportedOperationException("Fax not supported");
    }

    @Override
    public void photocopy(String document) {
        throw new UnsupportedOperationException("Photocopy not supported");
    }
}
