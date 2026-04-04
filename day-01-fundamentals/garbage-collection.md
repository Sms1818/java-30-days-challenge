# ***Heap Memory (JVM Heap Area)***

Heap is a runtime memory area in JVM where all objects and class instances are stored. It is shared among all the threads and managed by the garbage collector.

## **Characteristics Of Heap**

* Runtime Memory Allocation -> Objects created using new are allocated in heap memory
* Shared among threads -> All threads can access heap memory
* Managed by Garbage Collector -> Unreferenced objects are automatically removed

## **Heap Structure**

* Young Generation -> New objects are created
* Old Generation -> Long-lived objects
* Survivor Space -> Stores objects that survive GC cycles

## **Object Structure in Heap**

* When an object is created, it contains

  * Object Header -> Stores metadata like hashcode, GC age and synchronization info
  * Instance Variable -> Actual data (fields of object)
  * Padding / Alignment -> Maintains memory alignment for performance

## **Important Concept**

* Objects are stored in heap.
* References are stored in stack
* GC removes objects from heap when no references exist

## **Example**

```java
Geeks obj1 = new Geeks("Alice");
Geeks obj2 = new Geeks("Bob");
```

* obj1, obj2 → stored in stack (references)
* Actual objects → stored in heap

---

# ***Garbage Collection in Java***

Garbage collection in java is an automatic memory management process that removes unused (unreferenced) objects from heap memory, allowing efficient memory usage.

## **Why Garbage Collection is Needed**

* Frees memory automatically
* Prevents memory leaks
* Improves application performance
* No need for manual memory deallocation

## **How Garbage Collection Works**

* Objects are created in Heap Area
* JVM identifies:

  * Referenced objects (in use)
  * Unreferenced objects (not in use)
* Unreachable (unreferenced) objects are removed automatically

## **Key Concept -> Unreachable objects**

* An object becomes unreachable when there are no reference pointing to it.

### **Example**

```java
Integer i = new Integer(4);
i = null; //object becomes eligible for GC
```

## **Making Objects Eligible for Garbage Collection**

* Nullifying reference -> obj=null
* Reassigning the reference -> obj=new Object()
* Object inside method -> destroyed after method execution
* Island of isolation -> objects referencing each other but not referenced by any reachable object

## **Requesting Garbage Collection**

* Garbage collection is automatic, but we can request JVM:

  * System.gc()
    OR
  * Runtime.getRuntime().gc()

* Note -> JVM decides when to actually run it.

## **finalize() Method (Deprecated in Java 9+)**

* Before destroying an object, the garbage collector calls the finalize() method to perform cleanup activities
* Deprecated from Java 9 since it is unpredictable and can cause performance issues.
* Alternatives like try-with-resources or explicit cleanup methods are preferred.
* The garbage collector calls finalize() at most once per object.
* Exceptions thrown in finalize() are ignored.

## **Types of Garbage Collection**

Java heap is divided into generations:

* Young Generation: In this new objects are allocated.
* Old Generation: In this long-lived objects are stored.

### **1. Minor or Incremental GC**

* Occurs in Young Generation
* Removes short-lived objects
* Happens frequently

### **2. Major or Full GC**

* Occurs in Old Generation
* Removes long-lived objects
* Less frequent but heavier
