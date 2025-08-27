class Solution {
    public int maxProfit(int[] nums) {
        int minprofit = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i =0; i < nums.length ;i++) {
            if(nums[i] < minprofit) {
                minprofit = nums[i];
            }

            else {
                maxprofit = Math.max(maxprofit,nums[i]-minprofit);
            }
        }
        return maxprofit;
    }
}