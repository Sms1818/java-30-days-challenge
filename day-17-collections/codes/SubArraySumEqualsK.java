
import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static int countSubArrays(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        int prefixSum = 0;
        prefixSumFreq.put(0, 1);
        for (int num : nums) {
            prefixSum += num;
            if (prefixSumFreq.containsKey(prefixSum - k)) {
                count += prefixSumFreq.get(prefixSum - k);
            }
            prefixSumFreq.put(prefixSum, prefixSumFreq.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int k = 3;
        System.out.println("Optimal Approach: " + countSubArrays(arr, k));
    }
}
