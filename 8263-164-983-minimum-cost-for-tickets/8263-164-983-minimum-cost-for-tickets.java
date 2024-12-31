class Solution {

    public int solve(int n, int[] days, int[] costs, int[] dp, int index) {
        if (index >= n) {
            return 0;
        }

        if (dp[index] != -1) {
            return dp[index];
        }

        // Option 1: 1-day pass
        int option1 = costs[0] + solve(n, days, costs, dp, index + 1);

        // Option 2: 7-day pass
        int i;
        for (i = index; i < n && days[i] < days[index] + 7; i++);
        int option2 = costs[1] + solve(n, days, costs, dp, i);

        // Option 3: 30-day pass
        for (i = index; i < n && days[i] < days[index] + 30; i++);
        int option3 = costs[2] + solve(n, days, costs, dp, i);

        
        dp[index] = Math.min(option1, Math.min(option2, option3));

        return dp[index];
    }

    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        return solve(n, days, costs, dp, 0);
    }
}
