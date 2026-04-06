// Important concept to understand: Java is a pass-by-value language, which means that when you pass a variable to a method, you are passing a copy of the variable's value. This is why the swap methods that do not return values do not work as expected, because they are modifying the copies of the variables rather than the original variables.
// In contrast, the swap methods that return the swapped values work as expected because they return the modified values, which can then be assigned back to the original variables.
// Difference between pass-by-value and pass-by-reference:
// Pass-by-value: The method receives a copy of the variable's value. Changes made to the parameter inside the method do not affect the original variable outside the method.
// Pass-by-reference: The method receives a reference to the variable. Changes made to the parameter inside the method affect the original variable outside the method. Java does not support pass-by-reference, but it can be simulated using objects or arrays.


public class BasicLogic {
    // Method to check if a number is even or odd
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    // Method to find the largest of three numbers
    public static int largest(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }

    // Method to swap two numbers (Note: This will not work as expected due to Java's pass-by-value)
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    // Method to swap two numbers without using a temporary variable (Note: This will also not work as expected due to Java's pass-by-value)
    public static void swapWithoutTemp(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
    }

    // Method to swap two numbers and return the swapped values (This will work as it returns the swapped values)
    public static int[] swap1(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }

    public static int[] swapWithoutTemp1(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }

    public static int[] swapUsingXOR(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[]{a, b};
    }
    public static void main(String[] args) {
        // 1. Check if a number is even or odd
        checkEvenOdd(10); // Output: 10 is even.

        // 2. Find the largest of three numbers
        int num1 = 5, num2 = 10, num3 = 3;
        int largestNum = largest(num1, num2, num3);
        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largestNum); // Output: The largest number among 5, 10, and 3 is: 10
        
        // 3. Swap two numbers
        int x = 5, y = 10;
        System.out.println("Before swapping: x = " + x + ", y = " + y); // Output: Before swapping: x = 5, y = 10
        swap(x, y);
        System.out.println("After swapping: x = " + x + ", y = " + y); // Output: After swapping: x = 5, y = 10 (No change due to pass-by-value)

        // 4. Swap two numbers without using a temporary variable
        int a = 5, b = 10;
        System.out.println("Before swapping without temp: a = " + a + ", b = " + b); // Output: Before swapping without temp: a = 5, b = 10
        swapWithoutTemp(a, b);
        System.out.println("After swapping without temp: a = " + a + ", b = " + b); // Output: After swapping without temp: a = 5, b = 10 (No change due to pass-by-value)

        // 5. Swap two numbers and return the swapped values
        int p = 5, q = 10;
        System.out.println("Before swapping with return: p = " + p + ", q = " + q); // Output: Before swapping with return: p = 5, q = 10
        int[] swappedValues = swap1(p, q);
        System.out.println("After swapping with return: p = " + swappedValues[0] + ", q = " + swappedValues[1]); // Output: After swapping with return: p = 10, q = 5

        // 6. Swap two numbers without using a temporary variable and return the swapped values
        int m = 5, n = 10;
        System.out.println("Before swapping without temp with return: m = " + m + ", n = " + n); // Output: Before swapping without temp with return: m = 5, n = 10
        int[] swappedValuesWithoutTemp = swapWithoutTemp1(m, n);
        System.out.println("After swapping without temp with return: m = " + swappedValuesWithoutTemp[0] + ", n = " + swappedValuesWithoutTemp[1]); // Output: After swapping without temp with return: m = 10, n = 5

        // 7. Swap two numbers using XOR and return the swapped values
        int r = 5, s = 10;
        System.out.println("Before swapping using XOR: r = " + r + ", s = " + s); // Output: Before swapping using XOR: r = 5, s = 10
        int[] swappedValuesUsingXOR = swapUsingXOR(r, s);
        System.out.println("After swapping using XOR: r = " + swappedValuesUsingXOR[0] + ", s = " + swappedValuesUsingXOR[1]); // Output: After swapping using XOR: r = 10, s = 5
    }
}
