class Solution {    // Tabulation
    public int longestCommonSubsequence(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(a.charAt(i-1) == b.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}

// class Solution {    // Memoization
//     public int longestCommonSubsequence(String a, String b) {
//         int m = a.length();
//         int n = b.length();
//         int[][] dp = new int[m][n];
//         for(int i=0; i<m; i++){
//             for(int j=0; j<n; j++){
//                 dp[i][j] = -1;
//             }
//         }
//         return helper(m-1, n-1, new StringBuilder(a), new StringBuilder(b), dp);
//     }
//     public int helper(int i, int j, StringBuilder a, StringBuilder b, int[][] dp) {
//         if(i<0 || j<0) return 0;
//         if(dp[i][j] != -1){
//             return dp[i][j];
//         }
//         if(a.charAt(i) == b.charAt(j)){
//             return dp[i][j] = 1 + helper(i-1, j-1, a, b, dp);
//         }
//         int left = helper(i-1, j, a, b, dp);
//         int right = helper(i, j-1, a, b, dp);
//         return dp[i][j] = Math.max(left, right);
//     }
// }
