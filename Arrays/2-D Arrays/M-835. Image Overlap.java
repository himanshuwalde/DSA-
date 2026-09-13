class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        ArrayList<int[]> A = new ArrayList<>();
        ArrayList<int[]> B = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(img1[i][j] == 1){
                    A.add(new int[]{i, j});
                }
                if(img2[i][j] == 1){
                    B.add(new int[]{i, j});
                }
            }
        }
        int[][] arr = new int[2 * n][2 * n];
        int count = 0;
        for(int[] a : A){
            for(int[] b : B){
                int dx = b[0] - a[0] + n;
                int dy = b[1] - a[1] + n;
                count = Math.max(count, ++arr[dx][dy]);
            }
        }
        return count;
    }
}
