class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor = image[sr][sc];
        
        if (initialColor != color) {
            dfs(image, sr, sc, initialColor, color);
        }
        return image;
    }

    private void dfs(int[][] image, int row, int col, int initialColor, int newColor) {
      
        if (row < 0 || col < 0 || row >= image.length || col >= image[0].length || image[row][col] != initialColor) {
            return;
        }

        
        image[row][col] = newColor;

        
        dfs(image, row + 1, col, initialColor, newColor); // Down
        dfs(image, row - 1, col, initialColor, newColor); // Up
        dfs(image, row, col + 1, initialColor, newColor); // Right
        dfs(image, row, col - 1, initialColor, newColor); // Left
    }
}
