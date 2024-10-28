package Liskov_Subtitution;

public class MotorCycle implements Bike{

    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed+10;
    }

    @Override
    public void wheelCount() {

    }
}
