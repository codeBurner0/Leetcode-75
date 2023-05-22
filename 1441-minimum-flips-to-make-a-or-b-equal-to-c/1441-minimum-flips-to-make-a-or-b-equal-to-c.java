class Solution {
    public int minFlips(int a, int b, int c) {
        int res=0;
        for(int i=0;i<32;i++){
            boolean ai=false;
            boolean bi=false;
            boolean ci=false;
            if((a & (1<<i))>0) ai=true;
            if((b & (1<<i))>0) bi=true;
            if((c & (1<<i))>0) ci=true;
            if(!ci){
                if(ai && bi) res+=2;
                else if(ai || bi) res+=1;
            }else{
                if(!ai && !bi) res+=1;
            }
        }
        return res;
    }
}

