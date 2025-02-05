import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> ans = new HashMap<>();

        for (int num : nums) {
            if (ans.containsKey(num)) {
                return true; 
            }
            ans.put(num, true); 
        }
        return false;
    }
}
