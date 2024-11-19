package Q2;

import java.util.List;

public interface Order {
    public String getOrderId();
    public void addItem(MenuItem menuItem);
    public void removeItem(MenuItem menuItem);
    public double calculateTotal();
    public void processOrder();

}
