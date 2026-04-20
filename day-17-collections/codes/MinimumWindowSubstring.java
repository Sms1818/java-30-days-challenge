import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t){
        if(s==null || s.length()==0 || t==null || t.length()==0) return "";
        Map<Character, Integer> map = new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int left=0;
        int minLength=Integer.MAX_VALUE;
        int count=t.length();
        int start=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                 if (map.get(ch) > 0) {
                    count--;
                }
                map.put(ch,map.get(ch)-1);
            }
            while(count==0){
                if(right-left+1<minLength){
                    minLength=right-left+1;
                    start=left;
                }
                char leftChar=s.charAt(left);
                if(map.containsKey(leftChar)){
                    map.put(leftChar, map.get(leftChar)+1);
                    if(map.get(leftChar)>0){
                        count++;
                    }
                }
                left++;
            }



        }
        return minLength==Integer.MAX_VALUE?"":s.substring(start, start+minLength);

    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println(result);
    }
}
