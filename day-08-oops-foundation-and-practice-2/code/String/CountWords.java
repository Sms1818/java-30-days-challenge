/*
Problem

Given a string, count the number of words.

A word is defined as a sequence of characters separated by whitespace.

Expected Output

Input: "I love Java programming"
Output: 4
*/

public class CountWords {
    public static void main(String[] args) {
        String s = "I love Java programming";
        if(s.trim().isEmpty()){
            System.out.println(0);
        }
        // Approach 1 : Using split method
        // TC: n, SC: n (due to new String array)
        String[] words=s.split("\\s+");
        System.out.println(words.length);

        // Approach 2: Manual counting
        // TC: n, SC: 1

        int wordCount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!Character.isWhitespace(ch) &&
               (i == 0 || Character.isWhitespace(s.charAt(i - 1)))){
                wordCount++;
            }

        }
        System.out.println(wordCount);


    }
}