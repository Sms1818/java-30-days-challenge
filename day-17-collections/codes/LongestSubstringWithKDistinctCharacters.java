import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKDistinctCharacters {
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        // Using HashMap and Sliding Window Technique O(n) both TC and SC
        if(s==null || s.length()==0 || k==0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while(map.size()>k){
                char leftChar=s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        int result = lengthOfLongestSubstringKDistinct(s, k);
        System.out.println(result);

    }
}
        
