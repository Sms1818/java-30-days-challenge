# ***Hello World Program In Java***

---

## **Code**

```java
public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

## **Line-By-Line Explanation**

### **1. Class Definition**

Every Java program must have at least one class. Here, the class is defined using the class keyword

```java
public class HelloWorld{

}
```

* Note -> If the class is public, the filename must match the class name HelloWorld.java

---

### **2. main Method**

In the java programming language, every application must contain the main method as it is the entry point of the application.

```java
public static void main(String[] args)
```

* public: Allows JVM to access the method from anywhere.
* static: Method can run without creating an object.
* void: It doesn’t return any value.
* String[] args: Accepts command-line arguments.

---

### **3. System.out.println()**

This prints output to the console.

```java
System.out.println("Hello, World");
```

* System: Built-in class from java.lang package.
* out: Static member (PrintStream object) of System.
* println(): Method that prints to console and moves to the next line.
