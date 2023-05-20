class Solution {
    // public int pivotIndex(int[] nums) {
    //     int j=nums.length-2;
    //     int arr[]=new int[nums.length];
    //     int arr1[]=new int[nums.length];
    //     arr1[0]=nums[0];
    //     arr[nums.length-1]=nums[nums.length-1];
    //     for(int i=1;i<nums.length;i++){
    //        arr1[i]=nums[i]+arr1[i-1];
    //        arr[j]=nums[j]+arr[j+1];
    //        j--;
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         if(arr1[i]==arr[i]){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public int pivotIndex(int[] nums) {
        int totalSum=0;
        int leftSum=nums[0];
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        if(2*leftSum==(totalSum+nums[0])){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            
            if(2*leftSum==(totalSum-nums[i])){
                return i;
            }
            leftSum+=nums[i];
            
        }
        return -1;
    }
}