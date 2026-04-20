/* 
Given an integer array nums and an integer k, return the maximum element in each sliding window of size k.

Example 1
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k){
        if(nums==null || nums.length==0 || k==0) return new int[0];
        int n=nums.length;
        int[] result=new int[n-k+1];
        Deque<Integer> deque=new ArrayDeque<>();
        int index=0;
        for(int i=0;i<nums.length;i++){
            // Remove indices of elements that are out of the current window
            while(!deque.isEmpty() && deque.peekFirst()<i-k+1){
                deque.pollFirst();
            }
            // Remove indices of elements that are smaller than the current element from a back
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }
            // Add the current element's index to the deque
            deque.offerLast(i);

            if(i>=k-1){
                result[index++]=nums[deque.peekFirst()];
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println("Input: nums = [1,3,-1,-3,5,3,6,7], k = 3");
        int[] result=maxSlidingWindow(nums, k);
        System.out.print("Output: [");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
            if(i<result.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
