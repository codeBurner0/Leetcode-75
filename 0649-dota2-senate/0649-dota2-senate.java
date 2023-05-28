class Solution {
    public String predictPartyVictory(String s) {
       Queue<Integer> rad=new LinkedList<>();
       Queue<Integer> dir=new LinkedList<>();  
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='R'){
               rad.offer(i);
           }else{
               dir.offer(i);
           }
       }
    int count=-1;
       while(rad.size()>0 && dir.size()>0){
           count++;
           int Rval=rad.poll();
           int Dval=dir.poll();
           if(Rval<Dval){
               rad.offer(s.length()+count);
           }else{
               dir.offer(s.length()+count);
           }
       }

       return (rad.size()!=0)?"Radiant":"Dire";
    }
}