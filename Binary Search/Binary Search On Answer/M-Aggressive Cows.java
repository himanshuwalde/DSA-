class Solution {
    public int aggressiveCows(int[] arr, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            min = Math.min(min, ele);
            max = Math.max(max, ele);
        }
        int low = 1;
        int high = max-min;
        int ans = 0;
        Arrays.sort(arr);
        while(low <= high){
            int mid = low + (high - low)/2;
            if(minDist(mid, arr, k)){
                ans = mid;
                low = mid + 1;
                
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public boolean minDist(int dist, int[] arr, int k){
        int prev = arr[0];
        k--;
        for(int i=1; i<arr.length; i++){
            if(arr[i] - prev >= dist){
                prev = arr[i];
                k--;
            }
        }
        return (k <= 0);
    }
}
