class Solution {
    public boolean isSubsequence(String s, String t) {
        int start1=0;
        int start2=0;
        int count=0;
        while(start1<s.length() && start2<t.length()){
            if(s.charAt(start1)==t.charAt(start2)){
                start1++;
                start2++;
                count++;
            }else{
                start2++;
            }
        }
        return count==s.length();
    }
}