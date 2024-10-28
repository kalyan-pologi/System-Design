package Open_Closed;

import Single_Responsibility.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        // save to DB
    }
}
