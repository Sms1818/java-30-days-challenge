// This program demonstrates constructor chaining in Java. The Student class has three constructors: a default constructor, a constructor that takes a name, and a constructor that takes both a name and an ID. The constructors call each other using the 'this' keyword to initialize the object. When we create a Student object using the default constructor, it initializes the name to "John" and the ID to 1. Finally, we print the student's name and ID to the console.

// Output:
// Two parameter constructor called
// One parameter constructor called
// Default constructor called
// Student Name: Unknown
// Student ID: 1
class Student {
    String name;
    int id;
    public Student(){
        this("Unknown");
        System.out.println("Default constructor called");

    }
    public Student(String name){
        this(name,1);
        System.out.println("One parameter constructor called");
    }
    public Student(String name,int id){
        this.name=name; 
        this.id=id;
        System.out.println("Two parameter constructor called");
    }
}
public class Q03_ConstructorChaining {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println("Student Name: "+s.name);
        System.out.println("Student ID: "+s.id);

    }
}
