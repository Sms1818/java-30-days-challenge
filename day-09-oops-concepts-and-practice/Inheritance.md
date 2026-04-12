# ***Inheritance in Java***

---

# 🔥 **Definition**

Inheritance is a core Object-Oriented Programming concept that allows a class to **acquire properties (fields) and behaviors (methods) from another class**.

> It promotes code reusability and helps in building relationships between classes 

---

# 🧠 **Core Idea**

```text
Child IS-A Parent
```

👉 A subclass (child) inherits from a superclass (parent)

---

# 🔥 **Basic Syntax**

```java
class Parent {
    // fields and methods
}

class Child extends Parent {
    // additional features
}
```

---

# 🔥 **Basic Example**

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // inherited
        d.bark();  // own method
    }
}
```

---

## **Output**

```
Animal makes a sound
Dog barks
```

---

# 🔥 **Key Terminologies**

---

| Term       | Meaning                      |
| ---------- | ---------------------------- |
| Class      | Blueprint                    |
| Superclass | Parent class                 |
| Subclass   | Child class                  |
| extends    | Keyword used for inheritance |

---

# 🔥 **Types of Inheritance**

---

# **1. Single Inheritance**

---

## **Definition**

One subclass inherits from one superclass.

---

## **Example**

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();
    }
}
```

---

## **Output**

```
Vehicle starts
Car drives
```

---

# **2. Multilevel Inheritance**

---

## **Definition**

A chain of inheritance where a class inherits from another derived class.

---

## **Example**

```java
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
```

---

## **Output**

```
Animal eats
Dog barks
Puppy weeps
```

---

# **3. Hierarchical Inheritance**

---

## **Definition**

Multiple subclasses inherit from a single superclass.

---

## **Example**

```java
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
```

---

## **Output**

```
Animal eats
Dog barks
Animal eats
Cat meows
```

---

# **4. Multiple Inheritance (Using Interfaces)**

---

## **Important**

❌ Not supported with classes
✅ Supported using interfaces

---

## **Example**

```java
interface A {
    default void showA() {
        System.out.println("A");
    }
}

interface B {
    default void showB() {
        System.out.println("B");
    }
}

class C implements A, B {}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}
```

---

## **Output**

```
A
B
```

---

# **5. Hybrid Inheritance**

---

## **Definition**

Combination of multiple inheritance types.

---

## **Example**

```java
class Vehicle {
    void type() {
        System.out.println("Vehicle");
    }
}

interface Electric {
    default void battery() {
        System.out.println("Electric Vehicle");
    }
}

class Car extends Vehicle {}

class Tesla extends Car implements Electric {}

public class Main {
    public static void main(String[] args) {
        Tesla t = new Tesla();
        t.type();
        t.battery();
    }
}
```

---

## **Output**

```
Vehicle
Electric Vehicle
```

---

# 🔥 **IS-A Relationship**

---

## **Definition**

Represents inheritance relationship.

---

## **Example**

```java
class Animal {}
class Dog extends Animal {}
```

```
Dog IS-A Animal
```

---

# 🔥 **instanceof Keyword**

---

## **Example**

```java
Dog d = new Dog();

System.out.println(d instanceof Dog);    
System.out.println(d instanceof Animal);
```

---

## **Output**

```
true
true
```

---

# 🔥 **Constructor in Inheritance**

---

## **Rule**

👉 Parent constructor executes first

---

## **Example**

```java
class Parent {
    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child");
    }
}

public class Main {
    public static void main(String[] args) {
        new Child();
    }
}
```

---

## **Output**

```
Parent
Child
```

---

# 🔥 **super Keyword**

---

## **Usage**

* Call parent constructor
* Call parent method

---

## **Example**

```java
class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void show() {
        super.show();
        System.out.println("Child method");
    }
}
```

---

# 🔥 **Method Overriding in Inheritance**

---

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

# 🔥 **What a Subclass Can Do**

---

✔ Use parent fields
✔ Use parent methods
✔ Add new methods
✔ Override methods
✔ Call parent constructor

---

# 🔥 **Advantages of Inheritance**

---

✔ Code reusability
✔ Better organization
✔ Supports polymorphism
✔ Real-world modeling

---

# 🔥 **Disadvantages**

---

❌ Tight coupling
❌ Increased complexity
❌ Hard to maintain deep hierarchies

---

# 🚀 **Quick Summary**

---

* Inheritance = code reuse mechanism
* Uses `extends` keyword
* Follows IS-A relationship
* Supports polymorphism
* Parent constructor runs first

---

👉 Inheritance = **building relationships between classes for reuse and extensibility**

---
