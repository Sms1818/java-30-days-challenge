/*
Problem

Given a string, find the character that appears the maximum number of times.

Include spaces if present.

Expected Output

Input: "programming"
Output:
m -> 2 (or g/r depending on first max occurrence logic)  
*/

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        String str= "programming is fun";
        // Brute Force: For every character, count its occurrences and keep track of the maximum
        // TC: n^2, SC:1

        // Optimal Approach: Use a frequency array to count the occurrences of each character and find the maximum
        // TC: n, SC: 1
        int[] freq=new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        int maxFrequency=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(freq[ch]>maxFrequency){
                maxFrequency=freq[ch];
            }
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(freq[ch]==maxFrequency){
                System.out.println(ch + " -> " + maxFrequency);
                freq[ch]=0;
                
            }
        }
        
    }
}