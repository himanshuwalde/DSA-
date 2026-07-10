class Solution {
    public int[] selectionSort(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int minIdx = i;
            for(int j=i; j<n; j++){
                if(nums[minIdx]>nums[j]){
                    minIdx = j;
                }
            }
            if(minIdx!=i){
                int temp = nums[minIdx];
                nums[minIdx] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}
