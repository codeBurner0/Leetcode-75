class Solution {
    // public String reverseVowels(String s) {
        // HashSet<Character> set=new HashSet<>();
        // set.add('a');
        // set.add('e');
        // set.add('i');
        // set.add('o');
        // set.add('u');
        // set.add('A');
        // set.add('E');
        // set.add('I');
        // set.add('O');
        // set.add('U');

    //     ArrayList<Character> al=new ArrayList<>();
    //     String ans="";
    //     for(int i=0;i<s.length();i++){
    //         if(set.contains(s.charAt(i))){
    //             al.add(s.charAt(i));
    //         }
    //     }
    //     int j=al.size()-1;
    //     for(int i=0;i<s.length();i++){
    //         if(set.contains(s.charAt(i))){
    //             ans+=al.get(j);
    //             j--;
    //         }else{
    //             ans+=s.charAt(i);
    //         }
    //     }
    //     return ans;
    // }


    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
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
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(!set.contains(ch[start])){
                start++;
            }
            if(!set.contains(ch[end])){
                end--;
            }
            if(set.contains(ch[start]) && set.contains(ch[end])){
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        String str=String.valueOf(ch);
        return str;
    }
}