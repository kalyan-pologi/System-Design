package ISP;

import ISP.fix.AllInOnePrinter;
import ISP.fix.BasicPrinter;
import ISP.fix.Print;

public class Main {
    public static void main(String[] args) {
        Print basicPrinter = new BasicPrinter();
        basicPrinter.print("Basic Printer Document");

        AllInOnePrinter allInOnePrinter = new AllInOnePrinter();
        allInOnePrinter.print("All-in-One Printer Document");
        allInOnePrinter.scan("All-in-One Printer Document");
        allInOnePrinter.fax("All-in-One Printer Document");
        allInOnePrinter.photocopy("All-in-One Printer Document");
    }
}
