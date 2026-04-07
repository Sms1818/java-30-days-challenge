# ***Arrays in Java***

---

## **Definition**

An array is a collection of elements of the **same data type**, stored in **contiguous memory locations**, and accessed using an **index**.

---

## **Key Characteristics**

* Stores **homogeneous data**
* Index starts from **0**
* Fixed size (cannot be changed after creation)
* Stored in **heap memory**
* Provides **O(1) access time**
* Can store both:

  * Primitive types (`int`, `char`, etc.)
  * Objects (`String`, custom classes)

---

## **Array Declaration**

Declaring an array creates only a **reference variable**, not the actual array.

### **Syntax**

```java id="arrd1"
int[] arr;
```

OR

```java id="arrd2"
int arr[];
```

---

## **Array Initialization**

Memory is allocated using the `new` keyword.

### **Syntax**

```java id="arri1"
int[] arr = new int[5];
```

---

## **Array Literal (Shortcut Initialization)**

```java id="arrlit1"
int[] arr = {1, 2, 3, 4};
```

---

## **Default Values (Very Important)**

When an array is created using `new`, elements are automatically initialized.

| Data Type | Default Value |
| --------- | ------------- |
| int       | 0             |
| double    | 0.0           |
| char      | '\u0000'      |
| boolean   | false         |
| object    | null          |

### **Example**

```java id="arrdef1"
int[] nums = new int[2];
String[] names = new String[2];

System.out.println(nums[0]);   // 0
System.out.println(names[0]);  // null
```

---

## **Accessing Elements**

Elements are accessed using index.

```java id="arracc1"
int[] arr = {10, 20, 30};

System.out.println(arr[0]); // 10
System.out.println(arr[2]); // 30
```

👉 Valid range: `0 ≤ index < arr.length`

---

## **Updating Elements**

```java id="arrupd1"
int[] arr = {10, 20, 30};

arr[1] = 99;

System.out.println(arr[1]); // 99
```

---

## **Traversing Array**

### **Using for loop**

```java id="arrtrav1"
int[] arr = {1, 2, 3};

for(int i = 0; i < arr.length; i++){
    System.out.println(arr[i]);
}
```

### **Using enhanced for loop**

```java id="arrtrav2"
for(int num : arr){
    System.out.println(num);
}
```

---

## **Length of Array**

```java id="arrlen1"
int[] arr = {1, 2, 3, 4};

System.out.println(arr.length); // 4
```

---

## **Full Example (Declaration → Update → Print)**

```java id="arrfull1"
class Main {
    public static void main(String[] args) {

        int[] arr = new int[3];

        // Default values
        System.out.println(arr[0]); // 0

        // Updating elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        // Printing elements
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
```

---

## **Arrays of Objects**

```java id="arrobj1"
class Student {
    int roll;
    String name;

    Student(int r, String n){
        roll = r;
        name = n;
    }
}

class Main {
    public static void main(String[] args) {

        Student[] students = new Student[2];

        students[0] = new Student(1, "Aman");
        students[1] = new Student(2, "Rahul");

        System.out.println(students[0].name);
    }
}
```

---

## **Exception (Important)**

Accessing invalid index:

```java id="arrex1"
int[] arr = {1, 2, 3};

System.out.println(arr[5]); // ❌
```

👉 Throws:

```
ArrayIndexOutOfBoundsException
```

---

## **Passing Array to Method**

```java id="arrpass1"
public static void printArray(int[] arr){
    for(int num : arr){
        System.out.println(num);
    }
}
```

---

## **Returning Array from Method**

```java id="arrret1"
public static int[] getArray(){
    return new int[]{1, 2, 3};
}
```

---

## **Advantages**

* Fast access → **O(1)**
* Simple and easy to use
* Memory efficient

---

## **Disadvantages**

* Fixed size
* Only same data type allowed
* Insertion/deletion costly

---

## **Quick Summary**

* Array = fixed-size collection
* Index-based access
* Stored in heap
* Default values assigned automatically
* Foundation for advanced data structures

---
