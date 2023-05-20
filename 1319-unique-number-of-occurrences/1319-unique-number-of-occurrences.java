class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                nums[i]=0;
            }else{
                map.put(nums[i],1);
            }
        }
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
            //     if(set.contains(map.get(nums[i]))){
            //     return false;
            // }else{
            //     set.add(map.get(nums[i]));
            // }
        //     }
            
        // }

        for(int val:map.values()){
            if(set.contains(val)){
                return false;
            }else{
                set.add(val);
            }
        }
        return true;
    }
}

// map.put(x, map.getOrDefault(x, 0) + 1);