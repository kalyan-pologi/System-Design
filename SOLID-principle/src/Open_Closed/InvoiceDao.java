package Open_Closed;

import Single_Responsibility.Invoice;

//public class InvoiceDao {
//
//    Invoice invoice;
//    public InvoiceDao(Invoice invoice){
//        this.invoice = invoice;
//    }
//    public void saveToDB(){
//        // save to DB
//    }
//    public void saveToFile(){
//        // save to File
//    }
//}

interface InvoiceDao{
    public void save(Invoice invoice)
}
