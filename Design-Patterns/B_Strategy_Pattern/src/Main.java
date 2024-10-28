// Switches between algorithms at runtime within interchangeable strategies. Selects algorithms dynamically at runtime.

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
        Vehicle vehicle2 = new GoodsVehicle();
        vehicle2.drive();
    }
}