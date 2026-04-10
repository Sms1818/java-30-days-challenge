

public class Method {
    // 1. Method to reverse a number
    // Constraints:
        // Handle negative numbers
        // Handle trailing zeros (120 → 21)
        // Handle overflow case (optional)
    public static int reverse(int n){
        if(n> Integer.MAX_VALUE || n< Integer.MIN_VALUE){
            return 0; 
        }
        int rev=0;
        int sign= (n<0)?-1:1;
        n=Math.abs(n);
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return rev*sign;
    }
    // 2. Method to check if a number is a palindrome
    public static boolean palindrome(int n){
        if(n<0){
            return false; 
        }
        int original=n;
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return original==rev;
    }

    // 3. Sum of digits of a number using recursion
    public static int sumOfDigits(int n){
        n=Math.abs(n);
        if(n==0) return 0;
        return (n%10)+sumOfDigits(n/10);
    }

    // 4. Factorial using iterative method
    public static long factorialIterative(int n){
        if(n<0) return -1;
        long fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    // 5. Factorial using recursive method
    public static long factorialRecursive(int n){
        if(n<0) return -1;
        if(n==1) return 1;
        return n*factorialRecursive(n-1);
    }

    // 6. GCD using Euclidean algorithm
    public static int GCD(int x, int y){
        if(y==0) return x;
        return GCD(y, x%y);
    }
    public static void main(String[] args) {
        int n=-12000;
        System.out.println(reverse(n)); // Output: 21

        int m=121;
        System.out.println(palindrome(m)); // Output: true

        int p=12345;
        System.out.println(sumOfDigits(p)); // Output: 15

        int q=5;
        System.out.println(factorialIterative(q)); // Output: 120

        int r=5;
        System.out.println(factorialRecursive(r)); // Output: 120

        int a=48, b=18;
        System.out.println(GCD(a,b)); // Output: 6


    }
}
