package Abstraction.Example2;

public class MainClass {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        r1.length = 10;
        r1.breadth = 5;

        Shape s1 = r1;

        System.out.println("Area of rectangle is " + s1.area());
    }
}
