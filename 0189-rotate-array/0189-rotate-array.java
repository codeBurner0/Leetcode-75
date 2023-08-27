class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        helper(nums,0,nums.length-k-1);
        helper(nums,nums.length-k,nums.length-1);
        helper(nums,0,nums.length-1);
        
    }
    public static void helper(int nums[],int s,int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}