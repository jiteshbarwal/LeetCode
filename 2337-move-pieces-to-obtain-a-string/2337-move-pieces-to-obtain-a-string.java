class Solution {
    public boolean canChange(String start, String target) {
        
        if (!start.replace("_", "").equals(target.replace("_", ""))) {
            return false;
        }

        int i = 0, j = 0;
        int n = start.length();

       
        while (i < n && j < n) {
            
            while (i < n && start.charAt(i) == '_') i++;
            
            while (j < n && target.charAt(j) == '_') j++;

            // If both pointers are valid
            if (i < n && j < n) {
                // Characters must match
                if (start.charAt(i) != target.charAt(j)) return false;

                // 'L' can only move left (i >= j)
                if (start.charAt(i) == 'L' && i < j) return false;

                // 'R' can only move right (i <= j)
                if (start.charAt(i) == 'R' && i > j) return false;

                // Move both pointers
                i++;
                j++;
            }
        }

        return true;
    }
}
