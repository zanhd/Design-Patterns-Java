package Client;

import Adaptee.Circle;
import Adapter.CircleAdapter;
import AlreadySupportedCode.Rectangle;
import AlreadySupportedCode.Shape;

public class Main {
    public static void main(String[] args) {

        // 1. how already Exiting code works
        Shape rectangle = new Rectangle(5, 6);
        System.out.println("Area of Rectangle : " + rectangle.calculateArea());

        /*
            2. Now, we want to add support for circles
               But the Circle class doesn't implement the Shape interface.
               So, created an adapter class CircleAdapter
         */

        Shape circle = new CircleAdapter(new Circle(7));
        System.out.println("Area of Circle : " + circle.calculateArea());
    }
}
