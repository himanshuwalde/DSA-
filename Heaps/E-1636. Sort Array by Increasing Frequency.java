class Pair implements Comparable<Pair> {
    int ele;
    int freq;
    Pair (int ele, int freq){
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(Pair p){
        if(this.freq == p.freq){
            return p.ele - this.ele;
        }
        return this.freq - p.freq;
    }
}
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele : map.keySet()){
            pq.add(new Pair(ele, map.get(ele)));
        }
        int[] arr = new int[nums.length];
        int i = 0;
        while(pq.size() > 0){
            Pair temp = pq.remove();
            for(int j=1; j<=temp.freq; j++){
                arr[i++] = temp.ele;
            }
        }
        return arr;
    }
}
