package Abstraction.Example2;

public class Circle extends Shape {

    // circle class method
    double radius;

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
