
class Solution {
    public static int stockBuyAndSell(int n, int[] prices) {
        // code here
        int profit=0;
        for(int i=1;i<n;i++)
        {
            if(prices[i-1]<prices[i])
            {
                profit = profit+(prices[i]-prices[i-1]);
            }
        }
    return profit;
    }
}
 
