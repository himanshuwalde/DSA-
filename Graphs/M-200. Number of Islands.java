class Pair {
    int i;
    int j;
    Pair(int i, int j){
        this.i = i;
        this.j = j;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    bfs(i, j, grid, visited, m, n);
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int i, int j, char[][] grid, boolean[][] visited, int m, int n){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        visited[i][j] = true;
        while(q.size() > 0){
            Pair front = q.remove();
            // left side check
            if(front.j - 1 >= 0 && grid[front.i][front.j - 1] == '1' && !visited[front.i][front.j - 1]){
                q.add(new Pair(front.i, front.j - 1));
                visited[front.i][front.j - 1] = true;
            }
            // up side check
            if(front.i - 1 >= 0 && grid[front.i- 1][front.j] == '1' && !visited[front.i - 1][front.j]){
                q.add(new Pair(front.i - 1, front.j));
                visited[front.i - 1][front.j] = true;
            }
            // right side check
            if(front.j + 1 < n && grid[front.i][front.j + 1] == '1' && !visited[front.i][front.j + 1]){
                q.add(new Pair(front.i, front.j + 1));
                visited[front.i][front.j + 1] = true;
            }
            // down side check
            if(front.i + 1 < m && grid[front.i + 1][front.j] == '1' && !visited[front.i + 1][front.j]){
                q.add(new Pair(front.i + 1, front.j));
                visited[front.i + 1][front.j] = true;
            }
        }
    }
}
