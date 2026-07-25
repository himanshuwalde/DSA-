class Solution {
    public int longCommSubstr(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        int maxLen = 0;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                maxLen = Math.max(maxLen, dp[i][j]);
            }
        }
        return maxLen;
    }
}
//     A   C   D   G   H   R
// A   1   0   0   0   0   0
// B   0   0   0   0   0   0
// C   0   1   0   0   0   0
// D   0   0   2   0   0   0
// G   0   0   0   3   0   0
// H   0   0   0   0   4   0
