package ISP.fix;

public class AllInOnePrinter implements Print, Scan, Fax, Photocopy {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("Faxing document: " + document);
    }

    @Override
    public void photocopy(String document) {
        System.out.println("Photocopying document: " + document);
    }
}
