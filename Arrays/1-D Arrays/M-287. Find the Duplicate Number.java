class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            if(nums[i] == 1 + i){
                i++;
            }
            else if(nums[i] == nums[nums[i] - 1]){
                return nums[i];
            }
            else{
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
        return 43;
    }
}
