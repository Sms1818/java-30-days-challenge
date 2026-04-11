/*
Problem

Given a string, remove all whitespace characters:

spaces ' '
tabs \t
newlines \n

Keep all other characters unchanged.

Expected Output

Input: "Java is fun"
Output: "Javaisfun"
*/

public class RemoveWhitespaces {
    public static void main(String[] args) {
        String s="Programming is fun";
        // TC: n, SC: n (due to StringBuilder)
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' ' && ch!='\t' && ch!='\n'){
                result.append(ch);
            }
        }
        System.out.println(result.toString());

        //Approach 2: Using regex
        // TC: n, SC: n (due to new StringBuilder)
        // \\s is a regex pattern that matches any whitespace character (space, tab, newline, etc.)
        String s2="Programming\tis\nfun";
        System.out.println(s2.replaceAll("\\s", ""));

    }
}