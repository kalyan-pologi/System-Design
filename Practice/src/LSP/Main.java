package LSP;

import LSP.fix.Rectangle;
import LSP.fix.Shape;
import LSP.fix.Square;
import LSP.Square1;
import LSP.Rectangle1;

public class Main {
    public static void main(String[] args)  {

        Rectangle1 rectangle1 = new Rectangle1();
        rectangle1.setWidth(5);
        rectangle1.setHeight(10);
        System.out.println("Rectangle Area: " + rectangle1.getArea()); // Expected: 50

        Rectangle1 square1 = new Square1();
        square1.setWidth(5);
        square1.setHeight(10); // This breaks the LSP!
        System.out.println("Square Area: " + square1.getArea()); // Unexpected result

        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rectangle.getArea()); // Expected: 50

        Shape square = new Square(5);
        System.out.println("Square Area: " + square.getArea()); // Expected: 25
    }
}
