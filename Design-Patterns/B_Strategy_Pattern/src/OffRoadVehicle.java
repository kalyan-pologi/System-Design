import Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

//    @Override
//    public void drive() {
////        offRoad and sports have same drive capability
//        System.out.println("sports drive capability");
//    }

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }

}
