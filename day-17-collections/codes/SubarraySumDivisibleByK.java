
import java.util.HashMap;
import java.util.Map;

public class SubarraySumDivisibleByK {
    public static int subArraySumDivisibleByK(int[] nums,int k){
        int count=0;
        int prefixSum=0;
        Map<Integer,Integer> prefixSumFreq=new HashMap<>();
        prefixSumFreq.put(0, 1);
        for(int num:nums){
            prefixSum+=num;
            if(prefixSumFreq.containsKey(prefixSum%k)){
                count+=prefixSumFreq.get(prefixSum%k);
            }
            prefixSumFreq.put(prefixSum%k, prefixSumFreq.getOrDefault(prefixSum%k, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr={4,5,0,-2,-3,1};
        int k=5;
        System.out.println("Optimal Approach: "+subArraySumDivisibleByK(arr, k));
        
    }
}