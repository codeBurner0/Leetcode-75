class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     int i=0,j=0,flag=0;
    //     for( i=0;i<nums.length;i++){
    //         for( j=i+1;j<nums.length;j++){
    //                 if((nums[i]+nums[j])==target){
    //                     flag=1;
    //                     break;
    //                 }
    //         }
    //         if(flag==1){
    //             break;
    //         }
    //     }
    //     System.out.print(i+" "+j);
    //     return new int[]{i,j};
    // }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0,i=0;
        for( i=0;i<nums.length;i++){
            int res=target-nums[i];
            if(map.containsKey(res)){
                j=map.get(res);
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{i,j};
    }
}