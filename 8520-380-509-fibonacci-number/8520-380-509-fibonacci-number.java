class Solution {

    public int helper(int n, int [] dp){
        
        

        
        if (dp[n] !=-1){
            return dp[n];
        }

        if (n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        
        dp[n]= helper(n-1,dp)+helper(n-2,dp);
        return dp[n];
    }

    public int fib(int n) {
     int [] dp = new int [n+1];
     Arrays.fill(dp,-1);
      return helper(n,dp);
    }
}