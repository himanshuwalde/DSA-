class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<Integer> a = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] check = new boolean[n];
        permutations(nums, check, a, ans);
        return ans;
    }
    public void permutations(int[] nums, boolean[] check, List<Integer> a, List<List<Integer>> ans) {
        int n = nums.length;
        if(a.size() == n){
            List<Integer> copy = new ArrayList<>(a);
            ans.add(copy);
        }
        for(int i=0; i<n; i++){
            if(!check[i]){
                a.add(nums[i]);
                check[i] = true;
                permutations(nums, check, a, ans);
                a.remove(a.size()-1);
                check[i] = false;
            }
        }
    }
}
