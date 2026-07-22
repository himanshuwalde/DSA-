class Solution {    // Memoization
    public int countFriendsPairings(int n) {
        int[] dp = new int[n+1];
        return helper(n, dp);
    }
    public int helper(int n, int[] dp) {
        if(n <= 2){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        return dp[n] = helper(n-1, dp) + (n-1) * helper(n-2, dp);
    }
}
