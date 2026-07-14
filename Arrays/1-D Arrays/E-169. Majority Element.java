// MOORE'S VOTNG ALGORITHM
class Solution {    // TC: O(n)
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0, ele = 0;
        for(int i=0; i<n; i++){
            if(count == 0){
                ele = nums[i];
            }
            if(nums[i] == ele){
                count++;
            }
            else{
                count--;
            }
        }
        return ele;
    }
}

// class Solution {    // TC: O(n*logn)
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         return nums[n/2];
//     }
// }
