class Solution {
    public int strStr(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        for(int i=0; i<=m-n; i++){
            if(s1.substring(i, i+n).equals(s2)){
                return i;
            }
        }
        return -1;
    }
}

// class Solution {
//     public int strStr(String s1, String s2) {
//         int a = s1.length();
//         int b = s2.length();
//         for(int i=0; i<=a-b; i++){
//             int j=0;
//             while(j < b && s2.charAt(j) == s1.charAt(i+j)){
//                 j++;
//             }
//             if(j == b){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
