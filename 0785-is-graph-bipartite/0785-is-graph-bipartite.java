import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n]; 
        for (int i = 0; i < n; i++) {
            color[i] = -1;
        }
        
       
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) { 
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                color[i] = 0;
                
                while (!queue.isEmpty()) {
                    int node = queue.poll();
                    for (int neighbor : graph[node]) {
                        if (color[neighbor] == -1) { 
                            color[neighbor] = 1 - color[node]; 
                            queue.add(neighbor);
                        } else if (color[neighbor] == color[node]) {
                          
                            return false;
                        }
                    }
                }
            }
        }
        return true; // If no conflicts, graph is bipartite
    }
}
