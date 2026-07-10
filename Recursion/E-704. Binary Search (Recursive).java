class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return binarySearch(nums, target, 0, n-1); 
    }
    public int binarySearch(int[] nums, int target, int low, int high) {
        int mid = low + (high - low)/2;
        if(low>high){
            return -1;
        }
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] > target){
            return binarySearch(nums, target, low, mid-1);
        }
        else{
            return binarySearch(nums, target, mid+1, high);
        }
    }
}
