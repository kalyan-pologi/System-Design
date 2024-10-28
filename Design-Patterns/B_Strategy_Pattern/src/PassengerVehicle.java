import Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

    //    @Override
//    public void drive() {
//        System.out.println("normal drive capability");
//    }

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
