class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int i = 0, j = n-1;
        int max1 = 0;
        int max2 = 0;
        while(i <= j){
            if(colors[i] == colors[j]){
                i++;
            }
            else{
                max1 = Math.max(max1, Math.abs(i-j));
                break;
            }
        }
        i = 0;
        j = n-1;
        while(i <= j){
            if(colors[i] == colors[j]){
                j--;
            }
            else{
                max2 = Math.max(max2, Math.abs(i-j));
                break;
            }
        }
        return Math.max(max1, max2);
    }
}
