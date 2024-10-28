package Liskov_Subtitution;

public class Bicycle implements Bike{
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        throw new AssertionError("There is no engine");
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void wheelCount() {

    }
}
