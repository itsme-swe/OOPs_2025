package Constructors.CopyConstructor;

public class Student {

    // Instance variables
    public int id;
    public int age;
    public String name;

    // Parameterised Constructor
    public Student (int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    // Copy Constructor ⇒ copying values of object s1 to object s2
    public Student (Student s1Obj) {

        this.id = s1Obj.id;
        this.age = s1Obj.age;
        this.name = s1Obj.name;
    }
}
