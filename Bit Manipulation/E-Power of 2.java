class Solution {
    public static boolean isPowerofTwo(int n) {
        for(int i=0; i<=n/2; i++){
            if(1 << i == n){
                return true;
            }
        }
        return false;
    }
}
