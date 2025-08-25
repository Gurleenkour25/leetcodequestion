class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprice = 0;
        for(int num : prices) {
            if(num < minprice) {
                minprice = num;
            }
            else {
                maxprice = Math.max(maxprice , num - minprice);
            }
        }
        return maxprice;
    }
}