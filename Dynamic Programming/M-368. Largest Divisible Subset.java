class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;    
        int[] dp = new int[n];
        int[] next = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(next, -1);
        int maxLen = 1;
        int start = 0;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] % nums[i] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    next[i] = j;
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                start = i;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (start != -1) {
            ans.add(nums[start]);
            start = next[start];
        }
        return ans;
    }
}

// class Solution {
//     public List<Integer> largestDivisibleSubset(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums);
//         // find LIS from right
//         int[] dp = new int[n];
//         Arrays.fill(dp, 1);
//         int maxLen = 1;
//         for(int i=n-2; i>=0; i--){  
//             int max = 0;
//             for(int j=i+1; j<n; j++){
//                 if(nums[j] < nums[i]){
//                     max = Math.max(max, dp[j]);
//                 }
//             }
//             dp[i] += max;
//             maxLen = Math.max(maxLen, dp[i]);
//         }
//         int idx = 0;
//         for(int i=0;i<n;i++){
//             if(dp[i]==maxLen){
//                 idx = i;
//             }
//         }
//         ArrayList<Integer> ans = new ArrayList<>();
//         ans.add(nums[idx]);
//         maxLen--;
//         idx++;
// //        while(idx<n){
// //            if()
// //        }
//         return ans;
//     }
// }
