package Abstraction.Example2;

public class Rectangle extends Shape{

    double length;
    double breadth;

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public double area() {
        return length * breadth;
    }


}
