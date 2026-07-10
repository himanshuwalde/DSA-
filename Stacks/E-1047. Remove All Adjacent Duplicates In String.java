class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(st.size()>0 && ch == st.peek()){
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        Stack<Character> st2 = new Stack<>();
        while(st.size() != 0){
            st2.push(st.peek());
            st.pop();
        }
        String ans = "";
        while(st2.size() != 0){
            ans+= st2.peek();
            st2.pop();
        }
        return ans;
    }
}
