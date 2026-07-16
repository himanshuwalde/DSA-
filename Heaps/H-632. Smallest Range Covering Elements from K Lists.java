class Triplet implements Comparable<Triplet>{
    int ele;
    int row;
    int col;
    Triplet(int ele, int row, int col){
        this.ele = ele;
        this.row = row;
        this.col = col;
    }
    public int compareTo(Triplet t){
        return Integer.compare(this.ele, t.ele);
    }
}
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] arr = new int[2];
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int k = nums.size();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<k; i++){
            max = Math.max(max, nums.get(i).get(0));
            min = Math.min(min, nums.get(i).get(0));
            pq.add(new Triplet(nums.get(i).get(0), i, 0));
        }
        int a = min, b = max;
        while(true){
            Triplet top = pq.remove();
            int ele = top.ele;
            int row = top.row;
            int col = top.col;
            if(max - ele < b - a){
                a = ele;
                b = max;
            }
            if(col == nums.get(row).size() - 1){
                break;
            }
            int next = nums.get(row).get(col+1);
            max = Math.max(max, next);
            pq.add(new Triplet(next, row, col+1));
        }
        arr[0] = a;
        arr[1] = b;
        return arr;
    }
}
