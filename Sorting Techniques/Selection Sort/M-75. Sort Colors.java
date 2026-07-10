class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n; i++) {
            int min = i;
            for(int j = i+1; j<=n-1; j++) {
                if(nums[min] > nums[j]) {
                    min = j;
                }
            }
            if(min!=i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
    }
}
