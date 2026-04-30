/*
Given n pairs of parentheses, generate all combinations of well-formed parentheses.

Example:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
 */

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n){
        List<String> result = new ArrayList<>();
        helper(result, "", 0, 0, n);
        return result;
    }
    public static void helper(List<String> result, String current, int open, int close,int max){
        if(current.length()==max*2){
            result.add(current);
            return;
        }
        if(open<max){
            helper(result, current+"(", open+1, close, max);
        }
        if(close<open){
            helper(result, current+")", open, close+1, max);
        }
    }
    public static void main(String[] args) {
        int n = 2;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }
}
