class Solution {
    public int[] productExceptSelf(int[] nums) {
        int out[]=new int[nums.length];
        int pro=1;
        for(int i=0;i<nums.length;i++){
            out[i]=pro;
            pro*=nums[i];
        }
        int rpro=1;
        for(int i=nums.length-1;i>=0;i--){
            out[i]=out[i]*rpro;
            rpro*=nums[i];
        }
        return out;
    }
}