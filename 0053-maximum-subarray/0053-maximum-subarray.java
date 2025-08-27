class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int currsum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            currsum += nums[i];
          maxi = Math.max(maxi,currsum);

           if(currsum < 0) {
                currsum = 0;
            }
        }
        return maxi;
    }
}