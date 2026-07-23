class Pair implements Comparable<Pair> {
    char ch;
    int freq;
    Pair (char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
    public int compareTo(Pair p){
        if(this.freq == p.freq){
            return p.ch - this.ch;
        }
        return this.freq - p.freq;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(char ch : map.keySet()){
            pq.add(new Pair(ch, map.get(ch)));
        }
        String ans = "";
        while(pq.size() > 0){
            Pair temp = pq.remove();
            for(int i=0; i<temp.freq; i++){
                ans += temp.ch;
            }
        }
        return ans;
    }
}
