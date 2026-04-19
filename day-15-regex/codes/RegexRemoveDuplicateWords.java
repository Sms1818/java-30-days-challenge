
import java.util.regex.Pattern;

/*
Problem Statement

Given a sentence, remove consecutive duplicate words using regex.

📌 Requirements
Words are separated by spaces
Remove only adjacent duplicates
Keep only one occurrence
Case-sensitive (for now)
🎯 Example
Input:
this is is a a test test string
Output:
this is a test string
*/

public class RegexRemoveDuplicateWords {
    public static String uniqueWords(String input){
        String regex="\\b(\\w+)\\s+\\1\\b";
        String result=input;
        while(Pattern.compile(regex).matcher(input).find()){
            result=result.replaceAll(regex, "$1");
        }
        return result;
    }
    public static void main(String[] args) {
        String input = "this is is a a test test string";
        String output = uniqueWords(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}