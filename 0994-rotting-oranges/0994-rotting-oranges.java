class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        // Initialize the queue with all rotten oranges and count fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j}); // Add rotten orange to the queue
                } else if (grid[i][j] == 1) {
                    freshCount++; // Count fresh oranges
                }
            }
        }

        if (freshCount == 0) return 0; // No fresh oranges to rot

        int time = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // Right, Down, Left, Up

        // Perform BFS
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;

            for (int i = 0; i < size; i++) {
                int[] orange = queue.poll();
                int row = orange[0];
                int col = orange[1];

                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];

                    // Check if the new position is within bounds and contains a fresh orange
                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2; // Rot the orange
                        queue.add(new int[]{newRow, newCol});
                        freshCount--; // Decrease the count of fresh oranges
                        rotted = true;
                    }
                }
            }

            if (rotted) time++; // Increment time if at least one orange rotted in this step
        }

        // If there are still fresh oranges, return -1
        return freshCount == 0 ? time : -1;
    }
}
