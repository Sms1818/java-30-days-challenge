# ***Array vs ArrayList in Java***

---

## **Array in Java**

---

## **Definition**

An array is a **fixed-size data structure** used to store elements of the **same data type** in contiguous memory locations.

---

## **Key Characteristics**

* Fixed size (cannot grow or shrink)
* Stores **primitive + object types**
* Fast access → **O(1)**
* Stored in **heap memory**
* Uses index → `arr[i]`

---

## **Example**

```java id="arrvs1"
int[] arr = new int[3];

arr[0] = 10;
arr[1] = 20;
arr[2] = 30;

System.out.println(arr[1]); // 20
```

---

## **Limitations**

* Size is fixed
* No built-in methods (manual operations required)
* Insertion/deletion costly

---

# **ArrayList in Java**

---

## **Definition**

`ArrayList` is a **dynamic array** from the **Java Collections Framework** that can grow and shrink automatically.

---

## **Key Characteristics**

* Dynamic size
* Only stores **objects (not primitives directly)**
* Provides built-in methods
* Stored in **heap memory**
* Uses methods like `add()`, `get()`, `remove()`

---

## **Import Statement**

```java id="arrvs2"
import java.util.ArrayList;
```

---

## **Example**

```java id="arrvs3"
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(1)); // 20
    }
}
```

---

## **Important Note (Autoboxing)**

```java id="arrvs4"
ArrayList<Integer> list = new ArrayList<>();

list.add(10); // int → Integer (auto-boxing)
```

👉 ArrayList cannot store primitives directly.

---

# **Internal Working Difference (Very Important)**

---

## **Array**

* Stores elements in **contiguous memory**
* Fixed size → memory allocated once
* Direct access using index

---

## **ArrayList**

* Internally uses a **resizable array**
* Default capacity (usually 10)
* When full:

  * Creates a new array
  * Copies old elements
  * Increases size (~1.5x)

---

## **Example of Dynamic Growth**

```java id="arrvs5"
ArrayList<Integer> list = new ArrayList<>();

for(int i = 0; i < 15; i++){
    list.add(i);
}
```

👉 Internally:

* Old array → copied into bigger array

---

# **Code Comparison (Array vs ArrayList)**

---

```java id="arrvs6"
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        // Array
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;

        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        System.out.println(arr[0]);      // 1
        System.out.println(list.get(0)); // 1
    }
}
```

---

# **Difference Table (Interview Critical)**

| Feature         | Array               | ArrayList        |
| --------------- | ------------------- | ---------------- |
| Size            | Fixed               | Dynamic          |
| Data Type       | Primitive + Object  | Only Objects     |
| Performance     | Faster              | Slightly slower  |
| Memory          | Static allocation   | Dynamic resizing |
| Methods         | No built-in methods | Many methods     |
| Access          | arr[i]              | list.get(i)      |
| Add Elements    | Manual              | add()            |
| Remove Elements | Manual              | remove()         |
| Generics        | Not supported       | Supported        |

---

# **Advantages**

---

## **Array**

* Faster access
* Less memory overhead
* Simple structure

---

## **ArrayList**

* Dynamic size
* Easy to use
* Built-in methods

---

# **Disadvantages**

---

## **Array**

* Fixed size
* Difficult insertion/deletion

---

## **ArrayList**

* Slower than array
* Uses more memory
* Cannot store primitives directly

---

# **When to Use What**

---

* Use **Array**:

  * When size is fixed
  * When performance is critical

* Use **ArrayList**:

  * When size is dynamic
  * When frequent insertion/deletion is needed

---

## **Quick Summary**

---

* Array → fixed size, fast
* ArrayList → dynamic, flexible
* ArrayList internally uses array
* Key difference = **size + flexibility + methods**

---


