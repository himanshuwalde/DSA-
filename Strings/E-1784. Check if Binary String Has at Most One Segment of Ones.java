// class Solution {
//     public boolean checkOnesSegment(String s) {
//         return !s.contains("01");
//     }
// }

class Solution {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        boolean seenZero = false;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '0'){
                seenZero = true;
            }
            else if(seenZero){
                return false;
            }
        }
        return true;
    }
}
