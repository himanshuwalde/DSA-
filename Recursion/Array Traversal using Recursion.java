class Solution {
    public static void arrayTraversal(int[] arr) {
        int n = arr.length;
        helper(arr, 0, n);
    }
    public static void helper(int[] arr, int idx, int n) {
        if(idx == n){
            return;
        }
        System.out.print(arr[idx]+" ");
        helper(arr, idx+1, n);
    }
}
