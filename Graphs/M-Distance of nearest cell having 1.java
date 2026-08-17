class Pair {
    int row;
    int col;
    Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    q.add(new Pair(i, j));
                }
            }
        }
        while(q.size() > 0){
            Pair front = q.remove();
            int row = front.row;
            int col = front.col;
            // check left side
            if(col-1 >= 0 && grid[row][col-1] == 0 && arr[row][col-1] == 0){
                arr[row][col-1] = arr[row][col]+1;
                q.add(new Pair(row, col-1));
            }
            // check up side
            if(row-1 >= 0 && grid[row-1][col] == 0 && arr[row-1][col] == 0){
                arr[row-1][col] = arr[row][col]+1;
                q.add(new Pair(row-1, col));
            }
            // check right side
            if(col+1 < n && grid[row][col+1] == 0 && arr[row][col+1] == 0){
                arr[row][col+1] = arr[row][col]+1;
                q.add(new Pair(row, col+1));
            }
            // check down side
            if(row+1 < m && grid[row+1][col] == 0 && arr[row+1][col] == 0){
                arr[row+1][col] = arr[row][col]+1;
                q.add(new Pair(row+1, col));
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<m; i++){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j=0; j<n; j++){
                a.add(arr[i][j]);
            }
            ans.add(a);
        }
        return ans;
    }
}
