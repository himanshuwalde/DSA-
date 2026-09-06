class Solution {
    public boolean checkZeroOnes(String s) {
        int n = s.length();
        int onesCount = 0;
        int zeroesCount = 0;
        int count1 = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '1'){
                count1++;
            }
            else{
                onesCount = Math.max(onesCount, count1);
                count1 = 0;
            }
        }
        onesCount = Math.max(onesCount, count1);
        int count0 = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '0'){
                count0++;
            }
            else{
                zeroesCount = Math.max(zeroesCount, count0);
                count0 = 0;
            }
        }
        zeroesCount = Math.max(zeroesCount, count0);
        return onesCount > zeroesCount;
    }
}
