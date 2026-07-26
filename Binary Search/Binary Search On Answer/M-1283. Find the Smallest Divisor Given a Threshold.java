class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int ele : nums){
            max = Math.max(max, ele);
        }
        int low = 1;
        int high = max;
        int div = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(divisor(mid, nums) <= threshold){
                div = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return div;
    }
    public int divisor(int div, int[] nums){
        int sum = 0;
        for(int ele : nums){
            sum += Math.ceil((double)ele/div);
        }
        return sum;
    }
}
