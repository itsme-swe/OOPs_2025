package Interfaces.Example1;

public class TestClass implements InterfaceDemo {

    // Here we are overriding all the abstract methods of interfaceDemo to make TestClass a concrete class
    @Override
    public void method1() {
        System.out.println("I am method1 of class Test");
    }

    @Override
    public void method2() {
        System.out.println("I am method2 of class Test");
    }

    public void method3(){
        System.out.println("I am method3 of class Test");
    }
}
