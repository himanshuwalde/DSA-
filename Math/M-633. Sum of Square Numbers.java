class Solution {
    public boolean judgeSquareSum(int c) {
        int n = (int)(Math.sqrt(c));
        int left = 0;
        int right = n;
        while(left <= right){
            if((left*left) == c - (right*right)){
                return true;
            }
            else if((left*left) < c - (right*right)){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
}
