class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        int i = 0, j = n-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid] >= target){
                j = mid-1;
            }
            else if(nums[mid] < target){
                i = mid+1;
            }
        }
        arr[0] = (i<n && nums[i] == target)? i : -1;
        i = 0;
        j = n-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid] > target){
                j = mid-1;
            }
            else if(nums[mid] <= target){
                i = mid+1;
            }
        }
        arr[1] = (j>=0 && nums[j] == target)? j : -1;
        return arr;
    }
}
