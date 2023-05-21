class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        ArrayList<Boolean> al=new ArrayList<>();
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]+extraCandies>=max){
                al.add(true);
            }else{
                al.add(false);
            }
        }
        return al;
    }
}