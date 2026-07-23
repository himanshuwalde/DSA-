class Solution {    // Tabulation
    public int minDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        // Base cases
        for(int i = 0; i <= m; i++) dp[i][0] = i;
        for(int j = 0; j <= n; j++) dp[0][j] = j;
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                } 
                else{
                    int replace = dp[i - 1][j - 1];
                    int delete = dp[i - 1][j];
                    int insert = dp[i][j - 1];
                    dp[i][j] = 1 + Math.min(replace, Math.min(delete, insert));
                }
            }
        }
        return dp[m][n];
    }
}

// class Solution {    // Memoization
//     public int minDistance(String a, String b) {
//         int m = a.length();
//         int n = b.length();
//         int[][] dp = new int[m][n];
//         return helper(m-1, n-1, a, b, dp);
//     }
//     public int helper(int i, int j, String a, String b, int[][] dp) {
//         if(i < 0){
//             return j+1;
//         }
//         if(j < 0){
//             return i+1;
//         }
//         if(dp[i][j] != 0){
//             return dp[i][j];
//         }
//         if(a.charAt(i) == b.charAt(j)){
//             return helper(i-1, j-1, a, b, dp);
//         }
//         int insert = 1 + helper(i, j-1,a, b, dp);
//         int delete = 1 + helper(i-1, j, a, b, dp);
//         int replace = 1 + helper(i-1, j-1, a, b, dp);
//         return dp[i][j] = Math.min(insert, Math.min(delete, replace));
//     }
// }
