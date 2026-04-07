# ***2D Arrays & Jagged Arrays in Java***

---

## **2D Array in Java**

---

## **Definition**

A 2D array is a collection of elements arranged in **rows and columns (matrix form)**.

👉 It is called an **array of arrays**, because each row itself is an array.

Example visualization:

```
1  2  3
4  5  6
```

---

## **Key Characteristics**

* Fixed number of rows and columns
* Stored in **heap memory**
* Accessed using **two indices** → `[row][col]`
* All rows have **same number of columns**
* Each row internally is a separate array but of equal size

---

## **Declaration**

Only reference is created (no memory allocation yet):

```java id="d2d1"
int[][] arr;
```

---

## **Initialization**

Memory allocation for rows and columns:

```java id="d2d2"
int[][] arr = new int[2][3];
```

👉 Meaning:

* 2 rows
* 3 columns in each row

Memory structure:

```
arr → [ [0,0,0], [0,0,0] ]
```

---

## **Default Values**

When created using `new`, elements are automatically initialized:

```java id="d2d3"
int[][] arr = new int[2][2];

System.out.println(arr[0][0]); // 0
```

👉 Default values:

* int → 0
* boolean → false
* object → null

---

## **Accessing Elements**

```java id="d2d4"
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6}
};

System.out.println(arr[0][1]); // 2
System.out.println(arr[1][2]); // 6
```

👉 Explanation:

* `arr[0][1]` → first row, second column
* `arr[1][2]` → second row, third column

---

## **Updating Elements**

```java id="d2d5"
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6}
};

arr[0][1] = 99;

System.out.println(arr[0][1]); // 99
```

👉 You directly modify using index.

---

## **Traversing 2D Array**

We use **nested loops** because of rows and columns.

```java id="d2d6"
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6}
};

for(int i = 0; i < arr.length; i++){
    for(int j = 0; j < arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
```

👉 Important:

* `arr.length` → number of rows
* `arr[i].length` → number of columns in that row

---

## **Full Example**

```java id="d2d7"
class Main {
    public static void main(String[] args) {

        int[][] arr = new int[2][3];

        int value = 1;

        // Assign values
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = value++;
            }
        }

        // Print values
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---



# **Jagged Array in Java**

---

## **Definition**

A jagged array is a **2D array where each row can have a different number of columns**.

👉 Unlike 2D array:

* 2D → fixed columns
* Jagged → variable columns

---

## **Key Characteristics**

* Each row is an independent array
* Column size can vary
* More **memory efficient**
* Used when data is **non-uniform**

---

## **Declaration**

```java id="jd1"
int[][] arr = new int[3][];
```

👉 Only rows are defined, columns are not.

---

## **Initialization (Step-by-Step)**

```java id="jd2"
int[][] arr = new int[2][];

arr[0] = new int[3]; // row 0 → 3 columns
arr[1] = new int[2]; // row 1 → 2 columns
```

Memory structure:

```
[ [0,0,0], [0,0] ]
```

---

## **Example (Assign + Print)**

```java id="jd3"
class Main {
    public static void main(String[] args) {

        int[][] arr = new int[2][];

        arr[0] = new int[3];
        arr[1] = new int[2];

        int value = 1;

        // Assign values
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = value++;
            }
        }

        // Print values
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## **Alternative Initialization**

```java id="jd4"
int[][] arr = {
    {1, 2, 3},
    {4, 5},
    {6, 7, 8, 9}
};
```

👉 Each row has different size.

---

## **Dynamic Jagged Array**

```java id="jd5"
int[][] arr = new int[4][];

for(int i = 0; i < arr.length; i++){
    arr[i] = new int[i + 1];
}
```

👉 Output structure:

```
1 element
2 elements
3 elements
4 elements
```

---

## **2D Array vs Jagged Array**

| Feature   | 2D Array        | Jagged Array     |
| --------- | --------------- | ---------------- |
| Columns   | Fixed           | Variable         |
| Structure | Uniform         | Irregular        |
| Memory    | May waste space | Optimized        |
| Access    | Simple          | Slightly complex |

---

## **Advantages**

### 2D Array

* Simple structure
* Easy for matrix problems

### Jagged Array

* Saves memory
* Flexible

---

## **Disadvantages**

### 2D Array

* Wastes memory if unused

### Jagged Array

* Slightly harder to manage

---

## **Quick Summary**

* 2D Array → fixed rows & columns
* Jagged Array → variable column sizes
* Both are arrays of arrays
* Use based on problem requirement

---
