
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Task

Given a list of integers:

List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
Do the following using Streams:
Filter only even numbers
Square each number
Collect the result into a List
🎯 Expected Output
[4, 16, 36]
*/

public class StreamEvenSquare {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
        List<Integer> result=nums.stream().
                            filter(x->x%2==0)
                            .map(x->x*x)
                            .collect(Collectors.toList())
                            ;
        System.out.println(result);
    }
}