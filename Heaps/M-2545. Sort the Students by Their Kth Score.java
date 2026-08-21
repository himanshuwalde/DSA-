class Pair implements Comparable<Pair> {
    int val;
    int row;
    Pair(int val, int row){
        this.val = val;
        this.row = row;
    }
    public int compareTo(Pair p){
        return this.val - p.val;
    }
}
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length;
        int n = score[0].length;
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<m; i++){
            pq.add(new Pair(score[i][k], i));
        }
        int[][] ans = new int[m][n];
        int i = 0;
        while(pq.size() > 0){
            Pair top = pq.remove();
            int row = top.row;
            for(int col=0; col<n; col++){
                ans[i][col] = score[row][col];
            }
            i++;
        }
        return ans;
    }
}
