import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] dist = new int[rows][cols];
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> queue = new LinkedList<>();

       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                } else {
                    dist[i][j] = Integer.MAX_VALUE; 
                }
            }
        }

       
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Perform BFS
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && !visited[newRow][newCol]) {
                    dist[newRow][newCol] = dist[row][col] + 1;
                    queue.add(new int[]{newRow, newCol});
                    visited[newRow][newCol] = true;
                }
            }
        }

        return dist;
    }
}
