class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start^goal;
       // System.out.println(xor);
        int count=0;
        while(xor>0){
            xor = xor& (xor-1);
            count++;
        }
        return count;
    }
}