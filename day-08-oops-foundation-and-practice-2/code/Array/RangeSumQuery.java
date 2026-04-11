/*
Problem

Given:

int[] arr = {1, 2, 3, 4, 5};

Answer queries:

L = 1, R = 3 → Output: 9
L = 0, R = 2 → Output: 6

There will be multiple queries. 


*/

public class RangeSumQuery {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        // Queries
        int[][] queries = {
            {1, 3},  // expected 9
            {0, 2}   // expected 6
        };

        // Brute Force
        // TC: q*n, SC:1
        System.out.println("Brute Force:");
        for(int[] q : queries){
            int L = q[0];
            int R = q[1];

            int sum = 0;
            for(int i = L; i <= R; i++){
                sum += arr[i];
            }

            System.out.println("Sum from " + L + " to " + R + " = " + sum);
        }



        


        // Optimal Approach : Build a prefix sum array to answer the queries in O(1) time after O(n) preprocessing time.
        // TC: n+q, SC: n

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println("\nUsing Prefix Sum:");

        for(int[] q : queries){
            int L = q[0];
            int R = q[1];

            int sum;
            if(L == 0){
                sum = prefix[R];
            } else {
                sum = prefix[R] - prefix[L - 1];
            }

            System.out.println("Sum from " + L + " to " + R + " = " + sum);
        }

        

    }
}