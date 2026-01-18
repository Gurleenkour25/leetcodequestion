class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int mini = Integer.MAX_VALUE;
      int j = 0;
      int sum = 0;
      for(int  i = 0 ; i < nums.length ; i++){
        sum = sum + nums[i];
         
         while(sum >= target)
         {
             mini = Math.min(mini,i-j+1);

             sum = sum-nums[j];
             j++;
         }
      }
        
if(mini == Integer.MAX_VALUE)
{
   return 0;
}
        return mini;
    }
}