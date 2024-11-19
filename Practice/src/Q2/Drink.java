package Q2;

public class Drink implements MenuItem{

    private String name;
    private double price;
    private boolean isAvailable;
    private boolean isHot;

    public Drink(String name, double price, boolean isAvailable, boolean isHot) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
        this.isHot = isHot;
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

    public boolean isHot(){
        return isHot;
    }
}
