/*
Problem (Inheritance + Constructor Chaining)

Create a base class:

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " earns " + salary);
    }
}
Subclass

Create a class Manager that:

extends Employee
adds:
double bonus
Requirements
Create constructor in Manager:
It should initialize name, salary, and bonus
Use super(...) to initialize parent fields
Override display():

Print:

name earns salary with bonus bonus
*/

// Implementation of the Employee class and its subclass Manager to demonstrate inheritance and constructor chaining. The main method creates instances of Employee and Manager, calls the display method to show their earnings, including the bonus for the Manager.

// super() is required to initialize parent class fields when the parent does not have a default constructor, ensuring proper constructor chaining.

// Output:
// John earns 50000.0
// Jane earns 80000.0 with bonus 20000.0

class Employee{
    final private String name;
    final private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println(name + " earns " + salary);
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee{
    final private double bonus;
    Manager(String name, double salary, double bonus){
        super(name, salary);
        this.bonus=bonus;
    }
    public double getBonus() {
        return bonus;
    }
    @Override
    public void display() {
        System.out.println(getName() + " earns " + getSalary() + " with bonus " + getBonus());
    }

}

public class EmployeeInheritanceDemo {
    public static void main(String[] args) {
        Employee e = new Employee("John", 50000);
        e.display();

        Employee m = new Manager("Jane", 80000, 20000);
        m.display();
    }
}