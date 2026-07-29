class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int ele : nums){
            max = Math.max(max, ele);
        }
        int currMax = 1;
        int currMin = 1;
        for(int ele : nums){
            int temp = currMax * ele;
            currMax = Math.max(temp, Math.max(currMin * ele, ele));
            currMin = Math.min(temp, Math.min(currMin * ele, ele));
            max = Math.max(max, currMax);
        }
        return max;
    }
}
