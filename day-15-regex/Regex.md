# ***Regular Expressions (Regex) in Java***

---

# 🔥 **What is Regex?**

---

## **Definition**

A Regular Expression (Regex) is a **sequence of characters that defines a search pattern** used for matching, validating, extracting, or manipulating text.

---

# 🧠 **Core Idea**

```text
Regex = Rule (Pattern) to match strings
```

---

# 🔥 **Why Regex?**

---

✔ Validate input (email, phone)
✔ Search patterns in text
✔ Extract data
✔ Replace text
✔ Parse logs

---

# 🔥 **Regex Support in Java**

---

```text
java.util.regex package
```

---

## **Main Classes**

---

| Class                  | Definition                          |
| ---------------------- | ----------------------------------- |
| Pattern                | Compiles regex into executable form |
| Matcher                | Applies regex on input string       |
| PatternSyntaxException | Thrown for invalid regex            |

---

# 🔥 **Pattern Class**

---

## **Definition**

The `Pattern` class is used to **compile a regular expression into a pattern object**.

---

## **Key Methods**

---

| Method                       | Description       |
| ---------------------------- | ----------------- |
| compile(String regex)        | Compiles regex    |
| matcher(CharSequence input)  | Creates matcher   |
| matches(String regex, input) | Checks full match |
| split(input)                 | Splits string     |

---

## **Example**

```java
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("user.*", "username123")); // true
        System.out.println(Pattern.matches("user[0-9]+", "user12a"));  // false
    }
}
```

---

## 🧠 **Important Insight**

```text
Pattern.matches() → matches entire string
```

---

# 🔥 **Matcher Class**

---

## **Definition**

The `Matcher` class is used to **apply a compiled pattern on an input string and perform matching operations**.

---

## 🧠 **Role**

```text
Pattern → defines rule  
Matcher → applies rule
```

---

## **Key Methods**

---

| Method    | Description           |
| --------- | --------------------- |
| find()    | Finds next match      |
| matches() | Matches entire string |
| start()   | Start index           |
| end()     | End index             |
| group()   | Matched substring     |

---

## **Example**

```java
import java.util.regex.*;

public class Test {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("cat");
        Matcher m = p.matcher("catdogcat");

        while (m.find()) {
            System.out.println("Found at: " + m.start() + " to " + (m.end() - 1));
        }
    }
}
```

---

## **Output**

```text
Found at: 0 to 2  
Found at: 6 to 8
```

---

## 🧠 **Key Insight**

```text
find() → multiple matches  
matches() → full match only
```

---

# 🔥 **Difference: Pattern.matches() vs Matcher**

---

| Feature | Pattern.matches() | Matcher.find() | Matcher.matches() |
| ------- | ----------------- | -------------- | ----------------- |
| Scope   | Full string       | Partial        | Full string       |
| Usage   | Simple validation | Searching      | Full validation   |

---

# 🔥 **Character Classes**

---

## **Definition**

Character classes define **a set of characters to match exactly one character from the set**.

---

## **Examples**

```java
System.out.println(Pattern.matches("[a-z]", "h"));      // true
System.out.println(Pattern.matches("[a-zA-Z]", "Hi"));  // false
```

---

## 🧠 **Important Insight**

```text
[a-zA-Z] → matches only ONE character
```

---

# 🔥 **Quantifiers**

---

## **Definition**

Quantifiers specify **how many times a pattern should occur**.

---

## **Examples**

```java
System.out.println(Pattern.matches("\\d{4}", "5678")); // true
System.out.println(Pattern.matches("\\d{4}", "567"));  // false
System.out.println(Pattern.matches("[a-z]+", "hello")); // true
```

---

## 🧠 **Insight**

```text
+ → at least one  
* → zero or more  
```

---

# 🔥 **Special Characters / Metacharacters**

---

## **Examples**

```java
System.out.println(Pattern.matches("\\d+", "9876")); // true
System.out.println(Pattern.matches("\\D+", "Java")); // true
```

---

---

# 🔥 **Full Match vs Partial Match**

---

```java
Pattern.matches("cat", "catdog"); // false

Pattern p = Pattern.compile("cat");
Matcher m = p.matcher("catdog");

System.out.println(m.find()); // true
```

---

# 🔥 **Real-World Examples**

---

## 🔹 **Email Validation**

```java
String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
```

---

## 🔹 **Phone Number**

```java
String regex = "\\d{10}";
```

---

## 🔹 **Password (min 8 chars)**

```java
String regex = ".{8,}";
```

---

# 🔥 **How Regex Works Internally**

---

```text
Pattern compiled  
Matcher scans left → right  
Matches pattern  
Backtracks if needed
```

---

# 🚀 **Quick Summary**

---

* Pattern → defines regex
* Matcher → applies regex
* matches() → full match
* find() → partial match

---

```text
Regex = Pattern + Matching Engine
```

---
