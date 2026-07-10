class Solution {
    public int maxPower(String s) {
        char[] arr = s.toCharArray();
        int i=0, j=0;
        int count = 0, maxCount = Integer.MIN_VALUE;
        while(i<s.length()){
            if(arr[i] == arr[j]){
                i++;
            }
            else{
                count = i-j;
                j = i;
                if(count > maxCount){
                    maxCount = count;
                }
            }
        }
        count = i-j;
        if(count > maxCount){
            maxCount = count;
        }
        return maxCount;
    }
}
