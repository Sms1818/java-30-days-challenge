
import java.util.Stack;

/*
Given a string containing ()[]{}, check if brackets are valid.

Example:

Input: "()[]{}"
Output: true
*/

public class ValidParentheses {
    // Approach: Use a stack to keep track of opening brackets. For every closing bracket, check if it matches the top of the stack. Time Complexity: O(n), Space Complexity: O(n).
    // Time Complexity: O(n) - We traverse the string once. Space Complexity: O(n) - In the worst case, we might push all opening brackets onto the stack.
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                char top=stack.pop();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                    return false;
                }
            }
            }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s)); // Output: true
    }
}
