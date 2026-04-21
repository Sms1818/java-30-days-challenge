# ***Generics in Java***

---

# 🔥 **What are Generics?**

---

## **Definition**

Generics in Java allow us to create **classes, interfaces, and methods that can work with different data types while ensuring type safety at compile time** 

---

# 🧠 **Core Idea**

```text id="g1"
Write code once → Use with multiple types
```

---

# 🔥 **Why Generics?**

---

Before Generics:

```text id="g2"
Everything stored as Object  
Manual casting required  
Errors occur at runtime  
```

---

After Generics:

```text id="g3"
Type safety at compile time  
No casting needed  
Cleaner and safer code  
```

---

---

# 🔥 **Problem Without Generics**

---

```java id="g4"
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("Alpha");
        list.add("Beta");
        list.add(100); // Allowed

        String s = (String) list.get(2); // Runtime error
    }
}
```

---

## ❗ Problem

```text id="g5"
ClassCastException at runtime
```

---

---

# 🔥 **Solution Using Generics**

---

```java id="g6"
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Alpha");
        list.add("Beta");
        // list.add(100); ❌ Compile-time error

        String s = list.get(0); // No casting needed
    }
}
```

---

## ✅ Benefit

```text id="g7"
Error detected at compile time
```

---

---

# 🔥 **Types of Generics**

---

# 🔹 **1. Generic Class**

---

## **Definition**

A class that works with **different data types using a type parameter**.

---

## **Example**

```java id="g8"
class Box<T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
```

---

## **Usage**

```java id="g9"
public class Main {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>(10);
        Box<String> strBox = new Box<>("Hello");

        System.out.println(intBox.getValue());
        System.out.println(strBox.getValue());
    }
}
```

---

---

# 🔹 **2. Generic Class with Multiple Types**

---

```java id="g10"
class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println(key + " : " + value);
    }
}
```

---

## **Usage**

```java id="g11"
Pair<String, Integer> entry = new Pair<>("Age", 25);
entry.display();
```

---

---

# 🔹 **3. Generic Method**

---

## **Definition**

A method that can operate on **different data types independently of class type**.

---

## **Example**

```java id="g12"
public class Main {

    public static <T> void printValue(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        printValue(10);
        printValue("Hello");
        printValue(3.14);
    }
}
```

---

---

# 🔹 **4. Bounded Generics**

---

## **Definition**

Restrict type parameter to a **specific type or its subclasses**.

---

## **Example**

```java id="g13"
class Calculator<T extends Number> {

    public double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }
}
```

---

## **Usage**

```java id="g14"
Calculator<Integer> c1 = new Calculator<>();
Calculator<Double> c2 = new Calculator<>();

System.out.println(c1.square(5));
System.out.println(c2.square(2.5));
```

---

---

# 🔥 **Type Erasure**

---

## **Definition**

```text id="g15"
Generic type information is removed at compile time
```

---

## 🧠 Meaning

```text id="g16"
List<String> → becomes List at runtime
```

---

---

# 🔥 **Important Rules**

---

## 🔹 **1. No Primitive Types**

```java id="g17"
// ❌ Not allowed
Box<int> obj;

// ✅ Use wrapper
Box<Integer> obj;
```

---

---

## 🔹 **2. Different Generic Types Are Not Compatible**

```java id="g18"
Box<Integer> a = new Box<>(10);
Box<String> b = new Box<>("Hello");

// a = b; ❌ Compile-time error
```

---

---

## 🔹 **3. No Runtime Type Checking**

```text id="g19"
Cannot check generic type at runtime due to type erasure
```

---

---

# 🔥 **Type Parameter Naming Conventions**

---

| Symbol | Meaning |
| ------ | ------- |
| T      | Type    |
| E      | Element |
| K      | Key     |
| V      | Value   |
| N      | Number  |

---

---

# 🔥 **Benefits of Generics**

---

## ✔ **1. Type Safety**

```text id="g20"
Errors detected at compile time
```

---

## ✔ **2. No Casting Required**

```text id="g21"
Cleaner code
```

---

## ✔ **3. Code Reusability**

```text id="g22"
Same logic for multiple types
```

---

## ✔ **4. Better Readability**

---

---

# 🔥 **Advanced Example – Generic Sorting**

---

```java id="g23"
public class Main {

    public static <T extends Comparable<T>> void sort(T[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j].compareTo(arr[j + 1]) > 0) {

                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (T val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {

        Integer[] nums = {5, 2, 8, 1};
        String[] words = {"Banana", "Apple", "Cherry"};

        sort(nums);
        sort(words);
    }
}
```

---

---

# 🔥 **Common Interview Questions**

---

## 🔹 Why Generics?

```text id="g24"
To provide type safety and reuse code
```

---

---

## 🔹 What is Type Erasure?

```text id="g25"
Removal of generic type info at runtime
```

---

---

## 🔹 Why primitives not allowed?

```text id="g26"
Generics work only with objects
```

---

---

## 🔹 Difference: Generic Class vs Method?

```text id="g27"
Class → whole class generic  
Method → only specific method generic  
```

---

---

# 🚀 **Final Summary**

---

* Generics = type-safe reusable code
* Works only with reference types
* Removes runtime casting issues
* Uses type erasure internally

---

```text id="g28"
Generics = Safety + Reusability + Clean Code
```

---

👉 Generics are heavily used in **Collections, Streams, and APIs**

---
