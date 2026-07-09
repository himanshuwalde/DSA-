class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int i = 0; 
        int j = n-1;
        int last = nums[n-1];
        while(i <= j){
            int mid = i + (j-i)/2;
            if(nums[mid] <= last){
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return nums[i];
    }
}
