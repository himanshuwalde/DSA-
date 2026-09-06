class Solution {
    public int captureForts(int[] forts) {
        int n = forts.length;
        int max = 0;
        for(int i=0; i<n-1; i++){
            if(forts[i] == 0) {
                continue;
            }
            int count = 0;
            for(int j=i+1; j<n; j++){
                if(forts[j] == 0){
                    count++;
                }
                else{
                    if(forts[j] == -forts[i]){
                        max = Math.max(max, count);
                    }
                    break;
                }
            }
        }
        return max;
    }
}
