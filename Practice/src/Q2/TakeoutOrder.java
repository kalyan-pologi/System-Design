package Q2;

import java.util.ArrayList;
import java.util.List;

public class TakeoutOrder implements Order{
    private String orderId;
    private List<MenuItem> items;
    private String customerName;

    public TakeoutOrder(String orderId, String customerName) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.customerName = customerName;
    }

    @Override
    public String getOrderId() {
        return orderId;
    }

    @Override
    public void addItem(MenuItem item) {
        if (item instanceof Dessert && !((Dessert)item).isTakeoutAllowed() ){
            System.out.println("Dessert cannot be ordered as takeout");
        }else {
            items.add(item);
        }
    }

    @Override
    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    @Override
    public double calculateTotal() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    @Override
    public void processOrder() {
        System.out.println("processing dine-in order for "+ customerName);
        items.forEach(items -> System.out.println("serving "+ items.getName()));
    }
}
