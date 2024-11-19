package Q2;

import java.util.ArrayList;
import java.util.List;

public class DineInOrder implements Order{

    private String orderId;
    private List<MenuItem> items;
    private String customerName;

    public DineInOrder(String orderId, String customerName) {
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
        items.add(item);
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
