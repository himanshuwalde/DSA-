class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) != '*'){
                sb.append(s.charAt(i));
            }
            else{
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}

// class Solution {
//     public String removeStars(String s) {
//         Stack<Character> st = new Stack<>();
//         int n = s.length();
//         for(int i=0; i<n; i++){
//             if(s.charAt(i) != '*'){
//                 st.push(s.charAt(i));
//             }
//             else{
//                 st.pop();
//             }
//         }
//         Stack<Character> st2 = new Stack<>();
//         while(st.size() > 0){
//             st2.push(st.pop());
//         }
//         String ans = "";
//         while(st2.size() > 0){
//             ans += st2.pop();
//         }
//         return ans;
//     }
// }
