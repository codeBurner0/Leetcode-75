class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        if(n==0){
            arr[0]=0;
            return arr;
        }
        if(n==1){
            arr[0]=0;
            arr[1]=1;
            return arr;
        }
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=count(i);
        }
        return arr;
    }
    public static int count(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return count(n/2);
        }else{
            return 1+count(n/2);
        }
    }
}