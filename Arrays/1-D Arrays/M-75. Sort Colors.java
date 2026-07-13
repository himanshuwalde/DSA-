// DUTCH NATIONAL FLAG ALGORITHM
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0, mid = 0, j = n-1;
        while(mid <= j){
            if(nums[mid] == 0){
                int temp = nums[i];
                nums[i] = nums[mid];
                nums[mid] = temp;
                i++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }
}

// class Solution {
//     public void sortColors(int[] nums) {
//         int n = nums.length;
//         for(int i = 0; i<n; i++) {
//             int min = i;
//             for(int j = i+1; j<=n-1; j++) {
//                 if(nums[min] > nums[j]) {
//                     min = j;
//                 }
//             }
//             if(min!=i) {
//                 int temp = nums[i];
//                 nums[i] = nums[min];
//                 nums[min] = temp;
//             }
//         }
//     }
// }
