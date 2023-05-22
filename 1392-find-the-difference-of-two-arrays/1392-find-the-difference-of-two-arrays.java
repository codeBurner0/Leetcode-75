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
        Integer[] arr1 = set1.toArray( new Integer[set1.size()] );
        Integer[] arr2 = set2.toArray( new Integer[set2.size()] );
        for(int i=0;i<arr1.length;i++){
                if(!set2.contains(arr1[i])){
                res.add(arr1[i]);
          }  
        }
        ans.add(new ArrayList<>(res));
        res.clear();
        for(int i=0;i<arr2.length;i++){
                if(!set1.contains(arr2[i])){
                res.add(arr2[i]);
          }  
        }
        ans.add(new ArrayList<>(res));
        return ans;
    }
}