import Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObject;
    public Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
    }

//    public void drive(){
//        System.out.println("normal drive capability");
//    }
}
