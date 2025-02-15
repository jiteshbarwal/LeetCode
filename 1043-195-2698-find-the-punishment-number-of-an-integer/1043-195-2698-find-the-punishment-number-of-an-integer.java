class Solution {
    public int punishmentNumber(int n) {
        int punishmentSum = 0;
        for (int i = 1; i <= n; i++) {
            if (isPunishable(i)) {
                punishmentSum += i * i;
            }
        }
        return punishmentSum;
    }

    private boolean isPunishable(int i) {
        String sq = String.valueOf(i * i);
        return backtrack(sq, 0, i);
    }

    private boolean backtrack(String sq, int index, int targetSum) {
        if (index == sq.length()) {
            return targetSum == 0;
        }

        for (int j = index; j < sq.length(); j++) {
            int substring = Integer.parseInt(sq.substring(index, j + 1));
            if (backtrack(sq, j + 1, targetSum - substring)) {
                return true;
            }
        }
        return false;
    }
}