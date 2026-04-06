public class NumberLogic {
    // Method to calculate the factorial of a number
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    // Method to generate Fibonacci series up to n terms
    public static void fibonacci(int n){
        int x=0;
        int y=1;
        System.out.print(x+" "+y);

        for(int i=2;i<n;i++){
            int z=x+y;
            System.out.print(" "+z);
            x=y;
            y=z;
        }

    }

    // Method to reverse the digits of a number
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }

    // Method to check if a number is a palindrome
    public static boolean palindrome(int n){
        int original=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev==original;
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
        // for(int i=2;i<n;i++){
        //     if(n%i==0) return false;
        // }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Fibonacci series up to 10 terms:");
        fibonacci(10);
        System.out.println("\nReverse of 12345: " + reverse(12345));
        System.out.println("Is 12321 a palindrome? " + palindrome(12321));
        System.out.println("Sum of digits of 12345: " + sumOfDigits(12345));
        System.out.println("Is 29 a prime number? " + isPrime(29));
    }
}
