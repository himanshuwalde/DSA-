class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIdx = 0;
        int maxIdx = 0;
        for(int i=0; i<n; i++){
            if(nums[i] < nums[minIdx]){
                minIdx = i;
            }
            if(nums[i] > nums[maxIdx]){
                maxIdx = i;
            }
        }
        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);
        
        // Remove both from the front
        int front = right + 1;
        
        // Remove both from the back
        int back = n - left;

        // Remove one from each side
        int frontback = (left + 1) + (n - right);
        
        return Math.min(front, Math.min(back, frontback));
    }
}
