class Solution {
    public int search(int arr[], int x) {
        int n = arr.length; 
        return helper(arr, x, 0, n);
    }
    public int helper(int arr[], int x, int idx, int n) {
        if(idx == n){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }
        return helper(arr, x, idx+1, n);
    }
}
