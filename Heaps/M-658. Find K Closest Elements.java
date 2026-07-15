class Pair implements Comparable<Pair>{
    int val;
    int dist;
    Pair (int val, int dist){
        this.val = val;
        this.dist = dist;
    }
    public int compareTo(Pair p){
        if(this.dist == p.dist){
            return this.val - p.val;
        }
        return this.dist - p.dist;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: arr){
            int dist = Math.abs(ele - x);
            pq.add(new Pair(ele,dist));
            if(pq.size() > k){
                pq.remove();
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(pq.size() > 0){
            Pair temp = pq.remove();
            ans.add(temp.val);
        }
        Collections.sort(ans);
        return ans;
    }
}
