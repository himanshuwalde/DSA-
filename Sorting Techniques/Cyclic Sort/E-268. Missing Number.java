class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            if(nums[i] == i || nums[i] == n){
                i++;
            }
            else{
                int correctIndex = nums[i];
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
        for(i=0; i<n; i++){
            if(i != nums[i]){
                return i;
            }
        }
        return n;
    }
}
