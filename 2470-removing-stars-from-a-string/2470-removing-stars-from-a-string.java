class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        String res="";
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        int n=stack.size();
        for(int i=0;i<n;i++){
            char ch=stack.pop();
            res=ch+res;
        }
        return res;
    }
}