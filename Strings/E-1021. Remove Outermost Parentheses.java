class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int depth = 0;
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '('){
                if(depth > 0){
                    ans.append(arr[i]);
                }
                depth++;
            }
            else{
                depth--;
                if(depth > 0){
                    ans.append(arr[i]);
                }    
            }
        }
        return ans.toString();
    }
}
