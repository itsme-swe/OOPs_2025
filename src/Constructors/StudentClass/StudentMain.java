package Constructors.StudentClass;

public class StudentMain {
    public static void main(String[] args) {

        // Calling non-parameterised constructor
        Student s1 = new Student();
        s1.id = 101;
        s1.age = 32;
        s1.name = "Harsh";
        s1.numbers = 506;

        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.name);

        System.out.println();

        // Calling parameterised constructor
        Student s2 = new Student(102, 30, "Maxfold", 505);

        System.out.println(s2);

    }
}
