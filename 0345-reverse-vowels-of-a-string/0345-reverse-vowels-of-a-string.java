class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        ArrayList<Character> al=new ArrayList<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                al.add(s.charAt(i));
            }
        }
        int j=al.size()-1;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                ans+=al.get(j);
                j--;
            }else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}