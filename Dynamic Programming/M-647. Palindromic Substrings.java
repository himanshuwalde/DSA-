class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
       int[][] dp = new int[n][n];
       int count = 0;
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
            if(dp[row][col] != 0){
                count++;
            }
            row++;
        }
       }
       return count;
    }
}
