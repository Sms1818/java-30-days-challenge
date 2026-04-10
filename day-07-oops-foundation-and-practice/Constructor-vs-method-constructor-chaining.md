# ***Constructors vs Methods and Constructor Chaining***

---

# 🔥 **Constructors vs Methods**

---

## **Definition**

### **Constructor**

A constructor is used to **initialize an object when it is created** 

### **Method**

A method is used to **perform operations or define behavior**

---

# 🔥 **Basic Example**

---

## **Constructor Example**

```java id="cm1"
class Test {

    int x;

    Test(){
        System.out.println("Constructor called");
    }
}
```

---

## **Method Example**

```java id="cm2"
class Test {

    int add(int a, int b){
        return a + b;
    }
}
```

---

# 🔥 **Key Differences**

---

| Feature     | Constructor       | Method            |
| ----------- | ----------------- | ----------------- |
| Purpose     | Initialize object | Perform operation |
| Name        | Same as class     | Any name          |
| Return Type | None              | Required          |
| Call        | Automatic         | Manual            |
| Invocation  | Object creation   | Method call       |
| Inheritance | Not inherited     | Inherited         |
| Overloading | Supported         | Supported         |

---

# 🧠 **Core Understanding**

👉 Constructor → object creation phase
👉 Method → object usage phase

---

# 🔥 **Constructor Chaining**

---

## **Definition**

Constructor chaining is the process of **calling one constructor from another constructor** 

---

## **Why We Use It**

---

✔ Avoid code duplication
✔ Improve readability
✔ Reuse initialization logic

---

# 🔥 **Types of Constructor Chaining**

---

# **1. Within Same Class using this()**

---

## **Example**

```java id="cm3"
class Test {

    Test(){
        this(5);
        System.out.println("Default Constructor");
    }

    Test(int x){
        this(5, 10);
        System.out.println(x);
    }

    Test(int x, int y){
        System.out.println(x * y);
    }

    public static void main(String[] args){
        new Test();
    }
}
```

---

## **Output**

```text id="cm4"
50
5
Default Constructor
```

---

## 🧠 **Explanation**

👉 Constructor calls happen in chain
👉 Last constructor executes first

---

# 🔥 **Rules of this()**

---

✔ Must be first statement
✔ Used to call another constructor in same class
✔ At least one constructor should not use this()

---

# 🔥 **2. Across Classes using super()**

---

## **Example**

```java id="cm5"
class Parent {

    Parent(){
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {

    Child(){
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args){
        new Child();
    }
}
```

---

## **Output**

```text id="cm6"
Parent Constructor
Child Constructor
```

---

## 🧠 **Explanation**

👉 Parent constructor is called first
👉 Then child constructor

---

# 🔥 **Rules of super()**

---

✔ Must be first statement
✔ Calls parent constructor
✔ Automatically added if not written

---

# 🔥 **Constructor Execution Flow**

---

```text id="cm7"
Parent → Child → Object Ready
```

---

# 🔥 **Important Concept**

---

## **Order of Execution**

👉 Constructor chaining always follows:

```text id="cm8"
Top-most parent → child → current class
```

---

# 🔥 **Tricky Case**

---

```java id="cm9"
class A {
    A(){
        System.out.println("A");
    }
}

class B extends A {
    B(){
        System.out.println("B");
    }
}

class Main {
    public static void main(String[] args){
        new B();
    }
}
```

---

## **Output**

```text id="cm10"
A
B
```

---

👉 Even without `super()`, parent constructor is called

---

# 🔥 **Initializer Block**

---

## **Definition**

A block that runs **before constructor**

---

## **Example**

```java id="cm11"
class Test {

    {
        System.out.println("Init Block");
    }

    Test(){
        System.out.println("Constructor");
    }

    public static void main(String[] args){
        new Test();
    }
}
```

---

## **Output**

```text id="cm12"
Init Block
Constructor
```

---

# 🔥 **Important Rules**

---

✔ Constructor runs automatically
✔ this() → same class chaining
✔ super() → parent class chaining
✔ Parent constructor always executes first
✔ Constructor cannot return value

---

# 🔥 **Common Mistakes**

---

❌ Using return type in constructor
❌ Calling this() after statement
❌ Forgetting parent constructor flow
❌ Confusing method and constructor

---

# 🚀 **Quick Summary**

---

* Constructor → initializes object
* Method → performs operations
* this() → same class chaining
* super() → parent class chaining

---

👉 Constructor chaining = **execution flow control during object creation**

---
