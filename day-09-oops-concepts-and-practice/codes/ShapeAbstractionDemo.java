/*
Problem (Abstraction + Runtime Polymorphism)
Create an abstract class:
abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("Calculating area...");
    }
}
🔹 Subclasses
Create:
Circle
Rectangle

Requirements:
Circle:
field: radius
implement area() → π * r * r
Rectangle:
fields: length, width
implement area() → length * width
*/

// Implemented the Shape class as an abstract class with an abstract method area() and a concrete method display(). The Circle and Rectangle classes extend Shape and provide their own implementations of the area() method. The main method creates instances of Circle and Rectangle, calls the display() method to show the message, and then calls the area() method to calculate and print the area of each shape.

// Output
// Calculating area...
// Area of Circle: 78.53981633974483
// Calculating area...
// Area of Rectangle: 24.0

abstract class Shape{
    abstract double area();
    void display(){
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    double area() {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    @Override
    double area() {
        return length*width;
    }
}


public class ShapeAbstractionDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.display();
        System.out.println("Area of Circle: "+circle.area());

        Shape rectangle = new Rectangle(4, 6);
        rectangle.display();
        System.out.println("Area of Rectangle: "+rectangle.area());
    }
}