import java.util.HashMap;

class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> productCount = new HashMap<>();
        int n = nums.length;
        int count = 0;

        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];

                
                if (productCount.containsKey(product)) {
                    count += productCount.get(product) * 8; 
                }

               
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        return count;
    }
}
