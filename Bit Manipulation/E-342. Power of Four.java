class Solution {
    public boolean isPowerOfFour(int n) {
        return (isPowerofTwo(n) && isSquare(n));
    }
    public static boolean isPowerofTwo(int n) {
        if(n == 0){
            return false;
        }
        return ((n & (n-1)) == 0);
    }
    public static boolean isSquare(int n) {
        double root = Math.sqrt(n);
        return ((root * root) == n);
    }
}
