# Singleton Design Pattern in Java

## 📌 Definition

The **Singleton Design Pattern** ensures that a class has **only one instance** and provides a **global access point** to that instance.

It is primarily used when exactly one object is required to coordinate actions across a system.

---

## 🎯 Intent

* Restrict object creation to a single instance
* Provide controlled global access
* Manage shared resources efficiently

---

## 🧠 Real-World Analogy

Think of a **printer spooler**:

* Only one spooler manages all print jobs
* Multiple instances would create conflicts

---

## 🏗️ Core Components

### 1. Private Static Instance

```java
private static Singleton instance;
```

Ensures only one instance is stored.

---

### 2. Private Constructor

```java
private Singleton() {}
```

Prevents external instantiation.

---

### 3. Public Static Access Method

```java
public static Singleton getInstance() {
    if (instance == null) {
        instance = new Singleton();
    }
    return instance;
}
```

Provides global access to the instance.

---

## 🧪 Basic Implementation (Lazy Initialization)

```java
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### ⚠️ Issue

Not thread-safe.

---

## 🔥 Thread Safety Problem

Multiple threads may create multiple instances:

1. Thread A checks instance == null
2. Thread B checks instance == null
3. Both create objects

---

## 🚀 Implementations

### 1. Thread-Safe (Synchronized)

```java
public static synchronized Singleton getInstance() {
    if (instance == null) {
        instance = new Singleton();
    }
    return instance;
}
```

### Pros

* Thread-safe

### Cons

* Slow due to synchronization

---

### 2. Eager Initialization

```java
private static final Singleton instance = new Singleton();

public static Singleton getInstance() {
    return instance;
}
```

### Pros

* Simple
* Thread-safe

### Cons

* Instance created even if not used

---

### 3. Double-Checked Locking

```java
class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

### Pros

* Efficient
* Thread-safe

### Important

* `volatile` prevents instruction reordering

---

### 4. Static Inner Class (Best Practice)

```java
class Singleton {

    private Singleton() {}

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}
```

### Pros

* Lazy initialization
* Thread-safe
* No synchronization overhead

---

### 5. Enum Singleton (Safest)

```java
public enum Singleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Working...");
    }
}
```

### Pros

* Thread-safe
* Protects against serialization and reflection

---

## ⚖️ Comparison Table

| Approach     | Thread Safe | Lazy | Performance |
| ------------ | ----------- | ---- | ----------- |
| Lazy         | ❌           | ✅    | Fast        |
| Synchronized | ✅           | ✅    | Slow        |
| Eager        | ✅           | ❌    | Fast        |
| Double Check | ✅           | ✅    | Fast        |
| Inner Class  | ✅           | ✅    | ⭐ Best      |
| Enum         | ✅           | ❌    | ⭐ Safest    |

---

## ✅ Advantages

* Ensures single instance
* Saves memory
* Centralized control
* Easy access

---

## ❌ Disadvantages

* Global state (tight coupling)
* Hard to test
* Can break in multithreading if done incorrectly

---

## 🎯 Use Cases

* Logging
* Configuration management
* Database connections
* Caching
* Thread pools

---

## 🧠 Interview Questions

### Q1: Why Singleton?

Ensure one instance and shared resource control

### Q2: Best implementation?

Static inner class or enum

### Q3: Why volatile?

Prevents memory consistency issues

### Q4: Problems?

Global state and testing issues

---

## 🔥 Key Takeaway

Use Singleton only when truly needed.

👉 Prefer:

* Static inner class (interviews)
* Enum (production)
