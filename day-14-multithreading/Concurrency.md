# ***Concurrency in Java***

---

# 🔥 **What is Concurrency?**

---

## **Definition**

Concurrency in Java is the ability of a program to **execute multiple threads simultaneously while managing shared resources safely**.

> It focuses not just on execution, but on **correct coordination between threads** 

---

# 🧠 **Core Idea**

```text
Concurrency = Multiple threads + Shared resources + Coordination
```

---

# 🔥 **Concurrency vs Multithreading**

---

| Feature | Multithreading           | Concurrency               |
| ------- | ------------------------ | ------------------------- |
| Focus   | Running multiple threads | Managing multiple threads |
| Goal    | Performance              | Correctness + Safety      |
| Concern | Execution                | Data consistency          |

---

👉 Multithreading = *doing multiple things*
👉 Concurrency = *doing them correctly*

---

# 🔥 **Why Concurrency is Needed?**

---

✔ Improve performance
✔ Utilize CPU efficiently
✔ Handle multiple tasks simultaneously
✔ Build scalable applications

---

# 🔥 **Core Problem in Concurrency**

---

```text
Multiple threads + Shared data = Unpredictable behavior
```

---

👉 When threads share data:

* Order of execution is **not guaranteed**
* Leads to **inconsistent results**

---

🔴 1. Race Condition
Definition

Occurs when:

Multiple threads access and modify shared data simultaneously,
and the final output depends on the order of execution of threads.
🔥 Detailed Example
class Counter {

    int count = 0;

    void increment() {
        count++; // not atomic
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.count);
    }
}
🧠 Expected Output
Final Count: 2000
❗ Actual Output (May Vary)
Final Count: 1732
Final Count: 1987
Final Count: 2000
🧠 Step-by-Step Problem
Thread 1 reads count = 5
Thread 2 reads count = 5

Thread 1 writes 6
Thread 2 writes 6  ❌ (lost update)
❗ Key Insight
count++ = Read → Modify → Write (3 steps, NOT atomic)
✅ Solution 1: synchronized
synchronized void increment() {
    count++;
}
✅ Solution 2: AtomicInteger
import java.util.concurrent.atomic.AtomicInteger;

AtomicInteger count = new AtomicInteger(0);

count.getAndIncrement();
🔴 2. Deadlock
Definition

Occurs when:

Two or more threads are waiting for each other’s resources,
and none of them can proceed.
🔥 Detailed Example
class DeadlockExample {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void methodA() {
        synchronized (lock1) {
            System.out.println("Thread 1: Holding lock1");

            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (lock2) {
                System.out.println("Thread 1: Holding lock2");
            }
        }
    }

    public void methodB() {
        synchronized (lock2) {
            System.out.println("Thread 2: Holding lock2");

            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (lock1) {
                System.out.println("Thread 2: Holding lock1");
            }
        }
    }

    public static void main(String[] args) {

        DeadlockExample obj = new DeadlockExample();

        new Thread(obj::methodA).start();
        new Thread(obj::methodB).start();
    }
}
🧠 Execution Flow
Thread 1 → holds lock1 → waiting for lock2
Thread 2 → holds lock2 → waiting for lock1
❗ Result
Program hangs forever (deadlock)
✅ Solution
Always acquire locks in same order
🔴 3. Visibility Problem
Definition

Occurs when:

One thread updates a variable,
but other threads do not see the updated value.
🔥 Detailed Example
class VisibilityTest {

    private boolean running = true;

    void start() {
        new Thread(() -> {
            while (running) {
                // may run forever
            }
            System.out.println("Stopped!");
        }).start();
    }

    void stop() {
        running = false;
    }

    public static void main(String[] args) throws Exception {

        VisibilityTest obj = new VisibilityTest();
        obj.start();

        Thread.sleep(100);

        obj.stop();
    }
}
❗ Problem
Thread may never see updated value of running

👉 Program may run infinitely

🧠 Reason
Thread uses cached value instead of main memory
✅ Solution
private volatile boolean running = true;
🧠 Key Insight
volatile ensures visibility across threads
🔴 4. Starvation
Definition

Occurs when:

A thread never gets CPU time because other threads dominate execution.
🔥 Detailed Example
class StarvationExample {

    public static void main(String[] args) {

        Runnable lowTask = () -> {
            while (true) {
                System.out.println("Low priority running");
            }
        };

        Runnable highTask = () -> {
            while (true) {
                System.out.println("High priority running");
            }
        };

        Thread low = new Thread(lowTask);
        Thread high = new Thread(highTask);

        low.setPriority(Thread.MIN_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        high.start();
    }
}
❗ Output Behavior
High priority running...
High priority running...
High priority running...
🧠 Problem

👉 Low priority thread rarely executes

✅ Solution

✔ Avoid heavy priority usage
✔ Use fair scheduling

---

# 🔥 **Summary of Problems**

---

```text
Race Condition → Wrong result (data inconsistency)  
Deadlock → Threads stuck forever  
Visibility → Stale data (not updated)  
Starvation → Thread never runs
```

---

---

# 🔥 **Key Concepts to Remember**

---

```text
Concurrency = Correctness over speed
```

---

```text
Execution order is NOT guaranteed
```

---

```text
Shared data must be controlled
```

---

---

# 🚀 **Quick Summary**

---

* Concurrency = managing threads safely
* Problems arise due to shared data
* Order of execution matters
* Proper synchronization is required

---

```text
Concurrency = Performance + Safety + Correctness
```

---

👉 Concurrency is about **ensuring correct behavior in multi-threaded programs**

---
