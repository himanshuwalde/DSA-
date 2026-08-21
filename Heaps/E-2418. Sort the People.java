class Pair implements Comparable<Pair>{
    String name;
    int height;
    Pair(String name, int height){
        this.name = name;
        this.height = height;
    }
    public int compareTo(Pair p){
        return this.height - p.height;
    }
}
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<names.length; i++){
            pq.add(new Pair(names[i], heights[i]));
        }
        for(int i=0; i<names.length; i++){
            names[i] = pq.remove().name;
        }
        return names;
    }
}
