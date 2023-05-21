class Solution {
    public boolean canPlaceFlowers(int[] arr, int v) {
        int count=0;
        int n=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if((i==(n) || arr[i+1]==0)  && (i==0 || arr[i-1]==0) && arr[i]==0){
                arr[i]=1;
                count++;
            }
        }
        return count>=v;
    }
}