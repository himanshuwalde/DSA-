class Solution {
    public int minJumps(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return 0;
        }
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        for (int i = 0; i < n - 1; i++) {
            
            // Track the farthest position reachable
            farthest = Math.max(farthest, i + nums[i]);
            
            // We have reached the end of the current jump
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                // Cannot move any further
                if (currentEnd <= i) {
                    return -1;
                }

                // Already reached the last index
                if (currentEnd >= n - 1) {
                    return jumps;
                }
            }
        }
        return -1;
    }
}
