# ***Functional Interfaces in Java – Predicate, Function, Consumer, Supplier***

---

# 🔥 **What are Functional Interfaces?**

---

## **Definition**

A Functional Interface is an interface that contains **exactly one abstract method** and can be used with **lambda expressions**.

---

## 🧠 **Core Idea**

```text id="f1"
Behavior as data → pass logic as argument
```

---

---

# 🔥 **Why These Interfaces?**

---

Before Java 8:

```text id="f2"
We passed objects → not behavior
```

---

After Java 8:

```text id="f3"
We pass functions (lambda expressions)
```

---

---

# 🔥 **4 Core Functional Interfaces**

---

| Interface | Purpose                     |
| --------- | --------------------------- |
| Predicate | Test condition (true/false) |
| Function  | Transform data              |
| Consumer  | Consume (use) data          |
| Supplier  | Produce data                |

---

---

# 🔥 **1. Predicate<T>**

---

## **Definition**

Represents a function that **takes input and returns boolean**.

---

## 🧠 **Method**

```java id="f4"
boolean test(T t)
```

---

---

## 🔥 **Example**

---

```java id="f5"
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(7));  // false
    }
}
```

---

---

## 🔥 **Real Use Case**

---

✔ Filtering data
✔ Conditions

```text id="f6"
Used in: stream.filter()
```

---

---

## 🔥 **Advanced Methods**

---

```java id="f7"
Predicate<Integer> p1 = x -> x > 10;
Predicate<Integer> p2 = x -> x % 2 == 0;

Predicate<Integer> combined = p1.and(p2);

System.out.println(combined.test(12)); // true
```

---

---

# 🔥 **2. Function<T, R>**

---

## **Definition**

Represents a function that **takes input and returns output**.

---

## 🧠 **Method**

```java id="f8"
R apply(T t)
```

---

---

## 🔥 **Example**

---

```java id="f9"
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<Integer, Integer> square = x -> x * x;

        System.out.println(square.apply(5)); // 25
    }
}
```

---

---

## 🔥 **Real Use Case**

---

✔ Data transformation
✔ Mapping

```text id="f10"
Used in: stream.map()
```

---

---

## 🔥 **Advanced Example**

---

```java id="f11"
Function<String, Integer> length = s -> s.length();

System.out.println(length.apply("Hello")); // 5
```

---

---

# 🔥 **3. Consumer<T>**

---

## **Definition**

Represents a function that **takes input but returns nothing**.

---

## 🧠 **Method**

```java id="f12"
void accept(T t)
```

---

---

## 🔥 **Example**

---

```java id="f13"
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer<String> print = s -> System.out.println(s);

        print.accept("Hello");
    }
}
```

---

---

## 🔥 **Real Use Case**

---

✔ Printing
✔ Logging
✔ Performing actions

```text id="f14"
Used in: stream.forEach()
```

---

---

## 🔥 **Advanced Example**

---

```java id="f15"
Consumer<Integer> c = x -> System.out.println(x * 2);

c.accept(5); // 10
```

---

---

# 🔥 **4. Supplier<T>**

---

## **Definition**

Represents a function that **does not take input but returns output**.

---

## 🧠 **Method**

```java id="f16"
T get()
```

---

---

## 🔥 **Example**

---

```java id="f17"
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Double> random = () -> Math.random();

        System.out.println(random.get());
    }
}
```

---

---

## 🔥 **Real Use Case**

---

✔ Object creation
✔ Lazy initialization

```text id="f18"
Used in: stream.generate()
```

---

---

# 🔥 **Quick Comparison **

---

| Interface | Input | Output  |
| --------- | ----- | ------- |
| Predicate | 1     | boolean |
| Function  | 1     | 1       |
| Consumer  | 1     | void    |
| Supplier  | 0     | 1       |

---

---

# 🔥 **Memory Trick**

---

```text id="f19"
Predicate → Test  
Function → Transform  
Consumer → Use  
Supplier → Provide  
```

---

---

# 🔥 **Combined Example**

---

```java id="f20"
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;
        Function<Integer, Integer> square = x -> x * x;
        Consumer<Integer> print = x -> System.out.println(x);
        Supplier<Integer> supply = () -> 100;

        int num = supply.get();

        if (isEven.test(num)) {
            int result = square.apply(num);
            print.accept(result);
        }
    }
}
```

---

---

# 🔥 **Where They Are Used **

---

| Interface | Stream Usage |
| --------- | ------------ |
| Predicate | filter()     |
| Function  | map()        |
| Consumer  | forEach()    |
| Supplier  | generate()   |

---

---

# 🔥 **Interview Questions**

---

## 🔹 What is a functional interface?

```text id="f21"
Interface with one abstract method
```

---

---

## 🔹 Difference between Predicate & Function?

```text id="f22"
Predicate → boolean  
Function → returns value  
```

---

---

## 🔹 Why Consumer returns void?

```text id="f23"
Used for side-effects (printing/logging)
```

---

---

## 🔹 Why Supplier has no input?

```text id="f24"
It only generates data
```

---

---

# 🚀 **Final Summary**

---

* Predicate → condition
* Function → transformation
* Consumer → action
* Supplier → generation

---

```text id="f25"
Streams = Combination of these 4 interfaces
```

---

👉 Forms the foundation for the Streams

---
