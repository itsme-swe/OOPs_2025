package Inheritance.thisAndsuper;

public class Rectangle {

    // Instance variables
    public int length;
    public int breadth;

    // Parameterised Constructor
    public Rectangle (int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    void display() {
        System.out.printf("The length of rectangle is %d\n", this.length);
        System.out.printf("The breadth of rectangle is %d", this.breadth);

    }
}
