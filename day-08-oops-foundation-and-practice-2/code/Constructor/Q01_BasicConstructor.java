// This code demonstrates the use of a basic constructor in Java. The Student class has two attributes: name and id. 
// Constructor is a special method to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes. 
// The constructor initializes these attributes when a new Student object is created. In the main method, we create a Student object with the name "John" and id 101, and then print out the student's name and id.


// Output:
// Student Name: John
// Student ID: 101

class Student{
    String name;
    int id;
    public Student(String name, int id){
        this.name=name;
        this.id=id;
    }
     
}
public class Q01_BasicConstructor {
    public static void main(String[] args) {
        Student s=new Student("John", 101);
        System.out.println("Student Name: "+s.name);
        System.out.println("Student ID: "+s.id);

    }
}
