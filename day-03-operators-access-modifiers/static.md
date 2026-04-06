# ***static Keyword in Java***

---

## **Defination**

The `static` keyword in Java is used for memory management and belongs to the **class rather than any specific instance**.

---

## **Key Points**

* Memory is allocated **only once** when class is loaded
* No object required → access using **class name**
* Cannot directly access **non-static members**
* Static methods **cannot be overridden**

---

## **Types of Static Members**

1. Static Variables
2. Static Blocks
3. Static Methods
4. Static Nested Classes

---

## **1. Static Variables**

Shared among all objects of a class.

### **Example**

```java id="l2k9sj"
class Student {
    int rollNo;
    String name;
    static String center = "GFG";

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + center);
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ravi");
        Student s2 = new Student(102, "Amit");

        s1.display();
        s2.display();
    }
}
```

---

## **2. Static Block**

Executed **once** when class is loaded.

### **Example**

```java id="t8p3xk"
class Test {
    static int a = 10;
    static int b;

    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
```

---

## **3. Static Methods**

Belong to class and accessed using class name.

### **Rules**

* Can access only static members
* Cannot use `this` or `super`

### **Example**

```java id="s8d1qw"
class Test {
    static int a = 10;

    static void show() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Test.show();
    }
}
```

---

## **4. Static Nested Class**

A class declared static inside another class.

### **Example**

```java id="k92lwe"
class Outer {

    static class Inner {
        void show() {
            System.out.println("Static Nested Class");
        }
    }

    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}
```

---

## **Static vs Non-Static**

| Feature    | Static      | Non-Static             |
| ---------- | ----------- | ---------------------- |
| Belongs To | Class       | Object                 |
| Memory     | One copy    | Multiple copies        |
| Access     | Class name  | Object                 |
| Usage      | Shared data | Instance-specific data |

---

## **Key Characteristics**

* Shared across all objects
* Saves memory
* Used for utility methods and constants

---


## **Quick Summary**

* static → class-level
* no object required
* shared memory
* used for common data

---
