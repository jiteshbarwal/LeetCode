import java.util.HashMap;

class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

       
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int operations = 0;

        
        for (int count : freqMap.values()) {
            if (count == 1) return -1; 
            
            
            operations += count / 3;

            
            if (count % 3 != 0) {
                operations++;
            }
        }

        return operations;
    }
}
