package Interfaces.Example1;

public class MainClass {
    public static void main(String[] args) {

        InterfaceDemo id = new TestClass();

        id.method1();   // output: I am method1 of class Test

        id.method2();   // output: I am method2 of class Test


        System.out.println();

        TestClass tc = new TestClass();

        tc.method1();   // output: I am method1 of class Test

        tc.method2();   // output: I am method2 of class Test

        tc.method3();   // output: I am method3 of class Test
    }
}
