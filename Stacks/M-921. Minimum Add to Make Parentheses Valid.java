class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int ans = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    ans++;
                }
                else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            st.pop();
            ans++;
        }
        return ans;
    }
}
