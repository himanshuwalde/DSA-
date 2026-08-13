class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length;
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        paths(0, 0, maze, visited, ans, "", n);
        Collections.sort(ans);
        return ans;
    }
    public void paths(int row, int col, int[][] maze, boolean[][] visited, ArrayList<String> ans, String s, int n){
        if(row >= n || col >= n || row < 0 || col < 0 || maze[row][col] == 0 || visited[row][col]){
            return;
        }
        visited[row][col] = true;
        if(row == n-1 && col == n-1){
            ans.add(s);
            visited[row][col] = false;
            return;
        }
        paths(row, col-1, maze, visited, ans, s+'L', n);    // left
        paths(row-1, col, maze, visited, ans, s+'U', n);    // up
        paths(row, col+1, maze, visited, ans, s+'R', n);    // right
        paths(row+1, col, maze, visited, ans, s+'D', n);    // down
        visited[row][col] = false;
    }
}
