// This code demonstrates the use of default and parameterized constructors in Java. The Student class has two constructors: one that takes parameters to initialize the name and id, and another default constructor that sets the name to "Unknown" and id to 0. In the main method, we create two Student objects, one using the default constructor and another using the parameterized constructor, and print their details.

// Default Constructor is a constructor that takes no parameters and is used to initialize an object with default values. In this code, the default constructor initializes the name to "Unknown" and id to 0.
// By default, if no constructor is defined in a class, Java provides a default constructor that initializes all member variables to their default values (null for objects, 0 for integers, etc.). 
// However, if you define any constructor (like the parameterized one), Java does not provide the default constructor automatically, so you need to define it explicitly if you want to use it.

// Output:
// Student Name: Unknown
// Student ID: 0
// Student Name: John
// Student ID: 1

class Student{
    String name;
    int id;

    public Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    public Student(){
        this.name="Unknown";
        this.id=0;
    }
}
public class Q02_DefaultVsParameterized {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println("Student Name: "+s.name);
        System.out.println("Student ID: "+s.id);

        Student s1=new Student("John", 1);
        System.out.println("Student Name: "+s1.name);
        System.out.println("Student ID: "+s1.id);

        
    }
}
