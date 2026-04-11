/*
Problem

Given:

int[] arr = {1, 2, 3, 4, 5};

Create a prefix sum array

Expected Output
1 3 6 10 15
*/

public class PrefixSumArray {
    public static void main(String[] args) {
        // TC: n, SC: n
        int[] arr={1,2,3,4,5};
        int[] prefixSum=new int[arr.length];
        prefixSum[0]=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
            prefixSum[i]=sum;
        }
        for(int num:prefixSum){
            System.out.print(num+" ");
        }
        
    }
}