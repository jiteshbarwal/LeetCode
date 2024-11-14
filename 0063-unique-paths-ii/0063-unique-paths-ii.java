class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;            
        int n = obstacleGrid[0].length; 
        
        int[][] dp =  new int [m][n];
        
        for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
        dp[i][j] = -1;
    }
}  
       // return upwo( dp,m,n);
        return upwo(dp, m - 1, n - 1, obstacleGrid);

        
    }
    
    private int upwo(int [][]dp,int m ,int n,int[][] obstacleGrid ){
       // if (m == 1 || n == 1) return 1;
        if (m < 0 || n < 0 || obstacleGrid[m][n] == 1) return 0; 
        if (m == 0 && n == 0) return 1; // Starting cell


        if (dp[m][n] != -1) return dp[m][n];
        
       // if (dp[m][n]==1) return 0;
                
       // dp[m][n] = upwo(m - 1, n, dp) + upwo(m, n - 1, dp);
        dp[m][n] = upwo(dp, m - 1, n,obstacleGrid) + upwo(dp, m, n - 1,obstacleGrid);


        return dp[m][n];
    }
}