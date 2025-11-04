class Solution {
    public int removeDuplicates(int[] nums) {
      int count = 1;
      int index = 0;

      for(int i = 1 ; i < nums.length ; i++) {
       if(nums[index]!= nums[i])
       {
         nums[index+1] = nums[i];
         index++;
         count++;
       } 
    }
    
    return count;
    }
}