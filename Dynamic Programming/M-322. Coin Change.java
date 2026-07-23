class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return 0;
        }
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        int ans = helper(0, coins, amount, dp);
        return (ans != Integer.MAX_VALUE)? ans : -1;
    }
    public int helper(int i, int coins[], int amount, int[][] dp) {
        if(i == coins.length){
            if(amount == 0){
                return 0;
            }
            else{
                return Integer.MAX_VALUE;
            }
        }
        if(dp[i][amount] != 0){
            return dp[i][amount];
        }
        int skip = helper(i+1, coins, amount, dp);
        if(amount < coins[i]){
            return dp[i][amount] = skip;
        }
        int take = helper(i, coins, amount-coins[i], dp);
        int pick = (take == Integer.MAX_VALUE)? take : take + 1;
        return dp[i][amount] = Math.min(skip, pick);
    }
}
