class Solution {
    public int uniquePaths(int m, int n) {
       
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }

       
        return uniquePathsMemo(m, n, dp);
    }

    private int uniquePathsMemo(int m, int n, int[][] dp) {
       
        if (m == 1 || n == 1) return 1;

        if (dp[m][n] != -1) return dp[m][n];

        
        dp[m][n] = uniquePathsMemo(m - 1, n, dp) + uniquePathsMemo(m, n - 1, dp);

        return dp[m][n];
    }
}
