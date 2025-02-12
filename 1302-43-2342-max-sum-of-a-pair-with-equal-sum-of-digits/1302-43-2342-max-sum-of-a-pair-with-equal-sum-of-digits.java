import java.util.*;

class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, List<Integer>> ans = new HashMap<>();
        int n = nums.length;

       
        for (int num : nums) {
            int sum = 0, temp = num;
            
            while (temp != 0) {
                sum += temp % 10; 
                temp /= 10;       
            }

            
            ans.computeIfAbsent(sum, k -> new ArrayList<>()).add(num);
        }

        int maxSum = -1;

        
        for (List<Integer> values : ans.values()) {
            if (values.size() > 1) {  
                Collections.sort(values, Collections.reverseOrder()); 
                maxSum = Math.max(maxSum, values.get(0) + values.get(1)); 
            }
        }

        return maxSum;
    }
}
