class Solution {    // Binary Search
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : nums){
            if(ans.size() == 0 || ele > ans.get(ans.size()-1)){
                ans.add(ele);
            }
            else{
                replaceWithLowerBound(ele, ans);
            }
        }
        return ans.size();
    }
    public void replaceWithLowerBound(int ele, ArrayList<Integer> ans) {
        int low = 0;
        int high = ans.size()-1;
        int lb = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(ans.get(mid) >= ele){
                lb = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        ans.set(lb, ele);
    }
}

// class Solution {    // Tabulation
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         int[] dp = new int[n];
//         Arrays.fill(dp, 1);
//         int maxLen = 1;
//         for(int i=1; i<n; i++){
//             int max = 0;
//             for(int j=0; j<i; j++){
//                 if(nums[j] < nums[i]){
//                     max = Math.max(max, dp[j]);
//                 }
//             }
//             dp[i] += max;
//             maxLen = Math.max(maxLen, dp[i]);
//         }
//         return maxLen;
//     }
// }

// class Solution {    // Memoization
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         int[][] dp = new int[n][n+1];
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n+1; j++){
//                 dp[i][j] = -1;
//             }
//         }
//         return helper(0, -1, nums, dp);
//     }
//     public int helper(int i, int prev, int[] nums, int[][] dp) {
//         if(i == nums.length){
//             return 0;
//         }
//         if(dp[i][prev+1] != -1){
//             return dp[i][prev+1];
//         }
//         int skip = helper(i+1, prev, nums, dp);
//         if(prev != -1 && nums[i] <= nums[prev]){
//             return dp[i][prev+1] = skip;
//         }
//         int pick = 1 + helper(i+1, i, nums, dp);
//         return dp[i][prev+1] = Math.max(skip, pick);
//     }
// }
