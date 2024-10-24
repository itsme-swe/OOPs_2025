package Constructors.CopyConstructor;

public class MainClassStudent {
    public static void main(String[] args) {

        // Creating Object 1 using Student Class and here we are calling parameterised constructor
        Student s1 = new Student(101, 32, "Harsh");

        System.out.printf("The id is %d and name of student is '%s', his age is %d.\n",s1.id, s1.name, s1.age);

        System.out.println();

        // Creating object 2 and copying all the values of object s1 into object s2.
        Student s2 = new Student(s1);

        System.out.printf("The id of object s2 is also %d and even name is same '%s' and his age is also %d.", s2.id, s2.name, s2.age);
    }
}
