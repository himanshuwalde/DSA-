class Solution {
    public int setBit(int n) {
        return n | (n+1);
    }
}

// class Solution {
//     public int setBit(int n) {
//         for(int i=0; i<31; i++){
//             if((n >> i)%2 == 0){
//                 return n | (1 << i);
//             }
//         }
//         return n;
//     }
// }
