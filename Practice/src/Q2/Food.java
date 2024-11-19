package Q2;

public class Food implements MenuItem{

    private String name;
    private double price;
    private boolean isAvailable;
    private boolean isTakeoutAllowed;

    public Food(String name, double price, boolean isAvailable, boolean isTakeoutAllowed) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
        this.isTakeoutAllowed = isTakeoutAllowed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    public boolean isTakeoutAllowed(){
        return isTakeoutAllowed;
    }
}
