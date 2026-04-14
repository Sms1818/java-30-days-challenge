import java.util.Arrays;

/*
Problem:
Given an array of strings, find the longest common prefix among them.
If no common prefix exists, return "".

Example:
Input: ["flower", "flow", "flight"]
Output: "fl"

Input: ["dog", "racecar", "car"]
Output: ""
*/

public class LongestCommonPrefix {

    /*
    Approach 1: Vertical Scanning

    Idea:
    - Compare characters column by column (same index across all strings)
    - Stop when a mismatch occurs or any string ends

    Time Complexity:
    - O(n * m)
      n = number of strings
      m = length of shortest string

    Space Complexity:
    - O(1) (no extra space used)
    */
    public static String verticalScanning(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                // If index exceeds current string OR characters mismatch
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0]; // entire first string is common prefix
    }

    /*
    Approach 2: Sorting Based

    Idea:
    - Sort the array lexicographically
    - The most different strings will be first and last
    - Compare only these two to get the common prefix

    Time Complexity:
    - O(n log n * m)
      Sorting takes O(n log n), each comparison up to O(m)

    Space Complexity:
    - O(log n) (depends on sorting implementation - recursion stack)

    Note:
    - Cleaner logic but not more optimal than brute force
    */
    public static String optimal(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while (i < first.length() &&
               i < last.length() &&
               first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {

        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println("Vertical Scanning:");
        System.out.println("LCP: " + verticalScanning(strs1)); // fl
        System.out.println("LCP: " + verticalScanning(strs2)); // ""

        System.out.println("\nSorting Approach:");
        System.out.println("LCP: " + optimal(strs1)); // fl
        System.out.println("LCP: " + optimal(strs2)); // ""
    }
}

