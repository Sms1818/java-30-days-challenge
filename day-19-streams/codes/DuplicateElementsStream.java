
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/*
Task

Given:

List<Integer> nums = Arrays.asList(1,2,3,4,3,2,5,6,1);
Find all duplicate elements using Streams.
🎯 Expected Output (order not important)
[1, 2, 3]
*/

public class DuplicateElementsStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,3,2,5,6,1);
        List<Integer> duplicates=nums.stream()
                                .collect(Collectors.groupingBy(x->x,Collectors.counting()))
                                .entrySet()
                                .stream()
                                .filter(x->x.getValue()>1)
                                .map(x->x.getKey())
                                .collect(Collectors.toList());
        System.out.println(duplicates);
        
        // Alternative
        HashSet<Integer> seen=new HashSet<>();
        List<Integer> duplicatesAlt=nums.stream()
                                .filter(x->!seen.add(x))
                                .distinct()
                                .collect(Collectors.toList());
        System.out.println(duplicatesAlt);
    }
}