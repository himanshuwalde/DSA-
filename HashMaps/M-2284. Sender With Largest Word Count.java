class Pair implements Comparable<Pair> {
    String name;
    int words;
    Pair(String name, int words){
        this.name = name;
        this.words = words;
    }
    public int compareTo(Pair p){
        if(this.words == p.words){
            return this.name.compareTo(p.name);
        }
        return this.words - p.words;
    }
}
class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        int n = messages.length;
        int[] words = new int[n];
        int idx = 0;
        for(String s : messages){
            int i = 0;
            int count = 0;
            while(i < s.length()){
                if(s.charAt(i) == ' '){
                    count++;
                }
                i++;
            }
            words[idx++] = count + 1;
        }
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String name = senders[i];
            if(!map.containsKey(name)){
                map.put(name, words[i]);
            }
            else{
                map.put(name, map.get(name) + words[i]);
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(String name : map.keySet()){
            pq.add(new Pair(name, map.get(name)));
        }
        Pair top = pq.remove();
        return top.name;
    }
}
