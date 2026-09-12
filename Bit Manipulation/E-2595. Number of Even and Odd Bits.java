class Solution {
    public int[] evenOddBit(int n) {
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            sb.append(n%2);
            n = n/2;
        }
        //sb.reverse();
        int even = 0;
        int odd = 0;
        for(int i=sb.length()-1; i>=0; i--){
            if(i%2 == 0 && sb.charAt(i) == '1'){
                even++;
            }
            else if(i%2 != 0 && sb.charAt(i) == '1'){
                odd++;
            }
        }
        return new int[]{even, odd};
    }
}
