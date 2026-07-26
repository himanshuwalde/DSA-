class Solution {    // TC: O(n)
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int max = -1;
        for(int i = n-1; i >= 0; i--){
            ans[i] = max;
            max = Math.max(max, arr[i]);   
        }
        return ans;
    }
}

// class Solution {    // TC: O(n*n)
//     public int[] replaceElements(int[] arr) {
//         int n = arr.length;
//         for(int i=0; i<n-1; i++){
//             int max = Integer.MIN_VALUE;
//             for(int j=i+1; j<n; j++){
//                 max = Math.max(max, arr[j]);
//             }
//             arr[i] = max;
//         }
//         arr[n-1] = -1;
//         return arr;
//     }
// }
