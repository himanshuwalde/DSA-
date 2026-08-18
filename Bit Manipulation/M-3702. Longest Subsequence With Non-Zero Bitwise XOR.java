class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int nonZeroes = 0;
        int xor = 0;
        for(int ele : nums){
            xor ^= ele;
            if(ele != 0){
                nonZeroes++;
            }
        }
        if(xor != 0){
            return n;
        }
        if(nonZeroes == 0){
            return 0;
        }
        return n-1;
    }
}
