import java.util.ArrayList;
import java.util.List;

public class ArrayIntermediate {
    // 1. Method to find the second largest element in an array
    public static int secondLargest(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                secondMax=max;
                max=num;
            }
            else if(num>secondMax && num<max){
                secondMax=num;
            }
        }
        if(secondMax == Integer.MIN_VALUE){
            throw new IllegalArgumentException("No second largest element");
        }
        return secondMax;
    }

    // 2. Method to move all zeroes in an array to the end while maintaining the order of non-zero elements

    public static int[] moveZeroesToEnd(int[] arr){
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
            i++;
        }
        while(j<arr.length){
            arr[j++]=0;
        }
        return arr;
    }

    // 3. Method to remove duplicates from a sorted array and return the new length of the array
    public static int[] removeDuplicatesSortedArray(int[] arr){
        if(arr.length==0) return new int[0];
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                arr[++j]=arr[i];
            }
        }
        int[] result=new int[j+1];
        for(int i=0;i<=j;i++){
            result[i]=arr[i];
        }
        return result;

    }

    // 4. Method to left rotate an array by k positions
    public static int[] leftRotateArray(int[] arr, int k){
        if(arr.length == 0) return arr;
        k = k % arr.length;
        if(k == 0) return arr;
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
        return arr;
    }

    // 5. Method to find all leaders in an array (an element is a leader if it is greater than all elements to its right)

    public static int[] leadersInArray(int[] arr){
        int maxSoFar=Integer.MIN_VALUE;
        List<Integer> leaders=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>maxSoFar){
                leaders.add(arr[i]);
                maxSoFar=arr[i];
            }
        }
        int[] res=new int[leaders.size()];
        for(int i=0;i<leaders.size();i++){
            res[i]=leaders.get(leaders.size()-1-i);
        }
        return res;
    }

    // Helper method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] arr={3, 5, 7, 2, 8, 1};
        System.out.println("Second largest element: "+secondLargest(arr));
        int[] arr2={0, 1, 0, 3, 12};
        System.out.println("Array after moving zeroes to end: ");
        for(int num:moveZeroesToEnd(arr2)){
            System.out.print(num+" ");
        }

        int[] arr3={1, 1, 2, 2, 3, 4, 4, 5};
        System.out.println("\nArray after removing duplicates: ");
        for(int num:removeDuplicatesSortedArray(arr3)){
            System.out.print(num+" ");
        }

        int[] arr4={1, 2, 3, 4, 5};
        int k=2;
        System.out.println("\nArray after left rotation by "+k+" positions: ");
        for(int num:leftRotateArray(arr4, k)){
            System.out.print(num+" ");
        }

        int[] arr5={16, 17, 4, 3, 5, 2};
        System.out.println("\nLeaders in the array: ");
        for(int num:leadersInArray(arr5)){
            System.out.print(num+" ");
        }
    }
}
