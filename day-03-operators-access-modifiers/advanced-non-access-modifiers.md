# ***Advanced Non-Access Modifiers in Java***

---

## **Defination**

These modifiers are used for **advanced concepts** like multithreading, memory management, serialization, and system-level integration.

---

## **Modifiers Covered**

1. synchronized
2. volatile
3. transient
4. native

---

## **1. synchronized**

Used for **thread safety**.

* Prevents multiple threads from accessing a method/block at the same time
* Ensures **data consistency**

---

## **2. volatile**

Used in **multithreading**.

* Ensures variable value is always read from **main memory**
* Avoids caching issues

---

## **3. transient**

Used in **serialization**.

* Prevents variable from being **saved during serialization**
* Used for sensitive data like passwords

---

## **4. native**

Used to call methods written in **other languages (C/C++)**.

* Works with **JNI (Java Native Interface)**

---

## **Important Note**

These modifiers depend on advanced topics:

* synchronized → Multithreading
* volatile → Concurrency
* transient → Serialization
* native → System-level programming

---

## **Learn in Detail Later**

These will be covered in detail when studying:

* Multithreading
* Serialization
* JVM & Memory Model

---

## **Quick Summary**

* synchronized → thread control
* volatile → memory visibility
* transient → skip serialization
* native → external code

---
