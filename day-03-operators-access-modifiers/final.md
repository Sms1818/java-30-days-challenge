# Final Keyword in Java


The `final` keyword in Java is a **non-access modifier** used to restrict modification. It can be applied to:

* Variables → value cannot change
* Methods → cannot be overridden
* Classes → cannot be extended

It is commonly used to create constants, enforce immutability, and control inheritance.

---

## Characteristics of `final`

* Final variables can be assigned only once.
* Final methods cannot be overridden.
* Final classes cannot be extended.
* A final variable must be initialized exactly once.
* A final reference cannot change the object it points to, but the object itself can change.
* `static final` variables act as constants.
* Blank final variables must be initialized before use.

---

## 1. Final Variable

A variable declared with `final` becomes constant after assignment.

```java
public class Geeks {
    public static void main(String[] args) {
        final double PI = 3.14159;
        System.out.println("Value of PI: " + PI);
    }
}
```

### Output

```
Value of PI: 3.14159
```

---

## Types of Final Variables

### 1. Normal Final Variable

```java
final int THRESHOLD = 5;
```

### 2. Blank Final Variable

```java
final int THRESHOLD;
```

* Must be initialized before use (constructor/block)

---

### 3. Static Final Variable

```java
static final double PI = 3.141592653589793;
```

* Shared across all objects

---

### 4. Static Blank Final Variable

```java
static final double PI;

static {
    PI = 3.141592653589793;
}
```

---

## Reference Final Variable

```java
class Test {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        sb.append("World");
        System.out.println(sb);
    }
}
```

### Output

```
Hello
HelloWorld
```

**Explanation:**

* Reference cannot change
* Object content can change

---

## Reassigning Final Variable (Error)

```java
class Test {
    static final int CAPACITY = 4;

    public static void main(String[] args) {
        CAPACITY = 5; // compile-time error
    }
}
```

---

## Local Final Variable

```java
class Test {
    public static void main(String[] args) {
        final int i;
        i = 20;
        System.out.println(i);
    }
}
```

### Output

```
20
```

---

## 2. Final Class

A class declared as `final` cannot be extended.

```java
final class A {
}

// Error
class B extends A { }
```

Used in immutable classes like `String`.

---

## 3. Final Method

A method declared as `final` cannot be overridden.

```java
class A {
    final void m1() {
        System.out.println("Final method");
    }
}

class B extends A {
    void m1() { } // compile-time error
}
```

---

## Advantages of `final`

* Ensures immutability
* Prevents accidental modification
* Improves code safety and predictability
* Helps JVM optimizations
* Protects API design (no overriding/extension)

---

**Key Rule:**

> A `final` entity can be assigned only once or cannot be modified depending on its type.
