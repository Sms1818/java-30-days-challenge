
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static int[] frequentElements(int[] nums, int k){
        Map<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.offer(entry);
        }
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=pq.poll().getKey();
        }
        return result;

    }
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int k=2;
        System.out.println("Input: nums = [1,1,1,2,2,3], k = 2");
        int[] result=frequentElements(nums, k);
        System.out.print("Output: [");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
            if(i<result.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}