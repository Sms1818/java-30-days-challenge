# ***Multithreading in Java***

---

# 🔥 **What is Multithreading?**

---

## **Definition**

Multithreading in Java is a feature that allows a program to **execute multiple threads simultaneously**, enabling parallel execution of tasks.

> It helps improve performance and CPU utilization by running multiple tasks concurrently.

---

# 🧠 **Core Idea**

```text id="mt1"
Multithreading = Multiple threads executing together
```

---

## 🧠 **Key Characteristics**

✔ Multiple threads in one process
✔ Threads share same memory
✔ Tasks execute concurrently
✔ Improves performance

---

# 🔥 **Real-World Analogy**

---

```text id="mt2"
Restaurant Kitchen:
Multiple chefs → Multiple dishes → Faster service
```

---

# 🔥 **Execution Behavior (IMPORTANT)**

---

```text id="mt3"
Thread execution is NON-DETERMINISTIC
```

---

👉 Order of execution:

* Not fixed
* Depends on CPU scheduling
* Changes every run

---

# 🔥 **Ways to Create Threads (Recap in Multithreading Context)**

---

## 🔹 **1. Extending Thread Class**

---

```java id="mt4"
class CookingTask extends Thread {

    private String task;

    CookingTask(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " prepared by " +
            Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {

        Thread t1 = new CookingTask("Pasta");
        Thread t2 = new CookingTask("Salad");
        Thread t3 = new CookingTask("Dessert");

        t1.start();
        t2.start();
        t3.start();
    }
}
```

---

## 🧠 **Observation**

👉 Output order changes every run

---

# 🔹 **2. Implementing Runnable Interface (Preferred)**

---

```java id="mt5"
class CookingJob implements Runnable {

    private String task;

    CookingJob(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " prepared by " +
            Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new CookingJob("Soup"));
        Thread t2 = new Thread(new CookingJob("Pizza"));
        Thread t3 = new Thread(new CookingJob("Burger"));

        t1.start();
        t2.start();
        t3.start();
    }
}
```

---

## 🧠 **Why Runnable is Preferred**

✔ Allows class to extend another class
✔ Better design flexibility
✔ Separation of task and thread

---

# 🔥 **start() vs run() in Multithreading**

---

| Method  | Behavior                |
| ------- | ----------------------- |
| start() | Creates new thread      |
| run()   | Executes in same thread |

---

```java id="mt6"
t1.start(); // parallel execution
t1.run();   // normal execution
```

---

# 🔥 **Thread Scheduling**

---

## **Definition**

Thread scheduling is the process by which JVM **decides which thread runs at a given time**.

---

## 🧠 **Key Points**

✔ Controlled by JVM
✔ Depends on OS
✔ Not predictable

---

```text id="mt7"
Scheduler decides → NOT programmer
```

---

---

# 🔥 **join() Method**

---

## **Definition**

Used to make one thread **wait for another thread to complete**

---

## **Example**

```java id="mt8"
t1.start();
t1.join(); // main waits for t1
```

---

---

# 🔥 **sleep() Method**

---

## **Definition**

Pauses execution of a thread for a specified time

---

## **Example**

```java id="mt9"
Thread.sleep(1000);
```

---

👉 Moves thread to **Timed Waiting state**

---

# 🔥 **When to Use Which?**

---

| Approach | When to Use           |
| -------- | --------------------- |
| Thread   | No inheritance needed |
| Runnable | Preferred, flexible   |

---

---

# 🔥 **Advantages of Multithreading**

---

✔ Faster execution
✔ Efficient CPU utilization
✔ Better responsiveness
✔ Resource sharing
✔ Improved user experience

---

---

# 🔥 **Common Mistakes**

---

❌ Expecting fixed output order
❌ Calling run() instead of start()
❌ Ignoring thread scheduling behavior

---

---

# 🚀 **Quick Summary**

---

* Multithreading = multiple threads execution
* Execution order is unpredictable
* Runnable is preferred
* JVM controls scheduling

---

```text id="mt10"
Multithreading = Parallel Execution + Shared Resources
```

---

👉 Multithreading is about **efficient execution, not guaranteed order**

---
