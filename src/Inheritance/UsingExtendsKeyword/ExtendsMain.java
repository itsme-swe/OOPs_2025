package Inheritance.UsingExtendsKeyword;

public class ExtendsMain {
    public static void main(String[] args) {

        // cylinder object
        Cylinder cy1 = new Cylinder();

        // circle object
        Circle c1 = new Circle();

        cy1.radius = 7;
        cy1.height = 10;

        System.out.println("Volume of cylinder: " + cy1.volume());

        System.out.println("Area of cylinder: " + cy1.area());

    }
}
