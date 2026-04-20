import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        if(strs==null || strs.length==0) return new ArrayList<>();
        Map<String, List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
            
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result=groupAnagrams(strs);
        System.out.println(result);
    }
}
