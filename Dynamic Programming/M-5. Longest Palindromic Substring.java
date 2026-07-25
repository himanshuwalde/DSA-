class Solution {
    public String longestPalindrome(String s) {
       int n = s.length();
       int[][] dp = new int[n][n];
       int maxLen = 1;
       for(int i=0; i<n; i++){
        int row = 0;
        for(int col=i; col<n; col++){
            if(row == col){
                dp[row][col] = 1;
            }
            else if(s.charAt(row) == s.charAt(col)){
                if(col == row+1){
                    dp[row][col] = 2;
                }
                else if(dp[row+1][col-1] != 0){
                    dp[row][col] = dp[row+1][col-1] + 2;
                }  
            }
            maxLen = Math.max(maxLen, dp[row][col]);
            row++;
        }
       }
       String ans = "";
       for(int i=0; i<n; i++){
        int row = 0;
        for(int col=i; col<n; col++){
            if(dp[row][col] == maxLen){
                ans = s.substring(row, col+1);
                return ans;
            }
            row++;
        }
       }
       return ans;
    }
}
//     b   a   b   a   d
// b   1   0   3   0   0
// a   0   1   0   3   0
// b   0   0   1   0   0
// a   0   0   0   1   0
// d   0   0   0   0   1

// 0,0 1,1 2,2 3,3 4,4
// 0,1 1,2 2,3 3,4
// 0,2 1,3 2,4
// 0,3 1,4
// 0,4
