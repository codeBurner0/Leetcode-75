class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put( nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && map.containsKey(k-nums[i])){
                if(nums[i]!=(k-nums[i])){
                    count+=Math.min(map.get(nums[i]),map.get(k-nums[i]));
                    map.remove(nums[i]);
                    map.remove(k-nums[i]);
                }else{
                    count+=Math.floor(map.get(nums[i])/2);
                    map.remove(nums[i]);
                }
            }
        }
    return count;   
    }
}