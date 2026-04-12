/*
Problem (Runtime Polymorphism + Concept Trap)
Create:
🔹 Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }

    void stop() {
        System.out.println("Vehicle stops");
    }
}
🔹 Subclasses
Car
Bike
Both should:
Override start()
Do NOT override stop()
Example:
Car → "Car starts with key"
Bike → "Bike starts with kick"
*/

/* Implementation of the Vehicle class and its subclasses Car and Bike to demonstrate runtime polymorphism. The main method creates instances of Car and Bike using Vehicle reference and calls the start and stop methods to show how method overriding works in Java.

start() shows runtime polymorphism because it is overridden in the subclasses, so the method call is decided by the actual object type at runtime.
stop() behaves the same for both objects because it is not overridden, so both subclasses inherit the same implementation from Vehicle.
*/




// Output:
// Car starts with key
// Vehicle stops
// Bike starts with kick
// Vehicle stops
class Vehicle{
    void start() {
        System.out.println("Vehicle starts");
    }

    void stop() {
        System.out.println("Vehicle stops");
    }
}

class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class VehiclePolymorphismDemo {
    public static void main(String[] args) {
        Vehicle v1=new Car();
        Vehicle v2=new Bike();

        v1.start(); // Car starts with key
        v1.stop();  // Vehicle stops

        v2.start(); // Bike starts with kick
        v2.stop();  // Vehicle stops
    }
}