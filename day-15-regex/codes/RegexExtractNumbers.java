
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Problem Statement

Given a string, extract all numbers from it using regex.

📌 Requirements
Input string may contain:
letters
digits
special characters
Extract all continuous digit sequences
Print each number separately
🎯 Example
Input:
abc123xyz45pqr6789
Output:
123
45
6789
*/

// Output
// 123
// 45
// 6789


public class RegexExtractNumbers {
    public static List<String> extractNumbers(String input){
        List<String> numbers = new ArrayList<>();
        String regex="\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        while (matcher.find()) {
            numbers.add(matcher.group());
        }
        return numbers;
        
    }
    public static void main(String[] args) {
        String input="abc123xyz45pqr6789";
        List<String> numbers=extractNumbers(input);
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}