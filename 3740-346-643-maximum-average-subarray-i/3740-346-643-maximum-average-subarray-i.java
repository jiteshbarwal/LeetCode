class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n= nums.length;
        double sum=0;
        double avg=0;
        if (n==1){
            return nums[0];
        }
        
        if (n==k){
            for (int i=0;i<n;i++){
                sum=nums[i]+sum;
            }
           return sum / k;
        }
        for (int i=0;i<k;i++){
            sum+=nums[i];
           
        }
      avg=sum/k;
       System.out.println(avg);
      for (int i=k;i<n;i++){
       sum = sum - nums[i - k] + nums[i];
    avg = Math.max(avg, sum / k);
      }

      return avg;
    }
}