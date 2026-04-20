
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutiveSequence(int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentStreak=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                longest=Math.max(longest, currentStreak);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] nums={100,4,200,1,3,2};
        System.out.println("Input: nums = [100,4,200,1,3,2]");
        System.out.println("Output: " + longestConsecutiveSequence(nums));
    }
}