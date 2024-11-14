class Solution {
    public int minPathSum(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        
        int [][]dp = new int [m][n];
        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        
        return helper(m-1,n-1,grid,dp);
    }
    
    private int helper(int m,int n, int [][] grid, int [][]dp){
        
        if (m<0||n<0){
             return (int) Math.pow(10, 9); 
        }
        
        if (m==0 && n==0){
            return grid[m][n];
        }
        
        if (dp[m][n]!= -1){
            return dp[m][n];
        }
        
        int left = grid[m][n] + helper(m-1,n,grid,dp);
        int up = grid[m][n] + helper(m,n-1,grid,dp);
        dp[m][n] = Math.min(left, up);
        return dp[m][n];
    }
}