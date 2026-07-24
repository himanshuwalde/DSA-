class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        // find LIS from left
        int[] dp1 = new int[n];
        Arrays.fill(dp1, 1);
        for(int i=1; i<n; i++){  
            int max = 0;
            for(int j=0; j<i; j++){
                if(nums[j] < nums[i]){
                    max = Math.max(max, dp1[j]);
                }
            }
            dp1[i] += max;
        }
        // find LIS from right
        int[] dp2 = new int[n];
        Arrays.fill(dp2, 1);
        for(int i=n-2; i>=0; i--){  
            int max = 0;
            for(int j=i+1; j<n; j++){
                if(nums[j] < nums[i]){
                    max = Math.max(max, dp2[j]);
                }
            }
            dp2[i] += max;
        }
        // longest bitonic subsequence length
        int maxLen = 0;
        for(int i=0; i<n; i++){  
            if(dp1[i] != 1 && dp2[i] != 1){
                maxLen = Math.max(maxLen, dp1[i]+dp2[i]-1);
            }
        }
        return n - maxLen;
    }
}
