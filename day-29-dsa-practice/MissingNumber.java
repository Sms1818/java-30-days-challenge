/*
Problem

Given array containing numbers from:

0 to n

One number is missing. Find it.

Example
Input: [3,0,1]
Output: 2
 */
public class MissingNumber {
    // Brute force approach
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int missingNumberBrute(int[] nums){
        for(int i=0;i<=nums.length;i++){
            boolean found=false;
            for(int j=0;j<=nums.length;j++){
                if(nums[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }

    // Optimized approach using sum formula
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num; 
        }
        return expectedSum - actualSum; 
    }

    // Optimized approach using XOR
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int missingNumberXOR(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for (int i = 0; i <= n; i++) {
            xor ^= i; 
        }
        for (int num : nums) {
            xor ^= num; 
        }
        return xor; 
    }
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumberBrute(nums)); // Output: 2
        System.out.println(missingNumber(nums)); // Output: 2
        System.out.println(missingNumberXOR(nums)); // Output: 2
    }
}
