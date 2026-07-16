class Solution {
    public static char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            }
            else{
                map.put(ch, 1);
            }
        }
        int maxFreq = 0;
        for(char ch: map.keySet()){
            int freq = map.get(ch);
            maxFreq = Math.max(freq, maxFreq);
        }
        char ans = 'z';
        for(char ch: map.keySet()){
            int freq = map.get(ch);
            if(freq == maxFreq && ch <= ans){
                ans = ch;
            }
        }
        return ans;
    }
}
