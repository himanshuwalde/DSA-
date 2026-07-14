class Solution {    // TC: O(n)
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int i = 0, j = n-1, pos = n-1;
        while(i <= j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                arr[pos] = nums[i] * nums[i];
                i++;
            }
            else{
                arr[pos] = nums[j] * nums[j];
                j--;
            }
            pos--;
        }
        return arr;
    }
}

// class Solution {    // TC: O(n*logn)
//     public int[] sortedSquares(int[] nums) {
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             nums[i] = nums[i] * nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }
