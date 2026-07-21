class Solution {    // Tabulation
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        if(n >1) dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<n; i++){
            dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    }
}

// class Solution {    // Memoization
//     static int[] dp;
//     public int rob(int[] nums) {
//         int n = nums.length;
//         dp = new int[n];
//         Arrays.fill(dp, -1);
//         return helper(0, nums);
//     }
//     public int helper(int i, int[] nums){
//         if(i >= nums.length){
//             return 0;
//         }
//         if(dp[i] != -1){
//             return dp[i];
//         }
//         int pick = nums[i] + helper(i+2, nums);
//         int skip = helper(i+1, nums);
//         return dp[i] = Math.max(pick, skip);
//     }
// }
