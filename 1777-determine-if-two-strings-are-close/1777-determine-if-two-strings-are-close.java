class Solution {
    public boolean closeStrings(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        Map<Character,Integer> m =new HashMap<>();
        Map<Character,Integer> m2 =new HashMap<>();
        for(char c:s1.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        // frequency of word 2
        for(char c : s2.toCharArray()){
            m2.put(c,m2.getOrDefault(c,0)+1);
        }
        for(char c:s1.toCharArray()){
            if(!m2.containsKey(c)){
                return false;
            }
        }
        for(char c : s2.toCharArray()){
            if(!m.containsKey(c)){
                return false;
            }
        }
        HashMap<Integer,Integer> m3=new HashMap<>();
        for(char ch:s1.toCharArray()){
            m3.put(m.get(ch),m3.getOrDefault(m.get(ch),0)+1);
        }
        for(char ch:s2.toCharArray()){
            if(!m3.containsKey(m2.get(ch))){
                return false;
            }
            m3.put(m2.get(ch),m3.getOrDefault(m2.get(ch),0)-1);
            if(m3.get(m2.get(ch))==0){
                m3.remove(m2.get(ch));
            }
        }
        return m3.size()==0;

    }
}