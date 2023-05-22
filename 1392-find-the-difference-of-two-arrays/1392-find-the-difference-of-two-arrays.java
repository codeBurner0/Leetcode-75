class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        for(int num1:set1){
                if(!set2.contains(num1)){
                res.add(num1);
          }  
        }
        ans.add(new ArrayList<>(res));
        res.clear();
        for(int num2:set2){
                if(!set1.contains(num2)){
                res.add(num2);
          }  
        }
        ans.add(new ArrayList<>(res));
        return ans;
    }
}