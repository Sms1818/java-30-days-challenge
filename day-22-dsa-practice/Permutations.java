
import java.util.ArrayList;
import java.util.List;

/*
Problem

Given an array of distinct integers, return all possible permutations.

Example:
Input: [1,2,3]

Output:
[
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
]
 */

public class Permutations {
    // Approach: Backtracking
    // Time Complexity: O(n * n!) - There are n! permutations and generating each permutation takes O(n) time.
    // Space Complexity: O(n) - The space used by the recursion stack and the current permutation list.
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        backtrack(nums,visited,new ArrayList<>(),res);
        return res;
        
    }
    public static void backtrack(int[] nums, boolean[] visited,List<Integer> current, List<List<Integer>> res){
        if(current.size()==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            visited[i]=true;
            current.add(nums[i]);
            backtrack(nums,visited,current,res);
            current.remove(current.size()-1);
            visited[i]=false;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);

    }
}
