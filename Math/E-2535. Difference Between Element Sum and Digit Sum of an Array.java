class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int eleSum = 0;
        for(int ele : nums){
            eleSum += ele;
        }
        int digitSum = 0;
        for(int ele : nums){
            if(ele < 10){
                digitSum += ele;
            }
            else{
                while(ele != 0){
                    digitSum += ele % 10;
                    ele /= 10;
                }
            }
        }
        return Math.abs(eleSum - digitSum);
    }
}
