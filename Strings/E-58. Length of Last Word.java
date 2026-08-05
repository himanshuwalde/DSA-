class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int last = n - 1;
        int length = 0;
        while(s.charAt(last) == ' '){
            last--;
        }
        while(last >= 0 && s.charAt(last) != ' '){
            length++;
            last--;
        }
        return length;
    }
}
