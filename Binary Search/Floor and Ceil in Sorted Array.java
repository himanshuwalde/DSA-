class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
       int n = nums.length;
       int[] arr = new int[2];
       int i = 0;
       int j = n-1;
       while(i<=j){
        int mid = (i+j)/2;
        if(nums[mid] == x){
            arr[0] = nums[mid];
            arr[1] = nums[mid];
            return arr;
        }
        else if(nums[mid] > x){
            j = mid-1;
        }
        else{
            i = mid+1;
        }
       }
       arr[0] = (j>=0)? nums[j] : -1;
       arr[1] = (i<n)? nums[i] : -1;
       return arr;
    }
}
