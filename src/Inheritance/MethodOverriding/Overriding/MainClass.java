package Inheritance.MethodOverriding.Overriding;

public class MainClass {
    public static void main(String[] args) {

        Television t = new Television();
        Television t1  = new SmartTV();  // ref. of parent class and object is of subclass
        SmartTV st = new SmartTV();


        t1.changeChannel(); // override methods

        t1.switchON();  // override methods

        st.browsing();  // unique method of subclass
    }
}

/*
* Whenever we use ref. of parent class and object of subclass the methods of subclass overshadowed the method of parent class.
* When we call methods using runtime polymorphism, we can access overridden methods of the subclass, but we cannot directly access methods that are unique to the subclass if the reference type is of the parent class.
* */
