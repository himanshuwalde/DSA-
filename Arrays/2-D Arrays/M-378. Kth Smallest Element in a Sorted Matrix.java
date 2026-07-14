class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans.add(matrix[i][j]);
            }
        }
        Collections.sort(ans);
        return ans.get(k-1);
    }
}
