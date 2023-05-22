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

    // public String reverseWords(String s) {
    //     Stack<String> stack=new Stack<>();
    //     String temp="";
    //     String res="";
    //     for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)!=' '){
    //             temp+=s.charAt(i);
    //         }else{
    //             if(temp.length()>0){
    //                 stack.push(temp);
    //                 temp="";
    //             }
    //         }
    //     }
    //     res=res+temp;
    //     while(!stack.isEmpty()){
    //         res+=" ";
    //         res+=stack.pop();
            
    //     }
    //     if(res.charAt(0)==' ' && res.length()>0){
    //         return res.substring(1);
    //     }
    //     return res;
    // }
}