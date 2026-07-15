class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: stones){
            pq.add(ele);
        }
        while(pq.size() > 1){
            int a = pq.remove();
            int b = pq.remove();
            if(a == b){
                pq.add(0);
            }
            if(a != b){
                pq.add(Math.abs(a-b));
            }
        }
        return pq.peek();
    }
}
