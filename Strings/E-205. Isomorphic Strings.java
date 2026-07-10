class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);
            if((map.containsKey(s1) && map.get(s1) != s2) || 
                (!map.containsKey(s1) && map.values().contains(s2))){
                return false;
            }
            map.put(s1, s2);
        }
        return true;
    }
}
