class Solution {
    public int maxProfit(int[] prices) {
        int bp=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<prices[i-1])
            {
                bp=prices[i];
            }
            else{
                maxprofit +=prices[i] - prices[i - 1];
            }
        }
        return maxprofit;
    }
}