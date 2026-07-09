class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int n = nums.length;
        int i = 0;
        while(i < n){
            if(nums[i] == 1+i || nums[i] == nums[nums[i] - 1]){
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
            if(nums[i] != 1+i){
                arr[0] = nums[i];
                arr[1] = i+1;
                break;
            }
        }
        return arr;
    }
}
