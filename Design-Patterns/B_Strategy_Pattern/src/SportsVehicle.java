import Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

//    @Override
//    public void drive() {
//        System.out.println("sports drive capability");
//    }

    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
