class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split(" ");
        String ans="";
        for(int i=arr.length-1;i>0;i--){
            if(arr[i].length()!=0)
            ans+=arr[i].trim()+" ";
        }
        ans+=arr[0].trim();
        return ans;
    }
}