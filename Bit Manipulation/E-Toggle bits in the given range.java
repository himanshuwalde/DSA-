class Solution {
    static int toggleBits(int n, int l, int r) {
        for(int i=l; i<=r; i++){
            int mask = 1 << (i-1);
            n = n ^ mask;
        }
        return n;
    }
}
