/*
Problem

Given a string, count how many times each character appears.

Ignore nothing (include spaces if present).

Expected Output

Input: "programming"
Output:

p -> 1
r -> 2
o -> 1
g -> 2
a -> 1
m -> 2
i -> 1
n -> 1
    
*/

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "programming is fun";
        // Brute Force : For every character, count its occurunces in the string
        // TC: n^2, SC:1
        System.out.println("Brute Force Approach:");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            boolean alreadyCounted=false;
            for(int k=0;k<i;k++){
                if(str.charAt(k)==ch){
                    alreadyCounted=true;
                    break;
                }
            }
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==ch){
                    count++;
                }
            }
            if(!alreadyCounted){
                System.out.println(ch+" -> "+count);
            }  
        }

        // Optimal Approach: Use a frequency array to count the occurrences of each character
        // TC: n, SC: 1

            System.out.println("Optimal Approach:");

            int[] freq=new int[256];
            for(int a=0;a<str.length();a++){
                freq[str.charAt(a)]++;
            }
            for(int a=0;a<str.length();a++){
                char character=str.charAt(a);
                if(freq[character]!=0){
                    System.out.println(character+" -> "+freq[character]);
                    freq[character]=0;
                }
            }

    }
}