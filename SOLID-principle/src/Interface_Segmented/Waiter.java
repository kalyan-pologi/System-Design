package Interface_Segmented;

public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {
        //not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("serving the customer");
    }

    @Override
    public void cookFood() {
      // not my job
    }
}
