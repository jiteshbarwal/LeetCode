class Solution {

    int binary_search(int nums[], int target,int s,int e){
        if (s>e){
            return -1;
        }
        int mid = s+(e-s)/2;

        if (nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
            return binary_search(nums,target,s,mid-1);
        }
        return binary_search(nums,target,mid+1,e);

    }

    public int search(int[] nums, int target) {
        int e= nums.length-1;
        return binary_search(nums,target,0,e);
    }
}