class Solution {
    public int maxProfit(int[] prices) {
       int  buy=prices[0];
       int  mprofit=0;
       for(int i=0;i<prices.length;i++)
       {
        if(prices[i]<buy)
        {
            buy=prices[i];
        }
        mprofit=Math.max(mprofit,);
       }
       return mprofit;

    }
}