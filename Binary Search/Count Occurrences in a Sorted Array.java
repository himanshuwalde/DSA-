class Solution {
    public int countOccurrences(int[] nums, int target) {
        // int n = arr.length;
        // int count = 0;
        // for(int i=0; i<n; i++){
        //     if(arr[i] == target){
        //         count++;
        //     }
        // }
        // return count;
        int n = nums.length;
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
        if(nums[i] != target){
            return -1;
        }
        int a = i;
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
        int b = j;
        return b-a+1;
    }
}
