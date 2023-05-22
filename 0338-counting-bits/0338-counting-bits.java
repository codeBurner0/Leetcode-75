class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=count(i,arr);
        }
        return arr;
    }
    public static int count(int n,int[] memo){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(memo[n]!=0){
            return memo[n];
        }
        if(n%2==0){
            memo[n]=count(n/2,memo);
            return count(n/2,memo);
        }else{
            memo[n]=1+count(n/2,memo);
            return 1+count(n/2,memo);
        }
    }
}