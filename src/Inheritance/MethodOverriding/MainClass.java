package Inheritance.MethodOverriding;

public class MainClass {
    public static void main(String[] args) {

        Animal a1 = new Dog();

        a1.sound();

    }
}
/*
* This is an example of "Dynamic Dispatch method" also known as "runtime polymorphism" where Parent class Reference is created and referring to the child class object.
* */