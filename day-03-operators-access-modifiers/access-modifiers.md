# ***Access Modifiers in Java***

---

## **Defination**

Access modifiers in Java define the **visibility (scope)** of classes, variables, methods, and constructors.

---

## **What is a Package?**

A package in Java is a **namespace (folder)** used to group related classes.

👉 It helps in:

* Organizing code
* Avoiding naming conflicts
* Controlling access

---

## **Why Access Modifiers?**

* To **restrict access**
* To achieve **encapsulation**
* To improve **security**

---

## **Types of Access Modifiers**

1. public
2. private
3. default (no modifier)
4. protected

---

## **1. public**

Accessible from **anywhere** (same class, same package, different package).

### **Example**

```java
package pack1;

public class Test {
    public int age = 25;
}
```

```java
package pack2;

import pack1.Test;

class Main {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.age); // accessible everywhere
    }
}
```

---

## **2. private**

Accessible **only within the same class**.

### **Example**

```java
class Test {
    private int salary = 50000;

    public void show() {
        System.out.println(salary); // accessible here
    }
}
```

👉 Not accessible outside class

---

## **3. default (no modifier)**

Accessible **only within the same package**.

### **Example**

```java
package pack1;

class Test {
    int marks = 90; // default
}
```

```java
package pack1;

class Main {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.marks); // accessible (same package)
    }
}
```

```java
package pack2;

import pack1.Test;

class Demo {
    void show() {
        // Test t = new Test(); ❌ not accessible (different package)
    }
}
```

---

## **4. protected**

Accessible:

* Within the **same package**
* In **subclasses (even in different packages)**

### **Example**

```java
package pack1;

public class Parent {
    protected int id = 101;
}
```

```java
package pack2;

import pack1.Parent;

class Child extends Parent {
    void display() {
        System.out.println(id); // accessible via inheritance
    }
}
```

---

## **Access Level Table**

| Modifier  | Same Class | Same Package | Subclass (diff package) | Outside Package |
| --------- | ---------- | ------------ | ----------------------- | --------------- |
| public    | Yes        | Yes          | Yes                     | Yes             |
| protected | Yes        | Yes          | Yes                     | No              |
| default   | Yes        | Yes          | No                      | No              |
| private   | Yes        | No           | No                      | No              |

---

## **Key Characteristics**

* Package determines **access scope**
* default → package-level access
* protected → package + inheritance
* private → class only
* public → everywhere
* public class name must match file name
* There should be only one public class per file and the file name should match that public class name

---


## **Quick Summary**

* public → everywhere
* protected → package + subclass
* default → package only
* private → class only

---
