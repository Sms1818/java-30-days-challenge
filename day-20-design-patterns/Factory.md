# Factory Method Design Pattern in Java

## 📌 Definition

The **Factory Method Design Pattern** is a creational design pattern that provides an interface for creating objects, but allows subclasses or factory classes to decide which object to instantiate.

It helps in **hiding object creation logic** and promotes **loose coupling** between client code and concrete classes.

---

## 🎯 Intent

* Encapsulate object creation logic
* Reduce dependency on concrete classes
* Promote flexibility and scalability
* Follow Open/Closed Principle (OCP)

---

## 🧠 Real-World Analogy

Think of a **restaurant 🍽️**:

* You order food (Pizza, Burger)
* You don’t cook it yourself
* Kitchen (factory) decides how to prepare it

👉 Client doesn’t worry about creation logic

---

# 🏗️ Core Components

## 1. Product Interface

```java
interface Shape {
    void draw();
}
```

Defines a common interface for all objects.

---

## 2. Concrete Products

```java
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
```

Actual implementations of the product.

---

## 3. Factory Class (Simple Factory)

```java
class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
```

Encapsulates object creation logic.

---

## 4. Client Code

```java
public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
```

Client uses factory instead of `new`.

---

# 🧪 Simple Factory (Important Note)

```java
class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
```

## ⚠️ Limitations

* Uses `if-else` or `switch`
* Not scalable
* Violates Open/Closed Principle
* Not true Factory Method pattern

---

# 🔥 Problem Without Factory

```java
if (type == 1) {
    vehicle = new TwoWheeler();
} else if (type == 2) {
    vehicle = new FourWheeler();
}
```

## Issues

* Tight coupling
* Hard to extend
* Violates Single Responsibility Principle

---

# 🚀 Factory Method Pattern (Proper Implementation)

## 1. Product

```java
abstract class Vehicle {
    abstract void printVehicle();
}
```

---

## 2. Concrete Products

```java
class TwoWheeler extends Vehicle {
    void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheeler extends Vehicle {
    void printVehicle() {
        System.out.println("I am four wheeler");
    }
}
```

---

## 3. Factory Interface

```java
interface VehicleFactory {
    Vehicle createVehicle();
}
```

---

## 4. Concrete Factories

```java
class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}

class FourWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
```

---

## 5. Client

```java
class Client {
    private Vehicle vehicle;

    public Client(VehicleFactory factory) {
        vehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
```

---

## 6. Main

```java
public class Main {
    public static void main(String[] args) {
        Client c1 = new Client(new TwoWheelerFactory());
        c1.getVehicle().printVehicle();

        Client c2 = new Client(new FourWheelerFactory());
        c2.getVehicle().printVehicle();
    }
}
```

---

# ⚖️ Comparison Table

| Approach       | Loose Coupling | Scalable  | Complexity |
| -------------- | -------------- | --------- | ---------- |
| Direct new     | ❌              | ❌         | Low        |
| Simple Factory | ⚠️ Partial     | ⚠️ Medium | Medium     |
| Factory Method | ✅              | ✅         | High       |

---

# ✅ Advantages

* Loose coupling
* Centralized object creation
* Easy to extend
* Follows Open/Closed Principle
* Better maintainability

---

# ❌ Disadvantages

* More classes
* Increased complexity
* Overkill for small applications

---

# 🎯 Use Cases

* Notification systems (Email, SMS, Push)
* Payment systems (UPI, Card, PayPal)
* UI frameworks (Buttons, Dialogs)
* Logging frameworks
* Game development (Enemy creation)

---

# 🧠 Interview Questions

## Q1: Why Factory Pattern?

To remove direct object creation and reduce coupling.

---

## Q2: Factory vs Abstract Factory?

* Factory → creates one product
* Abstract Factory → creates families of products

---

## Q3: Simple Factory vs Factory Method?

* Simple Factory → uses if-else
* Factory Method → uses polymorphism

---

## Q4: Where is it used?

* Frameworks
* APIs
* Object creation layers

---

# 🔥 Key Takeaway

Avoid using `new` everywhere.

👉 Prefer:

* **Factory Method** → scalable design
* **Simple Factory** → small use cases

---
