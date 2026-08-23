class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0;
        int leftQ = 0;
        int rightSum = 0;
        int rightQ = 0;
        for(int i=0; i<n/2; i++){
            if(num.charAt(i) == '?'){
                leftQ++;
            }
            else{
                leftSum += num.charAt(i) - '0';
            }
        }
        for(int i=n/2; i<n; i++){
            if(num.charAt(i) == '?'){
                rightQ++;
            }
            else{
                rightSum += num.charAt(i) - '0';
            }
        }
        return (leftSum - rightSum) * 2 != (rightQ - leftQ) * 9;
    }
}

// class Solution {
//     public boolean sumGame(String num) {
//         int n = num.length();
//         double ans = 0.0;
//         for(int i=0; i<n/2; i++){
//             ans += getExpectation(num.charAt(i));
//         }
//         for(int i=n/2; i<n; i++){
//             ans -= getExpectation(num.charAt(i));
//         }
//         return ans != 0.0;
//     }
//     public double getExpectation(char ch){
//         return ch == '?' ? 4.5 : ch - '0';
//     }
// }
