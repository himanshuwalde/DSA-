class Solution {
    public int secondLargestElement(int[] nums) {
        int n = nums.length;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean flag = false;
        for(int i = 0; i < n; i++) {
            if(nums[i] > firstLargest) {
                firstLargest = nums[i];
            }
        }
        for(int i = 0; i < n; i++) {
            if(nums[i] > secondLargest && nums[i] != firstLargest) {
                secondLargest = nums[i];
                flag = true;
            }
        }
        if(flag == true) return secondLargest;
        else return -1;
    }
}
