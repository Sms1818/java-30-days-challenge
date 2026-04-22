# ***Java Streams API***

---

# 🔥 **What is Stream?**

---

## **Definition**

A Stream in Java is a **sequence of elements used to process data in a declarative and functional style** 

---

## 🧠 **Core Idea**

```text
Stream = Data + Pipeline of Operations
```

---

👉 You don’t manipulate data manually
👉 You describe **what to do, not how**

---

---

# 🔥 **Key Characteristics**

---

```text
Not a data structure  
Does not store data  
Processes data from source  
Immutable (original data not modified)  
Supports chaining (pipeline)  
```

---

---

# 🔥 **Stream vs Collection**

---

| Feature      | Collection | Stream     |
| ------------ | ---------- | ---------- |
| Storage      | Yes        | No         |
| Modification | Direct     | No         |
| Style        | Imperative | Functional |
| Traversal    | External   | Internal   |

---

---

# 🔥 **How to Create Streams**

---

## 🔹 From Collection

```java
List<Integer> list = List.of(1, 2, 3, 4);

list.stream();
```

---

## 🔹 From Array

```java
int[] arr = {1, 2, 3};

Arrays.stream(arr);
```

---

## 🔹 Using Stream.of()

```java
Stream<String> stream = Stream.of("A", "B", "C");
```

---

## 🔹 Infinite Stream

```java
Stream<Integer> nums = Stream.generate(() -> 1);
```

---

---

# 🔥 **Stream Pipeline**

---

```text
Source → Intermediate Operations → Terminal Operation
```

---

## 🔹 Example

```java
List<Integer> list = List.of(1, 2, 3, 4, 5);

list.stream()
    .filter(x -> x % 2 == 0)
    .map(x -> x * x)
    .forEach(System.out::println);
```

---

---

# 🔥 **Types of Operations**

---

# 🔹 **1. Intermediate Operations**

---

## **Definition**

Operations that **transform a stream and return another stream**

---

```text
Lazy → not executed until terminal operation
```

---

---

## 🔥 **Common Intermediate Operations**

---

### 🔸 filter()

```java
list.stream()
    .filter(x -> x > 2)
```

✔ Uses **Predicate**
✔ Filters data

---

---

### 🔸 map()

```java
list.stream()
    .map(x -> x * 2)
```

✔ Uses **Function**
✔ Transforms data

---

---

### 🔸 sorted()

```java
list.stream()
    .sorted()
```

✔ Natural sorting
✔ Can use Comparator

---

---

### 🔸 distinct()

```java
list.stream()
    .distinct()
```

✔ Removes duplicates

---

---

### 🔸 flatMap()

---

```java
List<List<Integer>> nested = List.of(
    List.of(1, 2),
    List.of(3, 4)
);

nested.stream()
      .flatMap(List::stream)
      .forEach(System.out::println);
```

---

✔ Flattens nested structures

---

---

### 🔸 peek()

```java
list.stream()
    .peek(x -> System.out.println("Processing: " + x))
```

✔ Debugging
✔ Does not modify stream

---

---

# 🔹 **2. Terminal Operations**

---

## **Definition**

Operations that **produce final result and end the stream**

---

---

## 🔥 **Common Terminal Operations**

---

### 🔸 forEach()

```java
list.stream()
    .forEach(System.out::println);
```

✔ Uses **Consumer**

---

---

### 🔸 collect()

```java
List<Integer> result =
    list.stream()
        .filter(x -> x > 2)
        .collect(Collectors.toList());
```

✔ Converts stream → collection

---

---

### 🔸 reduce()

```java
int sum = list.stream()
              .reduce(0, (a, b) -> a + b);
```

✔ Combines elements

---

---

### 🔸 count()

```java
long count = list.stream().count();
```

---

---

### 🔸 findFirst()

```java
Optional<Integer> first =
    list.stream().findFirst();
```

---

---

### 🔸 anyMatch / allMatch

```java
boolean result =
    list.stream().anyMatch(x -> x > 3);
```

---

---

# 🔥 **Lazy Evaluation**

---

## **Definition**

```text
Intermediate operations execute only when terminal operation is called
```

---

## 🔹 Example

```java
List<String> list = List.of("A", "Sam", "John");

list.stream()
    .filter(s -> {
        System.out.println("Filtering: " + s);
        return s.startsWith("S");
    })
    .findFirst();
```

---

👉 Stops early → efficient

---

---

# 🔥 **Functional Interfaces Mapping**

---

| Operation  | Interface |
| ---------- | --------- |
| filter()   | Predicate |
| map()      | Function  |
| forEach()  | Consumer  |
| generate() | Supplier  |

---

---

# 🔥 **Real Example (Complete Pipeline)**

---

```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of(
            "Alice", "Bob", "Andrew", "David"
        );

        List<String> result = names.stream()
            .filter(n -> n.startsWith("A"))
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
```

---

---

# 🔥 **Parallel Streams**

---

```java
list.parallelStream()
    .forEach(System.out::println);
```

---

## ❗ Use Carefully

```text
Not always faster  
Thread overhead exists  
```

---

---

# 🔥 **Advantages of Streams**

---

✔ Less code
✔ Readable
✔ Functional style
✔ Easy parallel processing
✔ Efficient (lazy evaluation)

---

---

# 🔥 **Common Mistakes**

---

❌ Using stream multiple times
❌ Modifying original collection inside stream
❌ Overusing streams for simple tasks

---

---

# 🔥 **Interview Questions**

---

## 🔹 What is Stream?

```text
A sequence of elements processed in pipeline
```

---

---

## 🔹 Difference: map vs flatMap?

```text
map → one-to-one  
flatMap → one-to-many flattening  
```

---

---

## 🔹 Why Streams are lazy?

```text
To improve performance and avoid unnecessary computation
```

---

---

## 🔹 Stream vs Loop?

```text
Stream → declarative  
Loop → imperative  
```

---

---

# 🚀 **Final Summary**

---

* Stream = pipeline processing
* Intermediate = lazy
* Terminal = executes
* Functional interfaces power streams

---

```text
Streams = Clean + Efficient + Functional Programming
```

---

👉 Streams are core for **modern Java + interviews**

---
