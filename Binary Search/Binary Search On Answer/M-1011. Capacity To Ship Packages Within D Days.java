class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int ele : weights){
            max = Math.max(max, ele);
            sum += ele;
        }
        int low = max;
        int high = sum;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(days(mid, weights) <= days){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int days(int capacity, int[] weights){
        int days = 0;
        int k = capacity;
        for(int ele : weights){
            if(k >= ele){
                k -= ele;
            }
            else{
                k = capacity - ele;
                days++;
            }
        }
        days++;
        return days;
    }
}
