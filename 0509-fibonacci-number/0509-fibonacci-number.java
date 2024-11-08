class Solution {
    public int fib(int n) {
        if (n <= 1) return n; // Base case for 0 or 1
        
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
  
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n]; // Return the nth Fibonacci number
    }
}
