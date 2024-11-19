package Q2;

public class Dessert implements MenuItem{

    private String name;
    private double price;
    private boolean isAvailable;

    public Dessert(String name, double price, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
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

    public boolean isTakeoutAllowed() {
        return false; // Desserts are always dine-in
    }
}
