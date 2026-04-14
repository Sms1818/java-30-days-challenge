# ***Java Packages***

---

# 🔥 **Definition**

A package in Java is a mechanism used to **group related classes, interfaces, and sub-packages into a single unit**.

> It helps in organizing code, avoiding naming conflicts, and improving maintainability 

---

# 🧠 **Core Idea**

```text id="pkg1"
Package = Folder for related classes
```

---

# 🔥 **Why Packages?**

---

✔ Avoid naming conflicts
✔ Provide access control
✔ Improve code organization
✔ Enable reusability
✔ Support modular programming

---

# 🔥 **Real-Life Analogy**

---

```text id="pkg2"
Folders in computer:
Documents → Images → Videos
```

👉 Packages organize classes the same way

---

# 🔥 **Types of Packages**

---

## **1. Built-in Packages**

## **2. User-defined Packages**

---

# 🔥 **1. Built-in Packages**

---

## **Definition**

Predefined packages provided by Java

---

## **Common Built-in Packages**

---

| Package     | Description                  |
| ----------- | ---------------------------- |
| java.lang   | Core classes (auto-imported) |
| java.util   | Collections, utilities       |
| java.io     | Input/Output                 |
| java.awt    | GUI components               |
| java.applet | Applet classes               |

---

## **Example**

```java id="pkg3"
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);

        System.out.println(number);
    }
}
```

---

## 🧠 **Explanation**

👉 `Random` class comes from `java.util`
👉 Helps generate random numbers

---

# 🔥 **2. User-Defined Packages**

---

## **Definition**

Packages created by developers

---

## **Creating a Package**

```java id="pkg4"
package com.myapp;

public class Helper {
    public static void show() {
        System.out.println("Hello");
    }
}
```

---

## **Using the Package**

```java id="pkg5"
import com.myapp.Helper;

public class Main {
    public static void main(String[] args) {
        Helper.show();
    }
}
```

---

# 🔥 **Folder Structure**

---

```text id="pkg6"
com/
 └── myapp/
      └── Helper.java
```

---

👉 Package name = folder structure

---

# 🔥 **Ways to Import**

---

## **1. Import Single Class**

```java id="pkg7"
import java.util.Vector;
```

---

## **2. Import All Classes**

```java id="pkg8"
import java.util.*;
```

---

## ❗ Important

```text id="pkg9"
* does NOT import sub-packages
```

---

# 🔥 **Fully Qualified Name**

---

## **Example**

```java id="pkg10"
java.util.ArrayList list = new java.util.ArrayList();
```

---

👉 No need for import

---

# 🔥 **Access Modifiers and Packages**

---

| Modifier  | Same Class | Same Package | Different Package   |
| --------- | ---------- | ------------ | ------------------- |
| private   | ✔          | ❌            | ❌                   |
| default   | ✔          | ✔            | ❌                   |
| protected | ✔          | ✔            | ✔ (via inheritance) |
| public    | ✔          | ✔            | ✔                   |

---

## 🧠 **Key Insight**

👉 Packages control **visibility and access**

---

# 🔥 **Sub-Packages**

---

```text id="pkg11"
java.util
java.util.concurrent
```

---

👉 Sub-packages are **independent**

---

# 🔥 **Static Import**

---

## **Definition**

Import static members directly

---

## **Example**

```java id="pkg12"
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt(16));
    }
}
```

---

👉 No need to write `Math.sqrt()`

---

# 🔥 **Naming Conventions**

---

✔ Use lowercase
✔ Use domain name (reverse)

---

## **Example**

```text id="pkg13"
com.company.project.module
```

---

# 🔥 **Advantages of Packages**

---

✔ Better organization
✔ Avoid naming conflicts
✔ Improved security
✔ Reusability
✔ Easy maintenance

---

# 🔥 **Disadvantages**

---

❌ Slight complexity
❌ Requires proper structure

---

# 🔥 **Common Mistakes**

---

❌ Forgetting package declaration
❌ Incorrect folder structure
❌ Confusing import vs package
❌ Using * for everything

---

# 🔥 **Best Practices**

---

✔ Use meaningful package names
✔ Keep structure clean
✔ Avoid deep nesting
✔ Use static import carefully

---

# 🚀 **Quick Summary**

---

* Package = grouping of classes
* Built-in + user-defined
* Helps in modular design
* Controls access

---

```text id="pkg14"
Packages = Organization + Control + Reusability
```

---

👉 Packages are the **foundation of scalable Java projects**

---
