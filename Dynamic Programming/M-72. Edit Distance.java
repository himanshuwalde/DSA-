class Solution {
    public int minDistance(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m][n];
        return helper(m-1, n-1, a, b, dp);
    }
    public int helper(int i, int j, String a, String b, int[][] dp) {
        if(i < 0){
            return j+1;
        }
        if(j < 0){
            return i+1;
        }
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        if(a.charAt(i) == b.charAt(j)){
            return helper(i-1, j-1, a, b, dp);
        }
        int insert = 1 + helper(i, j-1,a, b, dp);
        int delete = 1 + helper(i-1, j, a, b, dp);
        int replace = 1 + helper(i-1, j-1, a, b, dp);
        return dp[i][j] = Math.min(insert, Math.min(delete, replace));
    }
}
