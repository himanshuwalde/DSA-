class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if((j-i) % 2 == 0){
                    for(int k=i; k<=j; k++){
                        ans += arr[k];
                    }
                }
            }
        }
        return ans;
    }
}
