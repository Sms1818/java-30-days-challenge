# ***Classes & Objects in Java (Complete Deep Dive)***

---

# 🔥 **Class in Java**

---

## **Definition**

A **class** is a **user-defined blueprint or template** used to create objects.
It defines the **data (state)** and **behavior (methods)** that objects will have.

> A class is a **logical entity** that groups variables and methods into a single unit.

---

## **Key Characteristics**

* Blueprint for objects
* Does NOT hold actual data
* Memory for instance variables is allocated only when object is created 
* Supports encapsulation and reusability

---

## **Structure of a Class**

```java
class ClassName {
    // variables (state)
    // methods (behavior)
    // constructors
}
```

---

## **Example**

```java
class Student {
    int id;
    String name;

    void display(){
        System.out.println(id + " " + name);
    }
}
```

---

## **Understanding**

```text
Class = Blueprint / Design
```

---

# 🔥 **Object in Java**

---

## **Definition**

An **object** is an **instance of a class** that contains real data and can perform actions.

> An object is a **physical entity** with state, behavior, and identity.

---

## **Properties of Object**

### **1. State**

```java
id = 10
name = "Alice"
```

### **2. Behavior**

```java
display()
```

### **3. Identity**

👉 Unique reference in memory

---

## **Example**

```java
Student s1 = new Student();
```

---

## **Understanding**

```text
Object = Real Instance / Actual Entity
```

---

# 🔥 **Class vs Object**

---

| Feature | Class                            | Object             |
| ------- | -------------------------------- | ------------------ |
| Nature  | Logical                          | Physical           |
| Memory  | No memory for instance variables | Occupies memory    |
| Purpose | Blueprint                        | Actual data holder |

---

# 🔥 **Object Creation (Step-by-Step)**

---

## **1. Declaration**

```java
Student s1;
```

👉 Only reference created (in stack)
👉 No object yet

---

## **2. Instantiation**

```java
s1 = new Student();
```

👉 Object created in heap
👉 Memory allocated
👉 Constructor invoked

---

## **Combined**

```java
Student s1 = new Student();
```

---

# 🔥 **Memory Representation**

---

```text
Stack → s1 (reference)
Heap  → Student object
```

---

# 🔥 **Example: Class + Object**

---

```java
class Student {
    int id;
    String name;

    void display(){
        System.out.println(id + " " + name);
    }
}

class Main {
    public static void main(String[] args){

        Student s1 = new Student();

        s1.id = 1;
        s1.name = "Alice";

        s1.display();
    }
}
```

---

# 🔥 **Constructor Usage**

---

```java
class Student {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class Main {
    public static void main(String[] args){
        Student s1 = new Student(10, "Alice");
    }
}
```

---

# 🔥 **Ways to Create Object**

---

## **1. Using `new` Keyword (Most Common)**

```java
Student s1 = new Student();
```

---

## **2. Using Reflection**

```java
class Student {}

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("Student");
        Student s = (Student) c.getDeclaredConstructor().newInstance();
    }
}
```

---

## **3. Using clone()**

```java
class Test implements Cloneable {
    int x = 10;

    public static void main(String[] args) throws Exception {
        Test t1 = new Test();
        Test t2 = (Test) t1.clone();

        System.out.println(t2.x);
    }
}
```

---

## **4. Using Deserialization**

```java
import java.io.*;

class Student implements Serializable {
    String name = "Alice";
}

public class Main {
    public static void main(String[] args) throws Exception {

        // Write object
        ObjectOutputStream out =
            new ObjectOutputStream(new FileOutputStream("file.ser"));
        out.writeObject(new Student());

        // Read object
        ObjectInputStream in =
            new ObjectInputStream(new FileInputStream("file.ser"));
        Student s = (Student) in.readObject();

        System.out.println(s.name);
    }
}
```

---

# 🔥 **Anonymous Object**

---

## **Definition**

Object without reference variable

---

## **Example**

```java
new Student().display();
```

---

## **Use Case**

* One-time use
* No reuse required

---

# 🔥 **Important Concepts**

---

## **1. Multiple Objects**

```java
Student s1 = new Student();
Student s2 = new Student();
```

👉 Each object has separate data

---

## **2. Reference Assignment**

```java
Student s2 = s1;
```

👉 Both refer to same object

---

## **3. Null Reference**

```java
Student s1 = null;
```

👉 No object assigned

---

# 🔥 **Why Classes & Objects?**

---

✔ Encapsulation
✔ Code reusability
✔ Real-world modeling
✔ Better structure

---

# 🔥 **Important Rules**

---

* Class = logical entity
* Object = physical entity
* `new` → allocates memory + calls constructor
* Object stored in heap
* Reference stored in stack

---

# 🔥 **Common Mistakes**

---

❌ Forgetting `new`
❌ Confusing reference vs object
❌ Assuming class stores data
❌ Not using `this`

---

# 🚀 **Quick Summary**

---

* Class → blueprint
* Object → instance
* Object holds real data
* Class defines structure

---

👉 Classes & Objects = **foundation of Java & OOP**

---
