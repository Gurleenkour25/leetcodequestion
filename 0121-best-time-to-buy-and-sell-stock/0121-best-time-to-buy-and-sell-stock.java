class Solution {
    public int maxProfit(int[] nums) {

        int buystock = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0 ; i <nums.length; i++)
        {
            if(nums[i] < buystock)
            {
                buystock = nums[i];
            }

            profit = Math.max(profit , nums[i] - buystock);
        }


        return profit;
        
    }
}