package Abstraction.Example1;

abstract class SuperClass {

    // constructor
    public SuperClass() {
        System.out.println("I am Super Class Constructor");
    }

    public void method1() {
        System.out.println("Method1 of super class\n");
    }

    abstract public void method2();
}
