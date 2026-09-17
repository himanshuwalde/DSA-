class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left; i<=right; i++){
            int x = i;
            boolean flag = true;
            while(x != 0){
                int rem = x % 10;
                if(rem == 0 || i % rem != 0){
                    flag = false;
                    break;
                }
                x /= 10;
            }
            if(flag){
                ans.add(i);
            }
        }
        return ans;
    }
}
