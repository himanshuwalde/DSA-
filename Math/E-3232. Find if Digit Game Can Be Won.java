class Solution {
    public boolean canAliceWin(int[] nums) {
        int n = nums.length;
        int singleDigitSum = 0;
        int doubleDigitSum = 0;
        for(int ele : nums){
            if(ele/10 == 0){
                singleDigitSum += ele;
            }
            else{
                doubleDigitSum += ele;
            }
        }
        return (singleDigitSum > doubleDigitSum) || (doubleDigitSum > singleDigitSum);
    }
}
