class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] chessBoard = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                chessBoard[i][j] = '.';
            }
        }
        nQueens(0, n, chessBoard, ans);
        return ans;
    }
    public void nQueens(int row, int n, char[][] chessBoard, List<List<String>> ans){
        if(row == n){
            List<String> current = new ArrayList<>();
            for(int i=0; i<n; i++){
                current.add(new String(chessBoard[i])); 
            }
            ans.add(current);
            return;
        }
        for(int col=0; col<n; col++){
            if(canQueenBePlaced(row, col, chessBoard, n)){
                chessBoard[row][col] = 'Q';
                nQueens(row+1, n, chessBoard, ans);
                chessBoard[row][col] = '.';
            }
        }
    }
    public boolean canQueenBePlaced(int row, int col, char[][] chessBoard, int n){
        // check column
        int i = row-1;
        while(i >= 0){
            if(chessBoard[i][col] == 'Q'){
                return false;
            }
            i--;
        }
        // check left diagonal
        i = row - 1;
        int j = col - 1;
        while(i >= 0 && j >= 0){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
            i--;
            j--;
        }
        // check right diagonal
        i = row - 1;
        j = col + 1;
        while(i >= 0 && j < n){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
