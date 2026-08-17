class Triplet {
    int row;
    int col;
    int time;
    Triplet(int row, int col, int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Triplet> q = new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 2){
                    q.add(new Triplet(i, j, 0));
                }
            }
        }
        int maxTime = 0;
        while(q.size() > 0){
            Triplet front = q.remove();
            int row = front.row;
            int col = front.col;
            int time = front.time;
            maxTime = Math.max(maxTime, time);
            // rot left side
            if(col - 1 >= 0 && grid[row][col-1] == 1){
                grid[row][col-1] = 2;
                q.add(new Triplet(row, col-1, time+1));
            }
            // rot up side
            if(row - 1 >= 0 && grid[row-1][col] == 1){
                grid[row-1][col] = 2;
                q.add(new Triplet(row-1, col, time+1));
            }
            // rot right side
            if(col + 1 < n && grid[row][col+1] == 1){
                grid[row][col+1] = 2;
                q.add(new Triplet(row, col+1, time+1));
            }
            // rot down side
            if(row + 1 < m && grid[row+1][col] == 1){
                grid[row+1][col] = 2;
                q.add(new Triplet(row+1, col, time+1));
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return maxTime;
    }
}
