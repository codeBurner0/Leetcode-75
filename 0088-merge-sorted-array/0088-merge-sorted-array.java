class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=m+n-1;
        while(j>=0 && j-m>=0 && nums1[j]==0 ){
            nums1[j]=nums2[j-m];
            j--;
        }
        Arrays.sort(nums1);
    }
}