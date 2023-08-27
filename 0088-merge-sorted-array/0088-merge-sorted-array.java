class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        int i=0;
        for(;i<n;i++){
            arr[i]=nums2[i];
        }
        int j=m-1;
        while(j>=0 && nums1[j]==0 ){
            j--;
        }
        while(j>=0){
            arr[i]=nums1[j];
            i++;
            j--;
        }
        Arrays.sort(arr);
        for(int k=0;k<arr.length;k++){
            nums1[k]=arr[k];
        }
    }
}