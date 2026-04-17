# ***synchronized Keyword and AtomicInteger in Java***

---

# 🔥 **Why Do We Need Synchronization?**

---

```text id="sync1"
Multiple threads + Shared data = Race Condition
```

---

---

# 🔥 **synchronized Keyword**

---

## **Definition**

`synchronized` ensures that **only one thread can access a critical section at a time** using a locking mechanism.

---

# 🧠 **Core Idea**

```text id="sync2"
synchronized = Lock (Monitor) + Mutual Exclusion
```

---

# 🔥 **How synchronized Works Internally**

---

## 🧠 **Monitor Lock Concept**

Every object in Java has an **internal lock (monitor)**.

---

```text id="sync3"
Object → Monitor (Lock)
```

---

## 🔄 **Execution Flow**

```text id="sync4"
1. Thread tries to enter synchronized block
2. JVM checks if lock is available
3. If free → thread acquires lock
4. Executes critical section
5. Releases lock after execution
6. Next thread gets access
```

---

## ⚠️ **If Lock is NOT Available**

```text id="sync5"
Thread goes to BLOCKED state
Waits until lock is released
```

---

---

# 🔥 **Bytecode Level**

---

`synchronized` is implemented using:

```text id="sync6"
monitorenter → acquire lock
monitorexit  → release lock
```

---

👉 JVM inserts these instructions automatically

---

---

# 🔥 **Memory Behavior**

---

```text id="sync7"
Before entering → thread reads from main memory  
After exiting → writes back to main memory
```

---

👉 Ensures:

✔ Visibility
✔ Atomicity

---

---

# 🔥 **Types of Synchronization**

---

### ✔ Method

```java
synchronized void increment() {}
```

---

### ✔ Block

```java
synchronized (this) {}
```

---

### ✔ Static

```java
static synchronized void show() {}
```

👉 Lock is on **Class object**

---

---

# 🔥 **AtomicInteger**

---

## **Definition**

`AtomicInteger` provides **thread-safe operations without using locks**, using a low-level mechanism.

---

# 🧠 **Core Idea**

```text id="atomic1"
AtomicInteger = Lock-free + CAS (Compare-And-Swap)
```

---

---

# 🔥 **How AtomicInteger Works Internally**

---

## 🧠 **CAS (Compare-And-Swap)**

---

```text id="atomic2"
CAS = Compare current value with expected value
If equal → update
Else → retry
```

---

---

## 🔄 **Step-by-Step Execution**

```text id="atomic3"
1. Read current value (V)
2. Compare with expected value (E)
3. If V == E → update to new value
4. If not → retry operation
```

---

---

## 🔥 **Example Flow**

```text id="atomic4"
Thread 1 reads count = 5  
Thread 2 reads count = 5  

Thread 1 updates to 6 ✔  
Thread 2 tries → fails ❌  
Thread 2 retries → reads 6 → updates to 7 ✔
```

---

👉 No data loss
👉 No locking required

---

---

# 🔥 **Low-Level Working**

---

👉 Uses CPU instruction:

```text id="atomic5"
Compare-And-Swap (CAS)
```

---

👉 Provided via:

```text id="atomic6"
Unsafe class (JVM internal)
```

---

---

# 🔥 **Key Difference in Working**

---

| Feature         | synchronized    | AtomicInteger      |
| --------------- | --------------- | ------------------ |
| Mechanism       | Lock (blocking) | CAS (non-blocking) |
| Thread behavior | Waits           | Retries            |
| Performance     | Slower          | Faster             |
| Scalability     | Limited         | High               |

---

---

# 🔥 **Important Insight**

---

```text id="atomic7"
synchronized → Blocking (thread waits)
AtomicInteger → Non-blocking (thread retries)
```

---

---

# 🔥 **When to Use What**

---

## ✅ Use synchronized when:

✔ Multiple variables involved
✔ Complex operations
✔ Need strict locking

---

## ✅ Use AtomicInteger when:

✔ Single variable operations
✔ High performance required
✔ Avoid blocking

---

---

# 🚀 **Quick Summary**

---

```text id="final1"
synchronized = Lock-based safety  
AtomicInteger = Lock-free safety (CAS)
```

---

👉 Both solve race condition, but **use different internal mechanisms**

---
