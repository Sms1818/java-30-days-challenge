# ***abstract Keyword in Java***

---

## **Defination**

The `abstract` keyword is a non-access modifier used for **classes and methods** to achieve abstraction (hiding implementation details).

---

## **Key Characteristics**

* Abstract class **cannot be instantiated**
* Abstract method **does not have a body**
* Subclass must **implement all abstract methods**
* Abstract class can have **both abstract and concrete methods**
* Can have **constructors and variables**

---

## **Abstract Method**

A method without implementation.

### **Syntax**

```java id="p7x9mz"
abstract void methodName();
```

---

## **Rules for Abstract Methods**

* Must be inside an **abstract class**
* Cannot be:

  * final
  * static
  * private
  * synchronized

---

## **Abstract Class**

A class with partial implementation.

### **Syntax**

```java id="m8q2wr"
abstract class ClassName {
}
```

---

## **Example 1**

```java id="r9k1wp"
abstract class A {
    abstract void show();
}

class B extends A {
    void show() {
        System.out.println("Implemented");
    }
}

class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
```

---

## **Example 2 (Abstract + Concrete Method)**

```java id="t4z8lv"
abstract class A {
    abstract void m1();

    void m2() {
        System.out.println("Concrete method");
    }
}

class B extends A {
    void m1() {
        System.out.println("Abstract implemented");
    }
}
```

---

## **Example 3 (Real Use Case)**

```java id="g6x2sn"
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r = 5;

    double area() {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    double l = 10, b = 20;

    double area() {
        return l * b;
    }
}
```

---

## **Key Characteristics**

* Provides **partial abstraction**
* Supports **inheritance and polymorphism**
* Ensures **method implementation in subclasses**

---



## **Quick Summary**

* abstract → incomplete
* no object creation
* must be extended
* methods must be implemented

---
