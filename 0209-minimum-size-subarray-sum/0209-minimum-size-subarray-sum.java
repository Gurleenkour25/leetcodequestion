class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int n = nums.length;
      //int i =0 ;
      int j =0;
      int sum =0;
      int mini = n+1 ;

      for(int i = 0 ;i<n ;i++)
      {
        sum += nums[i];
        while(sum >= target)
        {
            sum = sum-nums[j];
            mini=Math.min(mini,i-j+1);
            j++;
        }
      }

      return (mini==n+1)?0:mini; 
    }
}