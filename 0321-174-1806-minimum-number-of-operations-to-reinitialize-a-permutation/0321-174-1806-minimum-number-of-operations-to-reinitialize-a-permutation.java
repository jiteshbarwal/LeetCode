class Solution {
    public int reinitializePermutation(int n) {
        int[] perm = new int[n];
        for (int i = 0; i < n; i++) {
            perm[i] = i;
        }
        
        int[] original = perm.clone();
        int[] temp = new int[n];
        int operations = 0;
        
        while (true) {
            operations++;
            
            // Perform the operation
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    temp[i] = perm[i / 2];
                } else {
                    temp[i] = perm[n / 2 + (i - 1) / 2];
                }
            }
            
            // Check if we've returned to the original permutation
            boolean isOriginal = true;
            for (int i = 0; i < n; i++) {
                if (temp[i] != original[i]) {
                    isOriginal = false;
                    break;
                }
            }
            if (isOriginal) break;

            // Update perm for the next operation
            System.arraycopy(temp, 0, perm, 0, n);
        }
        
        return operations;
    }
}
