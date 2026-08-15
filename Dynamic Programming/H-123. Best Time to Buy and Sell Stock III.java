class Solution {    // MEMOIZATION
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int k = 4;  // 1 transaction means combination of buy & sell and 2 transactions means 2 times buy and 2 times sell, hence k = 4
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
        if(k%2 == 0){  // for buying
            int buy = helper(prices, n, i+1, k-1, dp) - prices[i];
            int skip = helper(prices, n, i+1, k, dp);
            dp[i][k] = Math.max(buy, skip);
        }
        else{  //for selling
            int sell = helper(prices, n, i+1, k-1, dp) + prices[i];
            int skip = helper(prices, n, i+1, k, dp);
            dp[i][k] = Math.max(sell, skip);
        }
        return dp[i][k];
    }
}

// class Solution {    // TABULATION
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int[][] dp = new int[n + 1][5];
//         for (int i = n - 1; i >= 0; i--) {
//             for (int k = 1; k <= 4; k++) {
//                 if (k%2 == 0) {
//                     // BUY
//                     int buy = dp[i + 1][k - 1] - prices[i];
//                     int skip = dp[i + 1][k];
//                     dp[i][k] = Math.max(buy, skip);
//                 } 
//                 else {
//                     // SELL
//                     int sell = dp[i + 1][k - 1] + prices[i];
//                     int skip = dp[i + 1][k];
//                     dp[i][k] = Math.max(sell, skip);
//                 }
//             }
//         }
//         return dp[0][4];
//     }
// }
