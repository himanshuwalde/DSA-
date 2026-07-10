class Solution {
    public int maxDepth(String s) {
        int maxCount = 0;
        int count = 0;
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '('){
                count++;
            }
            else if(arr[i] == ')'){
                if(count > maxCount){
                    maxCount = count;
                }
                count--;
            }
        }
        return maxCount;
    }
}
