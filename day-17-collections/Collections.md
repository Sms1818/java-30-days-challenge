# ***Java Collections Framework (JCF)***

---

# 🔥 **What is Java Collection Framework?**

---

## **Definition**

The Java Collection Framework (JCF) is a **set of interfaces and classes that provide ready-made data structures and algorithms** to store, manipulate, and process groups of objects efficiently.

---

# 🧠 **Core Idea**

```text id="jcf1"
Collection Framework = Data Structures + Algorithms + Standard Interfaces
```

---

# 🔥 **Why Collection Framework?**

---

✔ No need to implement data structures manually
✔ Improves code reusability
✔ Dynamic resizing (unlike arrays)
✔ Built-in algorithms (sorting, searching)
✔ Standardized API

---

---

# 🔥 **Real-World Analogy**

---

```text id="jcf2"
Library System:
Books = Data  
Shelves = Data Structures  
Catalog System = Collection Framework
```

---

👉 JCF organizes and manages data efficiently

---

---

# 🔥 **Hierarchy Overview**

---

```text id="jcf3"
Iterable
   ↓
Collection (Interface)
   ↓
-------------------------------------
|        |        |        |         |
List     Set     Queue   Deque     (Map - separate)
```

---

## ❗ **Important Note**

```text id="jcf4"
Map is NOT part of Collection interface
```

---

---

# 🔥 **Core Interfaces**

---

## 🔹 **1. Collection Interface**

---

### **Definition**

The root interface of JCF representing a group of objects.

---

### **Common Methods**

---

| Method     | Description        |
| ---------- | ------------------ |
| add()      | Add element        |
| remove()   | Remove element     |
| size()     | Number of elements |
| isEmpty()  | Check empty        |
| contains() | Search element     |

---

---

## 🔹 **2. List Interface**

---

### **Definition**

An **ordered collection** that allows **duplicates** and supports **index-based access**.

---

### **Key Features**

✔ Maintains insertion order
✔ Allows duplicates
✔ Index-based access

---

### **Examples**

* ArrayList
* LinkedList
* Vector
* Stack

---

---

## 🔹 **3. Set Interface**

---

### **Definition**

A collection that **does NOT allow duplicate elements**.

---

### **Key Features**

✔ No duplicates
✔ Unordered (generally)

---

### **Examples**

* HashSet
* LinkedHashSet
* TreeSet

---

---

## 🔹 **4. Queue Interface**

---

### **Definition**

A collection used to **process elements in FIFO (First-In-First-Out)** order.

---

### **Examples**

* PriorityQueue
* LinkedList

---

---

## 🔹 **5. Deque Interface**

---

### **Definition**

A double-ended queue allowing insertion/removal from both ends.

---

### **Examples**

* ArrayDeque
* LinkedList

---

---

## 🔹 **6. Map Interface (Separate)**

---

### **Definition**

A data structure that stores **key-value pairs**, where keys are unique.

---

### **Key Features**

✔ Key → unique
✔ Value → duplicates allowed

---

### **Examples**

* HashMap
* LinkedHashMap
* TreeMap
* Hashtable

---

---

# 🔥 **Implementation Classes**

---

## 🔹 **List Implementations**

| Class      | Feature              |
| ---------- | -------------------- |
| ArrayList  | Dynamic array        |
| LinkedList | Doubly linked list   |
| Vector     | Thread-safe (legacy) |
| Stack      | LIFO                 |

---

---

## 🔹 **Set Implementations**

| Class         | Feature         |
| ------------- | --------------- |
| HashSet       | No order        |
| LinkedHashSet | Insertion order |
| TreeSet       | Sorted          |

---

---

## 🔹 **Queue / Deque**

| Class         | Feature        |
| ------------- | -------------- |
| PriorityQueue | Priority-based |
| ArrayDeque    | Faster deque   |

---

---

## 🔹 **Map Implementations**

| Class         | Feature         |
| ------------- | --------------- |
| HashMap       | Fast, no order  |
| LinkedHashMap | Maintains order |
| TreeMap       | Sorted          |
| Hashtable     | Thread-safe     |

---

---

# 🔥 **Utility Classes**

---

## 🔹 **Collections Class**

---

### **Definition**

A utility class that provides **methods for sorting, searching, and manipulating collections**.

---

### **Examples**

```java id="jcf5"
Collections.sort(list);
Collections.reverse(list);
Collections.max(list);
```

---

---

## 🔹 **Iterator**

---

### **Definition**

Used to traverse elements in a collection.

---

```java id="jcf6"
Iterator<Integer> it = list.iterator();

while (it.hasNext()) {
    System.out.println(it.next());
}
```

---

---

## 🔹 **Comparator vs Comparable**

---

| Feature | Comparable       | Comparator      |
| ------- | ---------------- | --------------- |
| Package | java.lang        | java.util       |
| Method  | compareTo()      | compare()       |
| Usage   | Natural ordering | Custom ordering |

---

---

# 🔥 **Concurrency Collections**

---

## **Definition**

Thread-safe collections designed for **multi-threaded environments**.

---

### **Examples**

* ConcurrentHashMap
* CopyOnWriteArrayList
* BlockingQueue

---

---

# 🔥 **Example (Basic Usage)**

---

```java id="jcf7"
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        for (String lang : list) {
            System.out.println(lang);
        }
    }
}
```

---

---

# 🔥 **Important Concepts**

---

## 🔹 **Dynamic Resizing**

```text id="jcf8"
Collections grow automatically (unlike arrays)
```

---

## 🔹 **Generics**

```text id="jcf9"
List<String> → Type safety
```

---

## 🔹 **Performance**

```text id="jcf10"
Different structures → different performance
```

---

---

# 🔥 **Common Mistakes**

---

❌ Confusing List and Set
❌ Using wrong collection type
❌ Ignoring performance differences

---

---

# 🚀 **Quick Summary**

---

* Collection → group of objects
* List → ordered, duplicates
* Set → unique elements
* Map → key-value pairs
* Queue → FIFO

---

```text id="jcf11"
Choose collection based on:
Order + Duplicates + Performance
```

---

👉 JCF = **standard way to manage data efficiently**

---
