class Solution {
    public int equalPairs(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int pairs = 0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            pairs += map.get(ch);
        }
        return pairs;
    }
}
