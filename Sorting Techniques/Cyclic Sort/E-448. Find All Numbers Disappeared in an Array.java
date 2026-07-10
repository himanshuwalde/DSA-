class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
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
                ans.add(i+1);
            }
        }
        return ans;
    }
}
