class Solution {
    // 5-10ms
    // public String mergeAlternately(String w1, String w2) {
    //     int len=Math.min(w1.length(),w2.length());
    //     int len1=w1.length()-1;
    //     int len2=w2.length()-1;
    //     int i=0;
    //     String res="";
    //     while(len>0){
    //             res+=w1.charAt(i);
    //             res+=w2.charAt(i);
    //         len--;
    //         i++;
    //     }
    //      res+=w1.substring(i);
    //      res+=w2.substring(i);
    //     return res;
    // }

    // 0ms 
    public String mergeAlternately(String w1, String w2) {
        int len=Math.min(w1.length(),w2.length());
        int i=0;
        StringBuffer res=new StringBuffer();
        while(len>0){
                res.append(w1.charAt(i));
                res.append(w2.charAt(i));
            len--;
            i++;
        }
        res.append(w1.substring(i));
        res.append(w2.substring(i));
        return res.toString();
    }
    
}