class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int sum = 0;
        int prod = 1;
        while(n != 0){
            int rem = n%10;
            sum += rem;
            prod *= rem;
            n = n/10;
        }
        int total = sum + prod;
        return (num % total) == 0;
    }
}
