package Scenario2;

public class OrderFacade {

    ProductDao productDao;
    Invoice invoice;
    Payment payment;
    SendNotification sendNotification;

    public OrderFacade(){
        productDao = new ProductDao();
        invoice = new Invoice();
        payment = new Payment();
        sendNotification = new SendNotification();
    }
    public void createOrder(){
        Product product = productDao.getProduct(121);
        payment.makePayment();
        invoice.generateInvoice();
        sendNotification.sendNotification();
    }
}
