# ***Set Interface in Java ***

---

# 🔥 **What is Set?**

---

## **Definition**

Set is a collection that **does NOT allow duplicate elements** and stores **unique values only**.

---

# 🧠 **Core Properties**

```text id="s1"
Duplicates → Not allowed  
Order → Depends on implementation  
Null → Allowed (only one in HashSet)  
```

---

# 🔥 **How Set Prevents Duplicates**

---

```text id="s2"
Uses equals() and hashCode()
```

---

👉 Two elements are considered duplicates if:

```text id="s3"
hashCode same + equals() returns true
```

---

---

# 🔥 **Main Implementations**

---

* HashSet
* LinkedHashSet
* TreeSet

---

---

# 🔥 **1. HashSet**

---

## 🔹 **Definition**

HashSet is an **unordered collection that uses hashing to store unique elements**.

---

## 🧠 **Internal Structure**

```text id="s4"
HashSet → internally uses HashMap
```

---

### Internal Code Idea:

```java id="s5"
map.put(element, PRESENT);
```

---

👉 Only keys are stored
👉 Value is dummy object

---

---

## 🔥 **How HashSet Works Internally**

---

### 🔹 Step-by-Step Process

```text id="s6"
1. hashCode() of element  
2. Convert to index (bucket)  
3. Store element in bucket  
4. If collision → store in list/tree  
```

---

---

## 🔥 **Collision Handling**

---

```text id="s7"
Same index → multiple elements
```

---

### Before Java 8:

```text id="s8"
LinkedList
```

---

### After Java 8:

```text id="s9"
If size > 8 → Red-Black Tree
```

---

---

## 🔥 **Time Complexity**

---

| Operation | Complexity |
| --------- | ---------- |
| Add       | O(1)       |
| Remove    | O(1)       |
| Search    | O(1)       |

---

👉 Worst case → O(n)

---

---

## ❗ **Important Insights**

---

```text id="s10"
Order is NOT guaranteed
```

---

```text id="s11"
Only one null allowed
```

---

---

## 🔥 **When to Use HashSet**

---

✔ Fast lookup
✔ No duplicates needed
✔ Order not important

---

---

# 🔥 **2. LinkedHashSet**

---

## 🔹 **Definition**

LinkedHashSet is a HashSet that **maintains insertion order**.

---

## 🧠 **Internal Structure**

```text id="s12"
Hash table + Doubly Linked List
```

---

---

## 🔥 **How It Works**

---

```text id="s13"
HashMap logic + linked list for order
```

---

👉 Elements stored in order of insertion

---

---

## 🔥 **Time Complexity**

---

| Operation | Complexity |
| --------- | ---------- |
| Add       | O(1)       |
| Remove    | O(1)       |

---

---

## ❗ **Important Insight**

---

```text id="s14"
Slightly slower than HashSet due to ordering
```

---

---

## 🔥 **When to Use**

---

✔ Maintain insertion order
✔ Still want fast operations

---

---

# 🔥 **3. TreeSet**

---

## 🔹 **Definition**

TreeSet is a Set that stores elements in **sorted order**.

---

## 🧠 **Internal Structure**

```text id="s15"
Red-Black Tree (Self-balancing BST)
```

---

---

## 🔥 **How TreeSet Works**

---

```text id="s16"
Elements inserted in sorted position
```

---

👉 Uses:

```text id="s17"
Comparable or Comparator
```

---

---

## 🔥 **Time Complexity**

---

| Operation | Complexity |
| --------- | ---------- |
| Add       | O(log n)   |
| Remove    | O(log n)   |
| Search    | O(log n)   |

---

---

## ❗ **Important Insights**

---

```text id="s18"
No null allowed (throws exception)
```

---

```text id="s19"
Maintains sorted order automatically
```

---

---

## 🔥 **When to Use TreeSet**

---

✔ Sorted data
✔ Range queries
✔ Ordered traversal

---

---

# 🔥 **Comparison Table (VERY IMPORTANT)**

---

| Feature     | HashSet | LinkedHashSet | TreeSet     |
| ----------- | ------- | ------------- | ----------- |
| Order       | No      | Insertion     | Sorted      |
| Structure   | Hash    | Hash + List   | Tree        |
| Performance | Fast    | Medium        | Slower      |
| Null        | Allowed | Allowed       | Not allowed |

---

---

# 🔥 **Internal Behavior Summary**

---

```text id="s20"
HashSet → HashMap  
LinkedHashSet → HashMap + LinkedList  
TreeSet → TreeMap (Red-Black Tree)
```

---

---

# 🔥 **Edge Cases / Interview Points**

---

## 🔹 1. Why duplicates are not allowed?

```text id="s21"
Because of hashCode + equals check
```

---

## 🔹 2. Why TreeSet is slower?

```text id="s22"
Tree operations (log n)
```

---

## 🔹 3. Why LinkedHashSet exists?

```text id="s23"
To maintain insertion order
```

---

## 🔹 4. Why HashSet is fastest?

```text id="s24"
Direct hashing (O(1))
```

---

---

# 🔥 **Code Example**

---

```java id="s25"
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored

        System.out.println(set);
    }
}
```

---

---

# 🚀 **Final Summary**

---

* Set = unique elements
* HashSet = fastest
* LinkedHashSet = ordered
* TreeSet = sorted

---

```text id="s26"
Choose based on:
Order + Sorting + Performance
```

---

👉 Set is about **uniqueness + behavior control**

---
