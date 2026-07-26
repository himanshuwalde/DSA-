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
        int maxDist = 0;
        Arrays.sort(arr);
        while(low <= high){
            int mid = low + (high - low)/2;
            if(setKCows(mid, arr, k)){
                maxDist = mid;
                low = mid + 1;  
            }
            else{
                high = mid - 1;
            }
        }
        return maxDist;
    }
    public boolean setKCows(int maxDist, int[] arr, int k){
        int prev = arr[0];
        k--;
        for(int i=1; i<arr.length; i++){
            if(arr[i] - prev >= maxDist){
                prev = arr[i];
                k--;
            }
        }
        return (k <= 0);
    }
}
