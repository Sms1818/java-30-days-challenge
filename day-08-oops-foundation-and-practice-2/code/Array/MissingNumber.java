// Problem — Missing Number

// Given an array of size n-1 containing numbers from 1 to n (Array is not in sorted order)

// Example:

// int[] arr = {1, 2, 4, 5};  // n = 5

// Find the missing number

public class MissingNumber{
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int n=arr.length+1;
        // Brute Force
        // TC: n^2, SC:1
        for(int i=1;i<=n;i++){
            boolean found=false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println("Missing number is: "+i);
                break;
            }
        }
        

        // Optimal Approach
        // TC: n, SC:1
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int totalSum=(n*(n+1))/2;
        int missingNumber=totalSum-sum;
        System.out.println("Missing number is: "+missingNumber);

    }
}