class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n = getNextNumber(n);
            if(n == 1){
                return true;
            }
        }
        return false;
    }
    public int getNextNumber(int n) {
        int sum = 0;
        while(n != 0){
            sum += (n%10) * (n%10);
            n /= 10;
        }
        return sum;
    }
}
