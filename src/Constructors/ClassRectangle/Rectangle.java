package Constructors.ClassRectangle;

public class Rectangle {

  private double length;
  private double breadth;

  public double getLength() {
    return length;
  }

  public double getBreadth() {
    return breadth;
  }

  // non-parameter constructor
  public Rectangle() {
    length = 1;
    breadth = 1;
  }

  // parameter constructor
  public Rectangle(double l, double b) {
    length = l;
    breadth = b;
  }

}
