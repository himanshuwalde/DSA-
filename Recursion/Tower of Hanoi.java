class Solution {
    static int count;
    public int towerOfHanoi(int n, int a, int b, int c) {
        count = 0;
        helper(n, 'A', 'B', 'C');
        return count;
        
    }
    public void helper(int n, char a, char b, char c) {
        if(n == 0){
            return;
        }
        helper(n-1, a, c, b);
        count++;
        helper(n-1, b, a, c);
    }
}
