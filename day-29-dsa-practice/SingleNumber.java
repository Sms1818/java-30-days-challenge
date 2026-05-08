/*
Problem

Every element appears twice except one. Find that single element.

Example
Input: [4,1,2,1,2]
Output: 4
*/

public class SingleNumber {
    // Brute force approach
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int singleNumberBrute(int[] nums){
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
        }
        
        return -1; // Return -1 if no single number is found
    }
    // Optimized approach using XOR
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumberBrute(nums)); // Output: 4
        System.out.println(singleNumber(nums)); // Output: 4
    }
}