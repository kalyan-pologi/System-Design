package Single_Responsibility;

public class InvoicePrinter {

    Invoice invoice;
    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }
    public void print(){
        // save to print
    }
}
