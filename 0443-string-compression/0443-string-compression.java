class Solution {
    public int compress(char[] nums) {
        int n=nums.length;
        if(n==1){
            return 1;
        }
        int i=0; int j=0;
        while(i<n){
            int count=1;
            while(i<(n-1) && nums[i]==nums[i+1]){
                count++;
                i++;
            }
            nums[j++]=nums[i++];
            if(count>1){
                String str=Integer.toString(count);
                int len=str.length();
                for(int k=0;k<len;k++){
                nums[j]=str.charAt(k);
                j++;
                }
            }

        }
        return j;
    }
}


// Integer.toString  convert integer to string