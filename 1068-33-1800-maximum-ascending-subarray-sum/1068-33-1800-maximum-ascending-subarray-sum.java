class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
       int  sum = nums[0];
       int max =nums[0];
        for (int i=1;i<n;i++){
            if (nums[i]>nums[i-1]){
                sum=sum+nums[i];
                
            }
            else {
              max = Math.max(max, sum);  // ✅ Update max before resetting sum
                sum = nums[i];
            }
            System.out.println(max);
            System.out.println(sum);
        }
        return Math.max(max,sum);
    }
}