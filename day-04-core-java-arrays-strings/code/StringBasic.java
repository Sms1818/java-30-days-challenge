public class StringBasic {
    // 1. Method to reverse a string
    public static String reverseString(String str){
        // Using StringBuilder for efficient string manipulation
        // TC: O(n) where n is the length of the string
        // SC: O(n) for the reversed string
        // StringBuilder reversed=new StringBuilder(str);
        // return reversed.reverse().toString();


        // Using a character array to reverse the string
        // TC: O(n) where n is the length of the string
        // SC: O(n) for the character arrays
        char[] chars=str.toCharArray();
        int left=0;
        int right=chars.length-1;
        while(left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);

    }

    // 2. Method to check if a string is a palindrome
    public static boolean isPalindrome(String str){
        // Using two pointers to check if the string is a palindrome
        // TC: O(n) where n is the length of the string
        // SC: O(1) since we are using only a few extra variables
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 3. Method to count the number of vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str){
        // Using a single pass to count vowels and consonants
        // TC: O(n) where n is the length of the string
        // SC: O(1) since we are using only a few extra variables
        int vowels=0;
        int consonants=0;
        for(char ch:str.toLowerCase().toCharArray()){
            if(Character.isLetter(ch)){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    // 4. Method to remove duplicate characters from a string
    public static String removeDuplicates(String str){
        // TC: O(n^2) in the worst case due to indexOf inside the loop, but can be optimized using a HashSet
        // SC: O(n) for the resulting string
        String res="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(res.indexOf(ch)==-1){
                res+=ch;
            }
        }
        return res;
    }

    // 5. Method to check if two strings are anagrams of each other
    public static boolean isAnagram(String str1, String str2){
        // TC: O(n) where n is the length of the strings (assuming they are of the same length)
        // SC: O(1) since we are using a fixed-size frequency array
        if(str1.length()!=str2.length()) return false;
        int[] freq=new int[26];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }  
        for(int num:freq){
            if(num!=0) return false;
        } 
        return true;
    }
    public static void main(String[] args) {
        System.out.println("String Basics:");
        String str="Hello, World!";
        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+reverseString(str));

        String palindromeStr="madam";
        System.out.println("Is '"+palindromeStr+"' a palindrome? "+isPalindrome(palindromeStr));

        String countStr="Programming is fun!";
        int[] counts=countVowelsAndConsonants(countStr);
        System.out.println("In the string '"+countStr+"':");
        System.out.println("Vowels: "+counts[0]);
        System.out.println("Consonants: "+counts[1]);

        String dupStr="hello world";
        System.out.println("Original String: "+dupStr);
        System.out.println("String after removing duplicates: "+removeDuplicates(dupStr));

        String anagramStr1="listen";
        String anagramStr2="silent";
        System.out.println("Are '"+anagramStr1+"' and '"+anagramStr2+"' anagrams? "+isAnagram(anagramStr1, anagramStr2));
    }
}
