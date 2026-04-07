public class ArrayBasic {
    // 1. Method to find the minimum and maximum element in an array
    public static int[] minMax(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        return new int[]{min, max};

    }

    // 2. Method to calculate the sum of all elements in an array
    public static int sumOfElements(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }

    // 3. Method to reverse an array
    public static int[] reverseArray(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }

    // 4. Method to check if an array is sorted in ascending order
    public static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]) return false;
        }
        return true;
    }

    // 5. Method to count the number of even and odd elements in an array
    public static int[] countEvenOdd(int[] arr){
        int even=0;
        int odd=0;
        for(int num:arr){
            if(num%2==0){
                even++;
            }else{
                odd++;
            }
        }
        return new int[]{even, odd};
    }
    public static void main(String[] args) {
        System.out.println("Array Basics:");
        int[] arr = {5, 2, 9, 1, 5, 6};
        int[] sortedArr = {1, 2, 3, 4, 5, 6};
        int[] result = minMax(arr);
        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);

        int sum = sumOfElements(arr);
        System.out.println("Sum of elements: " + sum);

        int[] reversedArr = reverseArray(arr.clone());
        System.out.print("Reversed array: ");
        for(int num:reversedArr){
            System.out.print(num + " ");
        }
        System.out.println();
        boolean sorted = isSorted(sortedArr);
        System.out.println("Is the array sorted? " + sorted);

        int[] evenOddCount = countEvenOdd(arr);
        System.out.println("Even count: " + evenOddCount[0]);
        System.out.println("Odd count: " + evenOddCount[1]);

    }
}
