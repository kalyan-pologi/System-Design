// Creates objects via a common interface without exposing logic.
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shapeObj = shapeFactoryObj.getShape("CIRCLE");
        shapeObj.draw();
    }
}