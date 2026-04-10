# ***Parameter Passing in Java***

---

# 🔥 **Definition**

Parameter passing refers to the process of **passing data from one method (caller) to another method (callee)**.

👉 It defines **how values are transferred and how changes affect original data**

---

# 🔥 **Basic Terminology**

---

## **1. Actual Parameters (Arguments)**

👉 Values passed during method call

```java id="pp1"
add(10, 20);
```

👉 `10, 20` → Actual parameters

---

## **2. Formal Parameters**

👉 Variables that receive values in method definition

```java id="pp2"
void add(int a, int b)
```

👉 `a, b` → Formal parameters

---

## 🧠 **Key Understanding**

```text id="pp3"
Caller → passes Actual Parameters  
Method → receives Formal Parameters
```

---

# 🔥 **Types of Parameter Passing**

---

# **1. Pass by Value**

---

## **Definition**

A **copy of the actual value** is passed to the method.

👉 Changes inside method do NOT affect original variable

---

## **Example (Primitive)**

```java id="pp4"
class Test {

    void change(int x){
        x = 100;
    }

    public static void main(String[] args){
        Test obj = new Test();

        int a = 10;
        obj.change(a);

        System.out.println(a);
    }
}
```

---

## **Output**

```text id="pp5"
10
```

---

## **Explanation**

👉 `a = 10`
👉 Copy of `a` is passed → `x = 10`
👉 Change happens only in copy

---

## 🧠 **Key Insight**

```text id="pp6"
Original variable is NOT modified
```

---

# 🔥 **Java is ALWAYS Pass by Value**

---

## **Important Statement (Interview Ready)**

> Java is strictly pass by value — it always passes a copy of the variable.

---

# 🔥 **Then Why Objects Behave Differently?**

---

# **Case: Objects / Arrays**

---

## **Example**

```java id="pp7"
class Test {

    void change(int[] arr){
        arr[0] = 99;
    }

    public static void main(String[] args){
        Test obj = new Test();

        int[] arr = {1, 2, 3};
        obj.change(arr);

        System.out.println(arr[0]);
    }
}
```

---

## **Output**

```text id="pp8"
99
```

---

## 🧠 **Explanation**

👉 Copy of reference is passed
👉 Both refer to SAME object

---

## 🔥 Visualization

```text id="pp9"
Original → reference → object
Copy     → reference → same object
```

---

## 🧠 **Key Insight**

```text id="pp10"
Object changes, reference does NOT change
```

---

# 🔥 **Most Important Confusion**

---

## ❌ Misconception

```text id="pp11"
Java is pass by reference
```

---

## ✅ Reality

```text id="pp12"
Java is pass by value (copy of reference for objects)
```

---

# 🔥 **Tricky Case**

---

```java id="pp13"
class Test {

    void change(int[] arr){
        arr = new int[]{5,5,5};
    }

    public static void main(String[] args){
        Test obj = new Test();

        int[] arr = {1,2,3};
        obj.change(arr);

        System.out.println(arr[0]);
    }
}
```

---

## **Output**

```text id="pp14"
1
```

---

## 🧠 **Explanation**

👉 New array assigned to copied reference
👉 Original reference unchanged

---

# 🔥 **Comparison**

---

| Type      | What is Passed | Effect            |
| --------- | -------------- | ----------------- |
| Primitive | Value copy     | No change         |
| Object    | Reference copy | Object can change |

---

# 🔥 **Call Flow Understanding**

---

```text id="pp15"
Caller → passes value → method  
Method → works on copy → returns  
```

---

# 🔥 **Important Rules**

---

✔ Java is always pass by value
✔ Primitive → copy of value
✔ Object → copy of reference
✔ Cannot change original reference
✔ Can modify object through reference

---

# 🔥 **Common Mistakes**

---

❌ Thinking Java is pass by reference
❌ Confusing object change with reference change
❌ Ignoring copy concept

---

# 🚀 **Quick Summary**

---

* Actual parameters → passed values
* Formal parameters → receiving variables
* Java always passes copies
* Objects behave differently due to references

---

👉 Parameter Passing = **copy mechanism, not direct access**

---
