import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
        int n = nums.length;
        
        // Calculate the two possible maximum products
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];
        
        // Return the maximum of these two products
        return Math.max(product1, product2);
    }
}
