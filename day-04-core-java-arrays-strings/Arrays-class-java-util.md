# ***Arrays Class in Java (java.util.Arrays)***

---

## **Definition**

`Arrays` is a **utility class** in `java.util` package that provides **static methods** to perform operations on arrays like sorting, searching, comparing, and transforming.

👉 It cannot be instantiated.

---

## **Key Characteristics**

* Belongs to `java.util`
* Contains only **static methods**
* Improves performance and reduces code
* Works with both primitive and object arrays

---

## **Import Statement**

```java id="imp1"
import java.util.Arrays;
```

---

# **Static Methods in Arrays Class**

---

## **1. sort()**

Sorts array in ascending order.

```java id="m1"
int[] arr = {5, 2, 8, 1};

Arrays.sort(arr);

System.out.println(Arrays.toString(arr)); // [1, 2, 5, 8]
```

---

## **2. parallelSort()**

Sorts array using multiple threads (faster for large data).

```java id="m2"
int[] arr = {5, 2, 8, 1};

Arrays.parallelSort(arr);
```

---

## **3. binarySearch()**

Searches element using binary search.

⚠️ Array must be sorted

```java id="m3"
int[] arr = {10, 20, 30, 40};

int index = Arrays.binarySearch(arr, 30);
System.out.println(index); // 2
```

---

## **4. equals()**

Checks if two arrays are equal.

```java id="m4"
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};

System.out.println(Arrays.equals(a, b)); // true
```

---

## **5. deepEquals()**

Checks equality for **nested arrays (2D arrays)**.

```java id="m5"
int[][] a = {{1, 2}, {3, 4}};
int[][] b = {{1, 2}, {3, 4}};

System.out.println(Arrays.deepEquals(a, b)); // true
```

---

## **6. toString()**

Converts array to readable string.

```java id="m6"
int[] arr = {1, 2, 3};

System.out.println(Arrays.toString(arr)); // [1, 2, 3]
```

---

## **7. deepToString()**

Used for nested arrays.

```java id="m7"
int[][] arr = {{1, 2}, {3, 4}};

System.out.println(Arrays.deepToString(arr)); // [[1, 2], [3, 4]]
```

---

## **8. fill()**

Fills entire array with a value.

```java id="m8"
int[] arr = new int[3];

Arrays.fill(arr, 7);

System.out.println(Arrays.toString(arr)); // [7, 7, 7]
```

---

## **9. copyOf()**

Copies array to new size.

```java id="m9"
int[] arr = {1, 2, 3};

int[] newArr = Arrays.copyOf(arr, 5);

System.out.println(Arrays.toString(newArr)); // [1, 2, 3, 0, 0]
```

---

## **10. copyOfRange()**

Copies a specific range.

```java id="m10"
int[] arr = {1, 2, 3, 4, 5};

int[] newArr = Arrays.copyOfRange(arr, 1, 4);

System.out.println(Arrays.toString(newArr)); // [2, 3, 4]
```

---

## **11. asList()**

Converts array to list.

```java id="m11"
Integer[] arr = {1, 2, 3};

System.out.println(Arrays.asList(arr));
```

---

## **Important Trap ⚠️**

```java id="m12"
int[] arr = {1, 2, 3};

System.out.println(Arrays.asList(arr));
```

👉 Output: memory reference
👉 Works properly only with **wrapper types (Integer, not int)**

---

## **12. compare()**

Compares two arrays lexicographically.

```java id="m13"
int[] a = {1, 2, 3};
int[] b = {1, 2, 4};

System.out.println(Arrays.compare(a, b)); // negative value
```

---

## **13. mismatch()**

Finds first index where arrays differ.

```java id="m14"
int[] a = {1, 2, 3};
int[] b = {1, 2, 4};

System.out.println(Arrays.mismatch(a, b)); // 2
```

---

## **14. hashCode()**

Returns hash code of array.

```java id="m15"
int[] arr = {1, 2, 3};

System.out.println(Arrays.hashCode(arr));
```

---

## **15. deepHashCode()**

Hash code for nested arrays.

```java id="m16"
int[][] arr = {{1, 2}, {3, 4}};

System.out.println(Arrays.deepHashCode(arr));
```

---

## **16. setAll()**

Sets values using function.

```java id="m17"
int[] arr = new int[5];

Arrays.setAll(arr, i -> i * 2);

System.out.println(Arrays.toString(arr)); // [0, 2, 4, 6, 8]
```

---

## **17. parallelSetAll()**

Same as setAll but parallel.

```java id="m18"
Arrays.parallelSetAll(arr, i -> i * 3);
```

---

## **18. stream()**

Converts array to stream.

```java id="m19"
int[] arr = {1, 2, 3};

Arrays.stream(arr).forEach(System.out::println);
```

---

## **Important Interview Points**

* All methods are **static**
* No object creation needed
* `binarySearch()` → requires sorted array
* `deep*` methods → for multi-dimensional arrays
* `asList()` → works differently for primitives

---

## **Quick Summary**

* Arrays class = utility helper
* Reduces manual coding
* Key methods to remember:

  * sort()
  * binarySearch()
  * toString()
  * equals()
  * copyOf()

---


