package Polymorphism.Overloading;

public class Test {

    public int max(int a, int b) {
        return a > b ? a:b;
    }


    public int max (int a, int b, int c) {
        if (a > b && a > c) return a;
        else if(b > c) return b;
        return c;
    }
}
