
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
ask

Given:

List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

👉 Find the second highest number using Streams

🎯 Expected Output
40
*/

public class SecondHighestNumberStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
        // Approach 1: Sort and skip
        // TC: O(n log n) due to sorting
        // SC: O(n) due to distinct and sorted operations
        int secondHighest=nums.stream()
                          .distinct()
                          .sorted(Comparator.reverseOrder())
                          .skip(1)
                          .findFirst()
                          .orElseThrow(()->new RuntimeException("No second highest number found"));
        System.out.println(secondHighest);

        // Approach 2: Single pass using max and filter
        // TC: O(n) due to single pass
        // SC: O(1) as we are not using any additional data structures

        int maxAlt=nums.stream()
                            .distinct()
                            .max(Integer::compareTo)
                            .orElseThrow();

        int secondMaxAlt=nums.stream()
                         .distinct()
                         .filter(x->x!=maxAlt)
                         .max(Integer::compareTo)
                         .orElseThrow();

        System.out.println(secondMaxAlt);
 
    }
}