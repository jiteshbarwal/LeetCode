class Solution {
    public int getWinner(int[] arr, int k) {
        
        ArrayList<Integer> list = new ArrayList<>();
       int winner = arr[0];
            int win_count = 0;
            for (int i = 1; i < arr.length; i++) {
                if (winner > arr[i]) {
                    win_count++;
                } else {
                    winner = arr[i];
                    win_count = 1;
                }
                if (win_count == k)
                    return winner;
            }

            return winner;
                    }
}