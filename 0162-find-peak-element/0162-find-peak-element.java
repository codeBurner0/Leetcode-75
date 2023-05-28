class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int res=0;
        while(start<=end){
            if(nums[start]>=nums[end] && nums[start]>nums[res]){
                res=start;
            }
            else if(nums[end]>nums[start] && nums[end]>nums[res]){
                res=end;
            }
            start++;
            end--;
        }
        return res;
    }
}