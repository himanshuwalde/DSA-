class Solution {
    public int firstSearch(int[] arr, int k) {
        int n = arr.length; 
        return helper(arr, k, 0, n);
    }
    public int helper(int arr[], int k, int idx, int n) {
        if(idx == n){
            return -1;
        }
        if(arr[idx] == k){
            return idx;
        }
        return helper(arr, k, idx+1, n);
    }
}
