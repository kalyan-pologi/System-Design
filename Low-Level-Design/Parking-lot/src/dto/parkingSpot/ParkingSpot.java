package dto.parkingSpot;

import java.util.concurrent.atomic.AtomicInteger;

public class ParkingSpot {

    private static final AtomicInteger x = new AtomicInteger(0);
    private int id;
    private boolean isFree;
    private int floor;
    private int amount;

    public ParkingSpot(int floor, int amount) {
        this.floor = floor;
        this.amount = amount;
        isFree =  true;
        id = x.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public boolean isFree() {
        return isFree;
    }

    public int getFloor() {
        return floor;
    }

    public int getAmount() {
        return amount;
    }
}
