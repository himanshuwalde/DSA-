class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int ele : piles){
            max = Math.max(max, ele);
        }
        int low = 1;
        int high = max;
        int speed = max;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(hours(mid, piles) <= h){
                speed = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return speed;
    }
    public long hours(int speed, int[] piles){
        long hours = 0;
        for(int ele : piles){
            if(ele % speed == 0){
                hours += ele/speed;
            }
            else{
                hours += (ele/speed + 1);
            }
        }
        return hours;
    }
}
