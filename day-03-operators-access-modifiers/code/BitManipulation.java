public class BitManipulation {
    // Method to check if a number is even or odd using bitwise operator
    public static void checkEvenOrOdd(int n){
        if((n&1)==0){
            System.out.println(n+" is even.");
        }
        else{
            System.out.println(n+" is odd.");
        }
    }

    // Method to swap two numbers using XOR operator
    public static void swapXOR(int a, int b){
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // Method to check if a number is a power of two
    public static boolean isPowerOfTwo(int n){
        if(n<=0) return false;
        return (n & (n-1))==0;
    }

    // Method to count the number of set bits in a number
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            count+=(n & 1);
            n=n>>1;
        }
        return count;
    }

    // Left shift and right shift 
    public static void shiftDemo(int n) {
        System.out.println("Original: " + n);
        System.out.println("Left shift (n << 1): " + (n << 1));
        System.out.println("Right shift (n >> 1): " + (n >> 1));
    }

    // Method to find the single element in an array where every other element appears twice
    public static int findSingleElement(int[] arr){
        int res=0;
        for(int num:arr){
            res=res^num;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Bit Manipulation:");
        checkEvenOrOdd(10);
        swapXOR(10, 15);
        System.out.println("Is 16 a power of two? " + isPowerOfTwo(16));
        System.out.println("Number of set bits in 7: " + countSetBits(7));
        shiftDemo(8);
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        System.out.println("Single element in the array: " + findSingleElement(arr));
    }
}
