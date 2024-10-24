package Inheritance.MethodOverriding.Overriding;

public class SmartTV extends Television {

    @Override
    public void changeChannel() {
        System.out.println("SmartTV Channel is changed");
    }

    @Override
    public void switchON() {
        System.out.println("SmartTV is switched ON");
    }

    public void browsing() {
        System.out.println("Smart TV browsing");
    }
}
