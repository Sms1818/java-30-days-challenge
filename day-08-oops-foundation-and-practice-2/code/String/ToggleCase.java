/*
Problem

Given a string, convert:

Lowercase → Uppercase
Uppercase → Lowercase

Keep all other characters (digits, spaces, symbols) unchanged.

Expected Output

Input: "HeLLo 123"
Output: "hEllO 123"
*/

public class ToggleCase {
    public static void main(String[] args) {
        String s="HeLLo 123";
        // TC: n, SC: n (due to StringBuilder)
        StringBuilder toggledString=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                toggledString.append(Character.toUpperCase(ch));
            }
            else if(ch>='A' && ch<='Z'){
                toggledString.append(Character.toLowerCase(ch));
            }
            else{
                toggledString.append(ch);
            }
        }
        System.out.println(toggledString.toString());

    }
}