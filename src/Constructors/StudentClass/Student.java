package Constructors.StudentClass;

public class Student {

    public int id;
    public int age;
    public String name;
    public int numbers;

    // Default constructor ⇒ Default constructor sets the garbage values to attributes.
    public Student() {
        System.out.println("Student class default constructor");
    }

    // Parameterised Constructor
    public Student (int id, int age, String name, int numbers) {

        System.out.println("Student Class parameterised constructor");
        this.id = id;
        this.age = age;
        this.name = name;
        this.numbers = numbers;
    }
}
