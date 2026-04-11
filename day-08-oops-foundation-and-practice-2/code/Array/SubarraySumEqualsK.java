/*
Problem

Given:

int[] arr = {1, 2, 3, 4, 5};
int k = 9;

Find if any subarray exists with sum = k

Expected Output
true

(because 2 + 3 + 4 = 9)

Constraints
First solve using brute force
Then try to optimize 
*/


public class SubarraySumEqualsK {
    // Brute Force : My intuition to use find all possible subarrays and check if the sum of any subarray is equal to k. 
    // TC: n^2, SC:1
    public static boolean bruteForce(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    return true;
                }
            }
        }
        return false;
    }

     // Optimized approach (works only for positive numbers):  My intuition is to use two pointers to maintain a sliding window. We will keep expanding the window by moving the right pointer and adding elements to the sum. If sum exceeds k, we will remove elements from the left pointer until sum is less than or equal to k. If at any point sum equals k, we have found a subarray with the desired sum.

    // TC: n, SC:1 as we are using two pointers to traverse the array and we are not using any extra space.

    public static boolean slidingWindowPositive(int[] arr, int k) {
        int left = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=9;

        System.out.println("Brute Force:"+bruteForce(arr, k));
        System.out.println("Optimized Approach:"+slidingWindowPositive(arr, k));

    }
}