# ***Java Threads***

---

# 🔥 **What is a Thread?**

---

## **Definition**

A Thread in Java is the **smallest unit of execution within a program**.

> It is a lightweight subprocess that runs independently but shares the same memory space with other threads.

---

# 🧠 **Core Idea**

```text
Thread = Independent execution path
```

---

## 🧠 **Key Characteristics**

✔ Lightweight process
✔ Shares memory with other threads
✔ Executes independently
✔ Enables concurrent execution

---

# 🔥 **Ways to Create Threads**

---

## **1. Extending Thread Class**

## **2. Implementing Runnable Interface**

---

# 🔹 **1. Extending Thread Class**

---

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Started Running...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
```

---

# 🔹 **2. Implementing Runnable Interface (Preferred)**

---

```java
class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread is Running Successfully");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        t1.start();
    }
}
```

---

# 🔥 **start() vs run() (VERY IMPORTANT)**

---

| Method  | Behavior           |
| ------- | ------------------ |
| start() | Creates new thread |
| run()   | Normal method call |

---

# 🔥 **Thread Life Cycle (DETAILED)**

---

![Image](https://images.openai.com/static-rsc-4/e0ypbmZvx2XmKWGRbbZrlm5iUp3vJc6O1wM8S96rsVzrXTwVEqcwgnuLI6_VAcJMRuULA9bWSsUfd_z1jEI7LEswRoJiYM7wEQk-F7VziHAJhjqsnWVDxVZ0dat8RdDxGAKii_GDMkHC2GIie7IPwvQyuvOiKNYOuZbZInTE5quxhsXamonP0Ssxv-hW-L4X?purpose=fullsize)

---

## 🧠 **States of a Thread**

```text
New → Runnable → Running → (Blocked / Waiting / Timed Waiting) → Runnable → Terminated
```

---

## 🔹 **1. New State**

---

✔ Thread object is created
✔ Not yet started

```java
Thread t = new Thread();
```

---

## 🔹 **2. Runnable State**

---

✔ Thread is ready to run
✔ Waiting for CPU allocation

```java
t.start(); // moves to runnable
```

---

👉 JVM scheduler decides when it runs

---

## 🔹 **3. Running State**

---

✔ Thread is currently executing
✔ CPU is assigned

---

👉 Only one thread runs at a time per CPU core

---

## 🔹 **4. Blocked State**

---

✔ Waiting for a resource (lock, I/O, etc.)

---

### Example:

```java
synchronized(obj) {
    // thread waiting for lock
}
```

---

👉 Cannot proceed until resource is available

---

## 🔹 **5. Waiting State**

---

✔ Waiting indefinitely for another thread

---

### Example:

```java
t1.join();
```

---

👉 Thread resumes only when notified

---

## 🔹 **6. Timed Waiting State**

---

✔ Waiting for a specific time

---

### Examples:

```java
Thread.sleep(1000);
t1.join(1000);
```

---

👉 Automatically returns after time expires

---

## 🔹 **7. Terminated State**

---

✔ Thread execution is completed
✔ Cannot be restarted

---

```text
Once terminated → cannot go back to any state
```

---

# 🔥 **State Transitions (IMPORTANT)**

---

```text
start() → New → Runnable  
Scheduler → Runnable → Running  
wait()/join() → Running → Waiting  
sleep() → Running → Timed Waiting  
lock unavailable → Running → Blocked  
completion → Running → Terminated  
```

---

# 🔥 **Thread Class**

---

```java
public class Thread extends Object implements Runnable
```

---

# 🔥 **Advantages of Threads**

---

✔ Faster execution
✔ Better CPU utilization
✔ Efficient resource usage
✔ Responsive applications

---

# 🚀 **Quick Summary**

---

* Thread = unit of execution
* Two ways → Thread / Runnable
* Lifecycle defines execution flow
* Threads move between states dynamically

---

```text
Thread Lifecycle = State + Transition + Scheduler
```

---

👉 Threads are the **foundation of multithreading and concurrency**

---
