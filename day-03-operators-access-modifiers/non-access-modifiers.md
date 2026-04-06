# ***Non-Access Modifiers in Java***

---

## **Defination**

Non-access modifiers provide information about the **characteristics of a class, method, or variable** to the JVM.

---

## **Types of Non-Access Modifiers**

1. static
2. final
3. abstract
4. synchronized
5. volatile
6. transient
7. native

---

## **1. static**

The `static` keyword means the member belongs to the **class, not an object**.

* Memory is allocated at **class loading time**
* Can be accessed without creating object

### **Example**

```java
class Test {
    static int count = 0;
}

class Main {
    public static void main(String[] args) {
        System.out.println(Test.count);
    }
}
```

---

## **2. final**

The `final` keyword means **cannot be changed**.

* final variable → constant
* final method → cannot be overridden
* final class → cannot be extended

### **Example**

```java
final class A {
}

class B extends A { } // ❌ error
```

---

## **3. abstract**

The `abstract` keyword means **incomplete implementation**.

* Cannot create object
* Must be extended
* Abstract methods must be overridden

### **Example**

```java
abstract class A {
    abstract void show();
}

class B extends A {
    void show() {
        System.out.println("Implemented");
    }
}
```

---

## **4. synchronized**

Used for **thread safety**.

* Prevents multiple threads from accessing method at same time

### **Example**

```java
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}
```

---

## **5. volatile**

Ensures variable value is **updated across all threads**.

* Value is always read from **main memory**

### **Example**

```java
class Test {
    volatile boolean flag = true;
}
```

---

## **6. transient**

Used in **serialization**.

* Variable will **not be saved** during serialization

### **Example**

```java
class User implements java.io.Serializable {
    transient String password = "123";
}
```

---

## **7. native**

Indicates method is implemented in **other language (C/C++)**.

### **Example**

```java
class Test {
    public native void show();
}
```

---

## **Key Characteristics**

* Define **behavior**, not visibility
* Used with **class, method, variable**
* Important for **performance, memory, concurrency**

---

## **Quick Summary**

* static → class-level
* final → constant / cannot change
* abstract → incomplete
* synchronized → thread-safe
* volatile → memory visibility
* transient → skip serialization
* native → external implementation

---
