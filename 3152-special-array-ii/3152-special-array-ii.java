class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = 1;

        for (int i = 1; i < n; i++) {
            if ((nums[i] & 1) == (nums[i - 1] & 1)) {
                prefixSum[i] = 1;
            } else {
                prefixSum[i] = 1 + prefixSum[i - 1];
            }
        }

        // Use a boolean array instead of List<Boolean>
        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int size = end - start + 1;

            if (prefixSum[end] >= size) {
                ans[i] = true;
            } else {
                ans[i] = false;
            }
        }
        return ans;
    }
}