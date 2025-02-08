class Solution {

    public int helper(int [] nums , int [] dp,int n){
           if (n < 0) return 0;  // Base case: No houses left to rob
        if (dp[n] != -1) return dp[n];

        //    if(dp[n]==2){
        //     return 2;
        //    }
       int left = helper(nums, dp, n - 1);

        // Right Choice: Rob current house, but skip the next adjacent house
        int right = nums[n] + helper(nums, dp, n - 2);

        // Store and return the maximum of both choices
        return dp[n] = Math.max(left, right);
    }
    public int rob(int[] nums) {
        int dp[]= new int [nums.length];
        for (int i=0;i<nums.length;i++){
            dp[i]=-1;
        }
        int n= nums.length;
        
       return helper(nums,dp,n-1);
    }
}