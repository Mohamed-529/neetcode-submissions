class Solution {
    public int maxProfit(int[] prices) {
        int sell=0,profit=0;

        for (int buy=1;buy<prices.length;buy++){
            if (prices[sell]>prices[buy]){
                sell=buy;
            } else {
                profit=Math.max(profit,prices[buy]-prices[sell]);
            }
        }

        return profit;
    }
}
