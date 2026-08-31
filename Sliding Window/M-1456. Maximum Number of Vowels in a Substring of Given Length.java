class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int vowels = 0;
        for(int i=0; i<k; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
        }
        int maxVowels = vowels;
        for(int i=k; i<n; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            char ch1 = s.charAt(i-k);
            if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'){
                vowels--;
            }
            maxVowels = Math.max(maxVowels, vowels);
        }
        return maxVowels;
    }
}
