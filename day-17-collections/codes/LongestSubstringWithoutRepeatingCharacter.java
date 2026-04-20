import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {
    // Using HashSet and Sliding Window Technique O(n) both TC and SC
    // public static int lengthOfLongestSubstring(String s) {
    //     Set<Character> set = new HashSet<>();
    //     int maxLength = 0;
    //     int left = 0;

    //     for(int right=0;right<s.length();right++){
    //         char ch=s.charAt(right);
    //         while(set.contains(ch)){
    //             set.remove(s.charAt(left));
    //             left++;
    //         }
    //         set.add(ch);
    //         maxLength = Math.max(maxLength, right - left + 1);

    //     }
    //     return maxLength;
    // }

    // Using HashMap and Sliding Window Technique O(n) both TC and SC
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);

    }
}
