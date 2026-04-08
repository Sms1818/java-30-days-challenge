# ***Scope of Variables in Java (Deep Dive)***

---

## **Definition**

Scope of a variable defines the **region of code where the variable is accessible and valid**.

👉 In Java, scope is **lexical (static)**
→ Determined at **compile time**, not runtime 

---

## **Core Idea**

👉 Scope is controlled by:

* **Curly braces `{}`**
* **Class structure**
* **Method boundaries**

---

# 🔥 Types of Variable Scope

---

# **1. Instance Variable (Object-Level Scope)**

---

## **Definition**

Variables declared inside a class but **outside methods/constructors**.

```java id="inst1"
class Test {
    int x = 10; // instance variable
}
```

---

## **Key Characteristics**

* Each object gets its **own copy**
* Stored in **heap memory**
* Accessible throughout the class
* Can be accessed using object reference

---

## **Memory Insight**

```text id="mem1"
Object1 → x = 10
Object2 → x = 10 (separate copy)
```

---

## **Access Scope**

Depends on **access modifiers**:

| Modifier  | Same Class | Package | Subclass | Outside |
| --------- | ---------- | ------- | -------- | ------- |
| public    | ✅          | ✅       | ✅        | ✅       |
| protected | ✅          | ✅       | ✅        | ❌       |
| default   | ✅          | ✅       | ❌        | ❌       |
| private   | ✅          | ❌       | ❌        | ❌       |

---

# **2. Static Variable (Class-Level Scope)**

---

## **Definition**

Declared using `static` keyword and **shared across all objects**.

```java id="stat1"
class Test {
    static int x = 10;
}
```

---

## **Key Characteristics**

* Only **one copy exists**
* Stored in **method area**
* Accessed via class name

```java id="stat2"
System.out.println(Test.x);
```

---

## **Memory Insight**

```text id="mem2"
Class → x = 10 (shared)
```

---

## **When to Use**

👉 When value is **common for all objects**

---

# **3. Local Variable (Method Scope)**

---

## **Definition**

Declared inside a method/block.

```java id="loc1"
void display(){
    int x = 10;
}
```

---

## **Key Characteristics**

* Exists only during method execution
* Stored in **stack memory**
* No default value → must initialize

---

## ❗ Important Rule

```java id="loc2"
int x;
System.out.println(x); // ❌ error
```

---

## **Lifecycle**

```text id="life1"
Method starts → variable created  
Method ends → variable destroyed
```

---

# **4. Parameter Scope**

---

## **Definition**

Variables passed as parameters to methods.

```java id="par1"
void setX(int x){
    this.x = x;
}
```

---

## **Key Insight**

👉 Parameter shadows instance variable

---

## **Why `this` is used**

```java id="par2"
this.x = x;
```

| Variable | Meaning           |
| -------- | ----------------- |
| x        | parameter         |
| this.x   | instance variable |

---

# **5. Block Scope**

---

## **Definition**

Variables declared inside `{}` are only accessible inside that block.

```java id="blk1"
if(true){
    int x = 10;
}
```

---

## ❗ Outside Access

```java id="blk2"
System.out.println(x); // ❌ error
```

---

## **Nested Block Rule (Important Trap)**

```java id="blk3"
{
    int x = 5;
    {
        int x = 10; // ❌ error in Java
    }
}
```

👉 Java does NOT allow redeclaration in nested blocks 

---

# 🔥 Loop Scope (Important Interview Trap)

---

## ❗ Example

```java id="loop1"
for(int i = 0; i < 5; i++){
    System.out.println(i);
}

System.out.println(i); // ❌ error
```

---

## **Correct Way**

```java id="loop2"
int i;
for(i = 0; i < 5; i++){
}
System.out.println(i); // ✅
```

---

# 🔥 Variable Shadowing (Very Important)

---

## **Definition**

When a local variable has same name as instance variable.

```java id="sh1"
class Test {
    int x = 10;

    void show(){
        int x = 20;
        System.out.println(x); // 20
    }
}
```

---

## **Access Instance Variable**

```java id="sh2"
System.out.println(this.x); // 10
```

---

# 🔥 Complete Example (All Scopes Together)

```java id="full1"
class Demo {

    int instanceVar = 10;
    static int staticVar = 100;

    void show(int paramVar){

        int localVar = 20;

        System.out.println(instanceVar);
        System.out.println(staticVar);
        System.out.println(paramVar);
        System.out.println(localVar);

        if(localVar > 10){
            int blockVar = 5;
            System.out.println(blockVar);
        }
    }
}
```

---

# 🧠 Important Rules

---

## **1. Scope is defined by `{}`**

---

## **2. Local > Instance (priority)**

---

## **3. No redeclaration in same scope**

---

## **4. Variable must be declared before use**

---

## **5. Use `this` to resolve ambiguity**

---

# 🔥 Common Mistakes

---

❌ Using local variable without initialization
❌ Accessing variable outside block
❌ Redeclaring variable in same scope
❌ Confusing parameter vs instance variable

---

# 🚀 Quick Summary

---

* Instance → object level
* Static → class level
* Local → method level
* Parameter → method input
* Block → inside `{}`

---

👉 Scope = **visibility + lifetime of variable**

---
