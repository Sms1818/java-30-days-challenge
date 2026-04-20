# ***List Interface in Java***

---

# 🔥 **What is List?**

---

## **Definition**

List is an **ordered collection** that allows **duplicate elements** and supports **index-based access**.

---

# 🧠 **Core Properties**

```text id="l1"
Ordered → Maintains insertion order  
Duplicates → Allowed  
Index-based → Yes  
Null → Allowed  
```

---

# 🔥 **Common Implementations**

---

* ArrayList
* LinkedList
* Vector (legacy)
* Stack (legacy)

---

---

# 🔥 **1. ArrayList**

---

## 🔹 **Definition**

ArrayList is a **resizable array implementation of List**.

---

## 🧠 **Internal Structure**

```text id="l2"
Dynamic Array
```

---

## 🔥 **How ArrayList Works Internally**

---

### 🔹 **Initial Capacity**

```text id="l3"
Default capacity = 10
```

---

### 🔹 **Adding Elements**

```text id="l4"
Elements stored in internal array
```

---

### 🔹 **When Capacity is Full**

```text id="l5"
New capacity = old + (old / 2)
```

---

👉 Example:

```text id="l6"
10 → 15 → 22 → 33 → ...
```

---

### 🔹 **Resize Process**

```text id="l7"
1. New larger array created  
2. Old elements copied  
3. Reference updated  
```

---

## ❗ **Important Insight**

```text id="l8"
Resizing is costly → O(n)
```

---

---

## 🔥 **Time Complexity**

---

| Operation       | Complexity |
| --------------- | ---------- |
| Access          | O(1)       |
| Insert (end)    | O(1)*      |
| Insert (middle) | O(n)       |
| Delete          | O(n)       |

---

👉 `*` Amortized O(1)

---

---

## 🔥 **Memory Behavior**

---

```text id="l9"
Extra unused capacity may exist
```

---

👉 Tradeoff: speed vs memory

---

---

## 🔥 **When to Use ArrayList**

---

✔ Frequent reads
✔ Less insertion/deletion
✔ Index-based operations

---

---

# 🔥 **2. LinkedList**

---

## 🔹 **Definition**

LinkedList is a **doubly linked list implementation of List**.

---

## 🧠 **Internal Structure**

```text id="l10"
Node → [prev | data | next]
```

---

## 🔥 **How LinkedList Works**

---

### 🔹 **Insertion**

```text id="l11"
Update pointers only
```

---

### 🔹 **Deletion**

```text id="l12"
No shifting required
```

---

---

## 🔥 **Time Complexity**

---

| Operation | Complexity |
| --------- | ---------- |
| Access    | O(n)       |
| Insert    | O(1)       |
| Delete    | O(1)       |

---

---

## ❗ **Important Insight**

```text id="l13"
Access is slow because traversal is required
```

---

---

## 🔥 **When to Use LinkedList**

---

✔ Frequent insert/delete
✔ No need for index access

---

---

# 🔥 **3. Vector (Legacy)**

---

## 🔹 **Definition**

Vector is a **synchronized version of ArrayList**.

---

## ❗ **Internal Behavior**

```text id="l14"
All methods are synchronized
```

---

## ❗ **Problem**

```text id="l15"
Slower due to locking
```

---

👉 Rarely used

---

---

# 🔥 **4. Stack (Legacy)**

---

## 🔹 **Definition**

Stack follows:

```text id="l16"
LIFO → Last In First Out
```

---

👉 Prefer `ArrayDeque` instead

---

---

# 🔥 **ArrayList vs LinkedList**

---

| Feature   | ArrayList | LinkedList            |
| --------- | --------- | --------------------- |
| Structure | Array     | Doubly Linked List    |
| Access    | Fast O(1) | Slow O(n)             |
| Insert    | Slow      | Fast                  |
| Memory    | Less      | More (extra pointers) |

---

---

# 🔥 **Internal Behavior Comparison**

---

```text id="l17"
ArrayList → shifting elements  
LinkedList → pointer manipulation
```

---

---

# 🔥 **Edge Cases / Interview Points**

---

## 🔹 1. Why ArrayList is faster?

```text id="l18"
Continuous memory → fast access
```

---

## 🔹 2. Why LinkedList is slower?

```text id="l19"
No direct index access → traversal required
```

---

## 🔹 3. Why ArrayList resize is costly?

```text id="l20"
Copying entire array
```

---

## 🔹 4. Why LinkedList uses more memory?

```text id="l21"
Extra pointers (prev + next)
```

---

---

# 🔥 **Code Example**

---

```java id="l22"
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(1)); // 20
    }
}
```

---

---

# 🚀 **Final Summary**

---

* List = ordered + duplicates
* ArrayList = fast access
* LinkedList = fast insertion
* Vector = thread-safe (slow)

---

```text id="l23"
Choose based on:
Access vs Modification
```

---

👉 List is about **order + flexibility**, choose implementation wisely

---
