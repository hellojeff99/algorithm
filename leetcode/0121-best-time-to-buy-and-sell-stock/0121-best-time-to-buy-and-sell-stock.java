class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = prices[0];
        int profit = sell - buy;

        for (int i = 1; i < prices.length; i++) {
            if (profit < prices[i] - buy) {
                sell = prices[i];
                profit = sell - buy;
            }

            if (buy > prices[i]) {
                buy = prices[i];
                sell = prices[i];    
            }
            
        }
        return profit;
    }
}