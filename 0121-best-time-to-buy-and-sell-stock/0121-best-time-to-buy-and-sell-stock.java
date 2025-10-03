class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max_profit =0;
        int buyat = prices[0];

        for(int i=0;i < n ;i++)
        {
            int curr_profit = prices[i]-buyat;
            if(curr_profit>max_profit)
            {
                max_profit = curr_profit;
            }
            if(prices[i]<buyat)
            {
                buyat = prices[i];
            }
        }

        return max_profit;
    }
}