class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int maxDiff = -1;
        for(int i=0; i<n-1; i++){
            int max = nums[i];
            for(int j=i+1; j<n; j++){
                max = Math.max(max, nums[j]);
            }
            int diff = ((max - nums[i]) == 0) ? -1 : max - nums[i];
            maxDiff = Math.max(maxDiff, diff);
        }
        return maxDiff;
    }
}
