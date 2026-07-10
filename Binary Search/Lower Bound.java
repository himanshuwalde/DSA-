class Solution {
    public int lowerBound(int[] nums, int x) {
       int n = nums.length;
       int i=0, j=n-1;
       while(i<=j){
        int mid = (i+j)/2;
        if(nums[mid] < x){
            i = mid+1;
        }
        else if(nums[mid] >= x){
            j = mid-1;
        }
       }
       return i;
     }
}
