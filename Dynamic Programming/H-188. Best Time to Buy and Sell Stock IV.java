class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        k = k * 2;  // k transactions means 'k' times buy & sell, hence k *= 2
        int[][] dp = new int[n][k+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        return helper(prices, n, 0, k, dp);
    }
    public int helper(int[] prices, int n, int i, int k,int[][] dp){
        if(i == n || k == 0){
            return 0;
        }
        if(dp[i][k] != -1){
            return dp[i][k];
        }
        if(k%2 == 0){  // will buy when k value is even
            int buy = helper(prices, n, i+1, k-1, dp) - prices[i];
            int pass = helper(prices, n, i+1, k, dp);
            dp[i][k] = Math.max(buy, pass);
        }
        else{  // will sell when k value is odd
            int sell = helper(prices, n, i+1, k-1, dp) + prices[i];
            int pass = helper(prices, n, i+1, k, dp);
            dp[i][k] = Math.max(sell, pass);
        }
        return dp[i][k];
    }
}
