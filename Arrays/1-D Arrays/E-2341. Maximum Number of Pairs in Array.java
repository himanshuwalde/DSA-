class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n = nums.length;
        int[] arr = new int[101];
        for(int i=0; i<n; i++){
            arr[nums[i]]++;
        }
        int pairs = 0;
        for(int i=0; i<arr.length; i++){
            pairs += arr[i]/2;
        }
        int leftover = n - (pairs*2);
        return new int[]{pairs, leftover};
    }
}
