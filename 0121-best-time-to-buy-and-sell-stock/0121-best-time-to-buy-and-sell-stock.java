class Solution {
    public int maxProfit(int[] nums) {
        int min=nums[0];
        int maxi=0;
        for(int i=1;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]-min);
            min=Math.min(min,nums[i]);
        }
        return maxi;
    }
}