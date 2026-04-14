# ***Interfaces in Java***

---

# 🔥 **Definition**

An interface in Java is a **blueprint that defines a set of methods a class must implement**, without providing full implementation.

> It helps achieve abstraction and supports multiple inheritance 

---

# 🧠 **Core Idea**

```text
Interface → What to do
Class → How to do
```

---

# 🔥 **Basic Syntax**

---

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

---

# 🔥 **Key Properties of Interface**

---

✔ Methods are **public and abstract by default**
✔ Variables are **public, static, final**
✔ Cannot create object of interface
✔ Supports **multiple inheritance**
✔ Implemented using `implements` keyword

---

# 🔥 **Basic Example**

---

```java
interface TestInterface {

    int a = 10;

    void display();
}

class TestClass implements TestInterface {

    public void display() {
        System.out.println("Hello");
    }
}

public class Main {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }
}
```

---

## **Output**

```
Hello
10
```

---

# 🔥 **Real-World Example**

---

```java
interface Vehicle {

    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle {

    int speed, gear;

    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    void printState() {
        System.out.println(speed + " " + gear);
    }
}
```

---

# 🔥 **Multiple Inheritance Using Interface**

---

## **Definition**

Java does not support multiple inheritance with classes
👉 But supports it using interfaces

---

## **Example**

```java
interface Add {
    int add(int a, int b);
}

interface Sub {
    int sub(int a, int b);
}

class Calculator implements Add, Sub {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}
```

---

# 🔥 **Diamond Problem**

---

## ❗ **What is Diamond Problem?**

Occurs in multiple inheritance when:

```text
      A
     / \
    B   C
     \ /
      D
```

👉 Ambiguity: Which method to inherit?

---

# ❌ **Why Java Classes Don’t Support It**

```java
class A {
    void show() {}
}

class B extends A {}
class C extends A {}

// class D extends B, C ❌ NOT ALLOWED
```

👉 Compiler cannot decide which path to follow

---

# ✅ **How Interface Solves Diamond Problem**

---

## **Case 1: Abstract Methods**

```java
interface A {
    void show();
}

interface B extends A {}
interface C extends A {}

class D implements B, C {

    public void show() {
        System.out.println("Resolved");
    }
}
```

👉 No ambiguity
👉 Class must implement method

---

## **Case 2: Default Methods (Conflict Case)**

```java
interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {

    public void show() {
        A.super.show(); // explicitly resolving
    }
}
```

---

## 🧠 **Key Rule**

```text
Must override method if conflict occurs
```

---

# 🔥 **Default Methods (Java 8+)**

---

```java
interface Test {
    default void display() {
        System.out.println("Default method");
    }
}
```

👉 Provides implementation inside interface

---

# 🔥 **Static Methods in Interface**

---

```java
interface Test {
    static void show() {
        System.out.println("Static method");
    }
}

public class Main {
    public static void main(String[] args) {
        Test.show();
    }
}
```

---

# 🔥 **Private Methods (Java 9+)**

---

```java
interface Test {

    private void helper() {
        System.out.println("Helper");
    }

    default void display() {
        helper();
    }
}
```

---

# 🔥 **Functional Interface**

---

## **Definition**

Interface with only **one abstract method**

---

```java
@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}
```

👉 Used in lambda expressions

---

# 🔥 **Extending Interfaces**

---

```java
interface A {
    void m1();
}

interface B extends A {
    void m2();
}
```

---

# 🔥 **Class vs Interface**

---

| Feature      | Class    | Interface         |
| ------------ | -------- | ----------------- |
| Object       | Yes      | No                |
| Variables    | Instance | Constants         |
| Methods      | Concrete | Abstract (mostly) |
| Inheritance  | Single   | Multiple          |
| Constructors | Yes      | No                |

---

# 🔥 **When to Use Interface**

---

✔ Define behavior (contract)
✔ Multiple inheritance needed
✔ No shared state required

---

# 🔥 **When to Use Class**

---

✔ Need state (variables)
✔ Need constructors
✔ Need full implementation

---

# 🔥 **Advantages**

---

✔ Supports multiple inheritance
✔ Promotes loose coupling
✔ Enables abstraction
✔ Improves scalability

---

# 🔥 **Disadvantages**

---

❌ More complexity
❌ Cannot hold state (traditional)
❌ Overuse reduces readability

---

# 🔥 **Common Mistakes**

---

❌ Forgetting to implement methods
❌ Confusing with abstract class
❌ Ignoring default method conflicts

---

# 🚀 **Quick Summary**

---

* Interface = contract
* Supports multiple inheritance
* Solves diamond problem
* Methods must be implemented

---

```text
Interface = What
Class = How
```

---

👉 Interfaces = **foundation of scalable system design**

---
