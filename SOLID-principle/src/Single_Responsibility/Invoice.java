package Single_Responsibility;

public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price = ((marker.price) * this.quantity);
        return price;
    }
//    public void printInvoice(){
//        // print invoice
//    }
//    public void saveToDB(){
//        //save the data to DB
//    }
}
