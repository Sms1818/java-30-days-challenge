/*Problem

Given:

int[] arr = {1, 3, 4, 2, 2};

Find the duplicate number.

Constraints
exactly one number is repeated
values are from 1 to n
*/

public class FindDuplicate{
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        // Brute Force
        // TC: n^2, SC:1
        // Traverse the array and for each element, check if it appears again in the rest of the array
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate number is: "+arr[i]);
                    break;
                }
            }
            
        }

        // Optimal Approach
        // TC: 2n~n, SC:1
        // Maintain a frequency array to count the occurrences of each number. The number that appears more than once is the duplicate.
        int[] freq=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                System.out.println("Duplicate number is: "+i);
                break;
            }
        }
    }
}