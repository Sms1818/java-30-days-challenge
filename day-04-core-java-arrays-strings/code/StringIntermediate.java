public class StringIntermediate {
    // 1. Method to find the first non-repeating character in a string
    // TC: O(n^2) where n is the length of the string
    // SC: O(1) since we are using only a few extra variables
    public static char firstNonRepeatingCharacter(String str){
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                return str.charAt(i);
            }
        }
        return '\0'; 
    }

    // 2. Method to check if two strings are anagrams of each other(No HashMap).
    // Constraints: The method should not use any additional data structures like HashMap or arrays to count character frequencies. It should only use basic string operations and comparisons.
    // Ignore Case Diffreneces and spaces and consider only alphabets (A-Z ,a-z) for anagram checking.
    // TC: O(n^2) where n is the length of the strings (after removing spaces and non-alphabetic characters)
    // SC: O(1) since we are using only a few extra variables
    public static boolean isAnagram(String str1, String str2){
        str1=str1.replaceAll("[^a-zA-Z]","").toLowerCase();
        str2=str2.replaceAll("[^a-zA-Z]","").toLowerCase();
        if(str1.length()!=str2.length()) return false;
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            boolean alreadyChecked=false;
            for(int k = 0; k < i; k++){
                if(str1.charAt(k) == ch){
                    alreadyChecked = true;
                    break;
                }
            }
            if(alreadyChecked) continue;
            int count=0;
            for(int j=0;j<str1.length();j++){
                if(ch==str1.charAt(j)){
                    count++;
                }
                if(ch==str2.charAt(j)){
                    count--;
                }
            }
            if(count!=0){
                return false;
            }
        }
        return true;

    }

    // 3. Method to perform basic string compression using the counts of repeated characters. For example, the string "aaabbcaaa" would be compressed to "a3b2c1a3". If the compressed string is not shorter than the original string, return the original string.
    // TC: O(n) where n is the length of the string
    // SC: O(n) in the worst case when all characters are different, otherwise O(1) for the extra variables
    public static String stringCompression(String str){
        StringBuilder compressed= new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){
            if(i<str.length() && str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                compressed.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        return compressed.toString();
    }

    // 4. Method to check if one string is a rotation of another string. For example, "waterbottle" is a rotation of "erbottlewat".
    // TC: O(n) where n is the length of the strings
    // SC: O(n) for the combined string
    public static boolean isRotation(String str1, String str2){
        String combined=str1+str1;
        return combined.contains(str2);
    }

    // 5. Method to find the length of the longest substring without repeating characters in a given string. (Without using HashMap or Set)
    // TC: O(n^2) where n is the length of the string
    // SC: O(1) since we are using only a few extra variables
    public static int longestUniqueSubString(String str){
        int maxLength=0;
        for(int i=0;i<str.length();i++){
            boolean[] visited=new boolean[256]; // Assuming ASCII character set
            int length=0;
            for(int j=i;j<str.length();j++){
                char ch=str.charAt(j);
                if(visited[ch]) break;
                visited[ch]=true;
                length++;
            }
            maxLength=Math.max(maxLength, length);
        }
        return maxLength;

    }
    
    public static void main(String[] args) {

        String str="swiss";
        char result=firstNonRepeatingCharacter(str);
        if(result!='\0'){
            System.out.println("First non-repeating character: "+result);
        }else{
            System.out.println("No non-repeating character found.");
        }

        String str1="Listen gentleman";
        String str2="Silent gentleman";
        boolean anagramResult=isAnagram(str1, str2);
        if(anagramResult){
            System.out.println("\""+str1+"\" and \""+str2+"\" are anagrams.");
        }else{
            System.out.println("\""+str1+"\" and \""+str2+"\" are not anagrams.");
        }

        String str3="aaabbcaaa";
        String compressedResult=stringCompression(str3);
        System.out.println("Compressed string: "+compressedResult);

        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        boolean rotationResult = isRotation(s1, s2);
        if(rotationResult){
            System.out.println("\""+s1+"\" and \""+s2+"\" are rotations of each other.");
        }else{
            System.out.println("\""+s1+"\" and \""+s2+"\" are not rotations of each other.");
        }

        String str4="abcabcbb";
        int longestUniqueSubStringLength=longestUniqueSubString(str4);
        System.out.println("Length of the longest substring without repeating characters: "+longestUniqueSubStringLength);
        
    }
}
