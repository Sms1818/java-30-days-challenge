# ***Constructors in Java***

---

# 🔥 **Definition**

A **constructor** is a special member of a class that is **automatically called when an object is created**.

👉 It is used to **initialize the state (variables) of an object** 

---

# 🧠 **Core Idea**

👉 Object is created → constructor runs automatically
👉 Used to assign initial values

---

# 🔥 **Key Characteristics**

---

✔ Same name as class
✔ No return type (not even void)
✔ Called automatically
✔ Can take parameters

---

# 🔥 **Basic Example**

---

```java id="c1"
class Student {

    String name;

    Student(String name){
        this.name = name;
    }

    void display(){
        System.out.println(name);
    }

    public static void main(String[] args){
        Student s1 = new Student("Alice");
        s1.display();
    }
}
```

---

## **Output**

```text id="c2"
Alice
```

---

## 🧠 **Explanation**

👉 Constructor initializes `name`
👉 Called automatically during object creation

---

# 🔥 **Types of Constructors**

---

# **1. Default Constructor**

---

## **Definition**

A constructor with **no parameters**

---

## **Example**

```java id="c3"
class Test {

    Test(){
        System.out.println("Default Constructor");
    }

    public static void main(String[] args){
        Test t = new Test();
    }
}
```

---

## **Output**

```text id="c4"
Default Constructor
```

---

## 🧠 **Important**

👉 If no constructor is written, Java provides one automatically

---

# 🔥 **2. Parameterized Constructor**

---

## **Definition**

Constructor with parameters to initialize values

---

## **Example**

```java id="c5"
class Student {

    String name;
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    void display(){
        System.out.println(name + " " + id);
    }
}
```

---

## 🧠 **Explanation**

👉 Allows object to be initialized with custom values

---

# 🔥 **3. Copy Constructor**

---

## **Definition**

A constructor that copies data from another object

---

## **Example**

```java id="c6"
class Student {

    String name;
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    Student(Student obj){
        this.name = obj.name;
        this.id = obj.id;
    }
}
```

---

## 🧠 **Important**

👉 Java does NOT provide built-in copy constructor
👉 We create it manually

---

# 🔥 **4. Private Constructor**

---

## **Definition**

Constructor that cannot be accessed outside class

---

## **Use Cases**

✔ Singleton Pattern
✔ Utility classes

---

## **Example**

```java id="c7"
class Test {

    private Test(){
        System.out.println("Private Constructor");
    }

    static void show(){
        System.out.println("Static Method");
    }
}
```

---

## 🧠 **Explanation**

👉 Object creation is restricted
👉 Only static methods can be used

---

# 🔥 **Constructor Overloading**

---

## **Definition**

Multiple constructors with different parameters

---

## **Example**

```java id="c8"
class Test {

    Test(){
        System.out.println("No argument");
    }

    Test(int x){
        System.out.println("One argument");
    }

    Test(int x, int y){
        System.out.println("Two arguments");
    }
}
```

---

## 🧠 **Explanation**

👉 Compiler selects constructor based on arguments

---

# 🔥 **Important Concepts**

---

# **1. Constructor vs Method**

---

| Feature     | Constructor   | Method   |
| ----------- | ------------- | -------- |
| Name        | Same as class | Any name |
| Return type | None          | Required |
| Call        | Automatic     | Manual   |

---

# 🔥 **2. Constructor Call Flow**

---

```text id="c9"
Object creation → Constructor executes → Object initialized
```

---

# 🔥 **3. this Keyword in Constructor**

---

```java id="c10"
this.name = name;
```

👉 Used to refer current object

---

# 🔥 **Important Rules**

---

✔ Constructor name = class name
✔ No return type
✔ Called automatically
✔ Can be overloaded
✔ Cannot be inherited

---

# 🔥 **Common Mistakes**

---

❌ Writing return type in constructor
❌ Forgetting `this`
❌ Confusing constructor with method

---

# 🚀 **Quick Summary**

---

* Constructor initializes object
* Called during object creation
* Supports overloading
* Can be default, parameterized, copy, private

---

👉 Constructor = **object initialization mechanism**

---
