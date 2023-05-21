class Solution {
    public int maxArea(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int max=0;
        while(start<=end){
            int res=Math.min(nums[start],nums[end]);
            max=Math.max(max,res*(end-start));
            if(nums[start]<nums[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}