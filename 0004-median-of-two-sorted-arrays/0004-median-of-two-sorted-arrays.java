class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int n=num1.length;
        int m=num2.length;
        int num[]=new int[n+m];
        int i=0;
        for(i=0;i<n;i++){
            num[i]=num1[i];
        }
        int mi=i;
        for(i=0;i<m;i++){
            num[mi++]=num2[i];
        }
        Arrays.sort(num);
        int s=n+m;
        if((s)%2==0){
            return (double)(num[s/2]+num[(s/2)-1])/2;
        }else{
            return (double)(num[s/2]);
        }
    }
}