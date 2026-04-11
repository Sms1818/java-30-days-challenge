/*
Problem — In-Place Duplicate (No Extra Space)

Given:

int[] arr = {1, 3, 4, 2, 2};

Find duplicate
NO extra space allowed
*/

public class FindDuplicateInPlace {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        // My intuition is to treat array like a linked list and use floyd detection cycle to find out the duplicate number. We will consider the value of each element as the index and move to that index. If we encounter a number that we have already seen, it means we have found the duplicate number.
        // TC: n, SC:1 as we are using two pointers to traverse the array and we are not using any extra space.
        int slow=arr[0];
        int fast=arr[0];

        do { 
            slow=arr[slow];
            fast=arr[arr[fast]];
        } while (slow!=fast);

        slow=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        System.out.println("Duplicate number is"+slow);

    }
}