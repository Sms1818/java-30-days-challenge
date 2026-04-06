# ***Operators in Java***

---

## **Defination**

Operators in Java are special symbols used to perform operations on variables or values.

---

## **Types of Operators**

1. Arithmetic Operators
2. Unary Operators
3. Assignment Operators
4. Relational Operators
5. Logical Operators
6. Ternary Operator
7. Bitwise Operators
8. instanceof Operator

---

## **1. Arithmetic Operators**

Used for basic calculations.

### **Operators**

`+  -  *  /  %`

### **Example**

```java id="p9z3kx"
int a = 10, b = 3;
System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

---

## **2. Unary Operators**

Operate on single operand.

### **Operators**

`++  --  !`

### **Example**

```java id="o4m8zd"
int a = 10;
System.out.println(a++);
System.out.println(++a);
```

---

## **3. Assignment Operators**

Assign values.

### **Operators**

`=  +=  -=  *=  /=  %=`

### **Example**

```java id="w7q2nb"
int x = 10;
x += 5;
```

---

## **4. Relational Operators**

Used for comparison (returns boolean).

### **Operators**

`==  !=  >  <  >=  <=`

### **Example**

```java id="g1l5ty"
int a = 10, b = 5;
System.out.println(a > b);
```

---

## **5. Logical Operators**

Used with conditions.

### **Operators**

`&&  ||  !`

### **Example**

```java id="k2x8mc"
boolean x = true, y = false;
System.out.println(x && y);
System.out.println(x || y);
```

---

## **6. Ternary Operator**

Shortcut for if-else.

### **Syntax**

```java id="u5v1rn"
condition ? value1 : value2;
```

---

## **7. Bitwise Operators**

Operate on bits.

### **Operators**

`&  |  ^  ~  <<  >>  >>>`

---

## **8. instanceof Operator**

Used for type checking.

### **Example**

```java id="d8q3hv"
String s = "Java";
System.out.println(s instanceof String);
```

---


## **Quick Summary**

* Arithmetic → calculations
* Relational → comparison
* Logical → conditions
* Assignment → value assignment
* Ternary → shortcut if-else
* Bitwise → bit operations

---
