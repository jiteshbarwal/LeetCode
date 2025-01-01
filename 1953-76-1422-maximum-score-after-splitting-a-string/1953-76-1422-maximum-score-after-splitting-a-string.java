class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int maxScore = Integer.MIN_VALUE;

        
        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                totalOnes++;
            }
        }

        int leftZeroes = 0; 
        int rightOnes = totalOnes; 
        for (int i = 0; i < n - 1; i++) { 
            if (s.charAt(i) == '0') {
                leftZeroes++;
            } else {
                rightOnes--;
            }

            // Update max score
            int score = leftZeroes + rightOnes;
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }
}
