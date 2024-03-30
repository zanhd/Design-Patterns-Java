package Adapter;

import Adaptee.Circle;
import AlreadySupportedCode.Shape;

public class CircleAdapter implements Shape {
    Circle circle;

    public CircleAdapter(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double calculateArea() {
        return circle.calculateArea();
    }
}
