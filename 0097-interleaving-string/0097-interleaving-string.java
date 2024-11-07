class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        // If lengths don't match, s3 can't be an interleave
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        // DP array to store intermediate results
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];

        // Initialize dp[0][0] as true since an empty s1 and s2 can form an empty s3
        dp[0][0] = true;

        // Fill in the first row (using only s1)
        for (int i = 1; i <= s1.length(); i++) {
            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        }

        // Fill in the first column (using only s2)
        for (int j = 1; j <= s2.length(); j++) {
            dp[0][j] = dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }

        // Fill in the rest of the dp array
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1))
                           || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }

        return dp[s1.length()][s2.length()];
    }
}
