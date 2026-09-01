class Solution {
    public int longestContinuousSubstring(String s) {
        int n = s.length();
        int maxLen = 1;
        int subLen = 1;
        for(int i=0; i<n-1; i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch1 == ch2 - 1){
                subLen++;
                maxLen = Math.max(maxLen, subLen);
            }
            else{
                subLen = 1;
            }
        }
        return maxLen;
    }
}
