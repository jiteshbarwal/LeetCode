class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;

        if (n <= 1) {
           
            boolean[] result = new boolean[queries.length];
            for (int i = 0; i < queries.length; i++) {
                result[i] = true;
            }
            return result;
        }

        
        int[] special = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            special[i] = (nums[i] % 2 != nums[i + 1] % 2) ? 1 : 0;
        }

        
        int[] prefixSum = new int[n];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + (i - 1 < special.length ? special[i - 1] : 0);
        }

      
        boolean[] ans = new boolean[queries.length];
        int idx = 0;
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            int transitions = prefixSum[end] - prefixSum[start];
            ans[idx++] = (transitions == end - start);
        }

        return ans;
    }
}