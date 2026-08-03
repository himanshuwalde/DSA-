class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for(int i=0; i<n-1; i++){
//             for(int j=i+1; j<n; j++){
//                 if(nums[i] + nums[j] == target){
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }
