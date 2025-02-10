class Solution {

     int helper(int [] cost,int [] dp, int n){
       if (n == 0 || n == 1) return 0;

        if (dp[n] != -1) return dp[n]; 
        int left = helper(cost, dp, n - 1) + cost[n - 1];
        int right = helper(cost, dp, n - 2) + cost[n - 2];

        dp[n] = Math.min(left, right);
        return dp[n];
    }

    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
       return helper(cost,dp,n);
    }
}