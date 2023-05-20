class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[count];
                nums[count]=nums[i];
                nums[i]=temp;
                count++;
            }
        }
    }
}

// 1.take two pointers 
// 2.one tpoint to the  non zero element and second point to zero
// 3. swap both the pointers  when non zero pointer point non zero element and increase the zero pointer by 1.
