class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxCount = 0;
        for(int i=0; i<n; i++){
            int count = 0;
            int j = i;
            while(j<n && nums[j]==1){
                count++;
                j++;
            }
            i = j++;
            if(count>=maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
}
