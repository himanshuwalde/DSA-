class CheckBit {
    static boolean checkKthBit(int n, int k) {
        int mask = n >> k;
        return (mask % 2 == 1);
    }
}
