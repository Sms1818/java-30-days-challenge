# ***Encapsulation in Java***

---

# 🔥 **Definition**

Encapsulation is the process of **wrapping data (variables) and methods (functions) into a single unit (class)**.

> It helps in **data hiding, security, and controlled access to data** 

---

# 🧠 **Core Idea**

```text id="6r9l4n"
Data + Methods = One Unit (Class)
```

👉 Hide internal details
👉 Expose only required functionality

---

# 🔥 **Why Encapsulation?**

---

✔ Protect data from unauthorized access
✔ Control how data is modified
✔ Improve maintainability
✔ Increase code readability

---

# 🔥 **How Encapsulation is Achieved**

---

## **1. Make variables private**

```java id="enc1"
class Student {
    private String name;
}
```

👉 Data cannot be accessed directly

---

## **2. Use Getter Methods**

```java id="enc2"
public String getName() {
    return name;
}
```

👉 Used to **read data**

---

## **3. Use Setter Methods**

```java id="enc3"
public void setName(String name) {
    this.name = name;
}
```

👉 Used to **modify data**

---

# 🔥 **Complete Example**

---

```java id="enc4"
class Programmer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        Programmer p = new Programmer();

        p.setName("Geek");
        System.out.println("Name: " + p.getName());
    }
}
```

---

## **Output**

```text id="enc5"
Name: Geek
```

---

## 🧠 **Explanation**

👉 `name` is private → cannot access directly
👉 Getter & Setter provide controlled access

---

# 🔥 **Encapsulation with Validation**

---

## **Example**

```java id="enc6"
class Account {

    private double balance;

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

---

## 🧠 **Insight**

👉 Encapsulation allows **validation before setting values**

---

# 🔥 **Real-World Analogy**

---

```text id="enc7"
ATM Machine:
You cannot directly access money
You use interface (buttons)
```

👉 Internal data is hidden
👉 Only controlled operations allowed

---

# 🔥 **Data Hiding vs Encapsulation**

---

| Aspect         | Data Hiding            | Encapsulation       |
| -------------- | ---------------------- | ------------------- |
| Meaning        | Restrict direct access | Wrap data + methods |
| Focus          | Security               | Structure           |
| Scope          | Narrow                 | Broad               |
| Implementation | Access modifiers       | Class design        |

---

# 🔥 **Access Modifiers Role**

---

| Modifier | Access            |
| -------- | ----------------- |
| private  | Within class only |
| public   | Everywhere        |

---

## **Example**

```java id="enc8"
class Test {
    private int x;

    public int getX() {
        return x;
    }
}
```

---

# 🔥 **Encapsulation + Immutability**

---

## **Definition**

Make object read-only

---

## **Example**

```java id="enc9"
class Person {

    private final String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

---

## 🧠 **Insight**

👉 No setter → value cannot change

---

# 🔥 **Advantages of Encapsulation**

---

✔ Data hiding
✔ Better security
✔ Improved maintainability
✔ Controlled access
✔ Code reusability

---

# 🔥 **Disadvantages**

---

❌ More code (getters/setters)
❌ Slight performance overhead
❌ Can reduce flexibility

---

# 🔥 **What Encapsulation Prevents**

---

❌ Direct modification of variables
❌ Invalid data assignment
❌ Uncontrolled access

---

# 🔥 **Common Mistakes**

---

❌ Making variables public
❌ Not using validation
❌ Confusing with abstraction
❌ Creating unnecessary getters/setters

---

# 🚀 **Quick Summary**

---

* Encapsulation = data + methods in one unit
* Achieved using private variables
* Access via getters/setters
* Provides data security and control

---

👉 Encapsulation = **data protection + controlled access**

---
