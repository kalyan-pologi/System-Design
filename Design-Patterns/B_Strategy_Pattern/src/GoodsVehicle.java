import Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    //    @Override
//    public void drive() {
//        System.out.println("normal drive capability");
//    }

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
