# ***Strings in Java***

---

## **Definition**

A `String` in Java is an **object** that represents a sequence of characters enclosed in double quotes.

```java id="s1"
String str = "Hello";
```

---

## **Key Characteristics**

* Strings are **immutable** (cannot be modified after creation)
* Stored in **heap memory**
* Uses **UTF-16 encoding**
* Stored in **String Constant Pool** (for literals)
* Implements **CharSequence interface**
* Provides many built-in methods for manipulation

---

## **Ways to Create String**

---

### **1. Using String Literal**

```java id="s2"
String s1 = "Java";
```

👉 Stored in **String Constant Pool**
👉 Reuses existing object → memory efficient

---

### **2. Using new Keyword**

```java id="s3"
String s2 = new String("Java");
```

👉 Creates:

* Object in **heap**
* Literal in **String Pool (if not present)**

---

## **String Immutability**

---

### **Definition**

Once a String object is created, its value **cannot be changed**.

---

### **Example**

```java id="s4"
String s = "Hello";

s.concat(" World");

System.out.println(s); // Hello
```

👉 A new object is created, original remains unchanged.

---

### **Reason (Interview)**

* Security
* Thread safety
* String Pool optimization
* HashMap key reliability

---

## **String Constant Pool**

---

### **Definition**

A special area inside heap where **unique string literals are stored**.

---

### **Example**

```java id="s5"
String s1 = "Java";
String s2 = "Java";

System.out.println(s1 == s2); // true
```

---

## **== vs equals()**

---

### **== Operator**

* Compares memory reference

```java id="s6"
String a = "Hello";
String b = "Hello";

System.out.println(a == b); // true
```

---

### **equals() Method**

* Compares content

```java id="s7"
String a = new String("Hello");
String b = new String("Hello");

System.out.println(a.equals(b)); // true
```

---

# **Mutable String Classes**

👉 To overcome immutability, Java provides:

* `StringBuilder`
* `StringBuffer`

---

## **StringBuilder (Very Important)**

---

### **Definition**

`StringBuilder` is a **mutable sequence of characters**.

👉 Unlike String, it can be modified without creating new objects.

---

### **Key Characteristics**

* Mutable
* Not thread-safe
* Faster than StringBuffer
* Used in **single-threaded environments**

---

### **Syntax**

```java id="sb1"
StringBuilder sb = new StringBuilder("Hello");
```

---

### **Example (Modification)**

```java id="sb2"
StringBuilder sb = new StringBuilder("Hello");

sb.append(" World");

System.out.println(sb); // Hello World
```

---

### **Important Methods**

#### **append()**

```java id="sb3"
sb.append(" Java");
```

---

#### **insert()**

```java id="sb4"
sb.insert(5, " World");
```

---

#### **replace()**

```java id="sb5"
sb.replace(0, 5, "Hi");
```

---

#### **delete()**

```java id="sb6"
sb.delete(0, 2);
```

---

#### **reverse()**

```java id="sb7"
sb.reverse();
```

---

### **Performance Insight**

```java id="sb8"
String s = "Hello";

for(int i = 0; i < 1000; i++){
    s += "a"; // slow (new object every time)
}
```

```java id="sb9"
StringBuilder sb = new StringBuilder("Hello");

for(int i = 0; i < 1000; i++){
    sb.append("a"); // fast
}
```

---

## **StringBuffer (Very Important)**

---

### **Definition**

`StringBuffer` is also a **mutable sequence of characters**, but it is **thread-safe**.

---

### **Key Characteristics**

* Mutable
* Thread-safe (synchronized)
* Slower than StringBuilder
* Used in **multi-threaded environments**

---

### **Syntax**

```java id="sbf1"
StringBuffer sb = new StringBuffer("Hello");
```

---

### **Example**

```java id="sbf2"
StringBuffer sb = new StringBuffer("Hello");

sb.append(" World");

System.out.println(sb); // Hello World
```

---

### **Why Slower?**

👉 Because methods are **synchronized**, which adds overhead.

---

## **String vs StringBuilder vs StringBuffer**

---

| Feature     | String     | StringBuilder | StringBuffer |
| ----------- | ---------- | ------------- | ------------ |
| Mutability  | Immutable  | Mutable       | Mutable      |
| Thread-safe | Yes        | No            | Yes          |
| Performance | Slow       | Fastest       | Slower       |
| Use case    | Fixed text | Single thread | Multi-thread |

---

## **When to Use What (Interview)**

* Use **String** → when data is constant
* Use **StringBuilder** → frequent modifications (best performance)
* Use **StringBuffer** → multi-threaded environment

---

## **Common String Methods**

---

### **length()**

```java id="s8"
String s = "Hello";
System.out.println(s.length());
```

---

### **charAt()**

```java id="s9"
System.out.println(s.charAt(1));
```

---

### **substring()**

```java id="s10"
System.out.println(s.substring(1, 4));
```

---

### **replace()**

```java id="s11"
System.out.println(s.replace("l", "x"));
```

---

### **split()**

```java id="s12"
String[] arr = "a,b,c".split(",");
```

---

## **Advantages**

* Easy to use
* Rich API
* Memory optimization via String Pool

---

## **Disadvantages**

* Immutable → inefficient for frequent changes
* Creates multiple objects

---

## **Quick Summary**

* String = immutable
* StringBuilder = mutable + fast
* StringBuffer = mutable + thread-safe
* Prefer StringBuilder in most cases

---


