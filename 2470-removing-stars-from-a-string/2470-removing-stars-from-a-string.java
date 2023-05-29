class Solution {
    // public String removeStars(String s) {
    //     Stack<Character> stack=new Stack<>();
    //     String res="";
    //     for(char ch:s.toCharArray()){
    //         if(ch=='*'){
    //             stack.pop();
    //         }else{
    //             stack.push(ch);
    //         }
    //     }
    //     int n=stack.size();
    //     for(int i=0;i<n;i++){
    //         char ch=stack.pop();
    //         res=ch+res;
    //     }
    //     return res;
    // }
    public String removeStars(String s) {
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                c.deleteCharAt(c.length() - 1);
            } else {
                c.append(s.charAt(i));
            }
        }
        return c.toString();
    }
}