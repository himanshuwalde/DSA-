class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            if(nums[i] < 1 || nums[i] == i+1 || nums[i]> n || nums[i] == nums[nums[i] - 1]){
                i++;
            }
            else{
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
        for(i=0; i<n; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
