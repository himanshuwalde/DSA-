class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele: nums){
            set.add(ele);
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int idx = 0;
        while(idx != nums.length){
            low = Math.min(low, nums[idx++]);
        }
        idx = 0;
        while(idx != nums.length){
            high = Math.max(high, nums[idx++]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=low; i<=high; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
