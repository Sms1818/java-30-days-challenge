
import java.util.ArrayList;
import java.util.List;

/* 
Problem

Design an Employee Bonus System.

You have different employee types:

FullTimeEmployee
Intern
Freelancer

Each employee should have:

name
a method:
double calculateBonus()
Rules
FullTimeEmployee bonus = 20% of salary
Intern bonus = fixed 1000
Freelancer bonus = 10% of project payment
Requirements
Design it in a clean OOP way
In main, store all employee types in a single collection
Loop through them and print:
Name: X, Bonus: Y
*/

// Solution: My intuition is to use abstract class Employee which will have a common property name and an abstract method calculateBonus() which will be implemented by the classes FullTimeEmployee, Intern and Freelancer. Each class will provide its own implementation of the calculateBonus() method to calculate the bonus based on the given rules. In the main method, we will create objects of each employee type, store them in a collection and loop through them to print their names and bonuses. A child class will call the parent class constructor to initialize the name property and override the calculateBonus() method to provide the specific bonus calculation logic for each employee type.

// Output:
// Name: Alice, Bonus: 10000.0
// Name: Bob, Bonus: 1000.0
// Name: Charlie, Bonus: 2000.0

abstract class Employee{
    private String name;
    public Employee(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract double calculateBonus();
}

class FullTimeEmployee extends Employee{
    private double salary;
    public FullTimeEmployee(String name, double salary){
        super(name);
        this.salary=salary;
    }
    @Override
    public double calculateBonus() {
        return salary*0.2;
    }
}

class Intern extends Employee{
    public Intern(String name){
        super(name);
    }
    @Override
    public double calculateBonus() {
        return 1000;
    }
}


class Freelancer extends Employee{
    private double projectPayment;
    public Freelancer(String name, double projectPayment){
        super(name);
        this.projectPayment=projectPayment;
    }
    @Override
    public double calculateBonus() {
        return projectPayment*0.1;
    }
}

public class EmployeeBonusSystemDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Alice", 50000));
        employees.add(new Intern("Bob"));
        employees.add(new Freelancer("Charlie", 20000));
        for(Employee emp : employees){
            System.out.println("Name: "+emp.getName()+", Bonus: "+emp.calculateBonus());
        }
    }
}
