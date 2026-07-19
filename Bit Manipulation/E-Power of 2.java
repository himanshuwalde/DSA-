class Solution {
    public static boolean isPowerofTwo(int n) {
        if(n == 0){
            return false;
        }
        return ((n & (n-1)) == 0);
    }
}

// class Solution {
//     public static boolean isPowerofTwo(int n) {
//         if(n == 0){
//             return false;
//         }
//         while(n > 1){
//             if(n%2 == 1){
//                 return false;
//             }
//             n = n/2;
//         }
//         return true;
//     }
// }

// class Solution {
//     public static boolean isPowerofTwo(int n) {
//         for(int i=0; i<=n/2; i++){
//             if(1 << i == n){
//                 return true;
//             }
//         }
//         return false;
//     }
// }
