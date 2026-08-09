class Solution {
    public String firstPalindrome(String[] words) {
        for(String s : words){
            String temp = new StringBuilder(s).reverse().toString();
            if(s.equals(temp)){
                return s;
            }
        }
        return new String("");
    }
}
