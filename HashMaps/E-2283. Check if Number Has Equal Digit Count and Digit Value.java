class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(char ch : num.toCharArray()){
            int digit = ch - '0';
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }
        for(int i=0; i<num.length(); i++){
            int n = num.charAt(i) - '0';
            if(map.getOrDefault(i, 0) != n){
                return false;
            }
        }
        return true;
    }
}
