// USING 1 STACK:
class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for(int i=1; i<=n/2; i++){
            st.push(q.remove());
        }
        while(st.size() > 0){
            q.add(st.pop());
        }
        for(int i=1; i<=n/2; i++){
            st.push(q.remove());
        }
        while(st.size() > 0){
            q.add(st.pop());
            q.add(q.remove());
        }
        while(q.size() > 0){
            st.push(q.remove());
        }
        while(st.size() > 0){
            q.add(st.pop());
        }
    }
}

// USING 2 STACKS:
// class Solution {
//     public void rearrangeQueue(Queue<Integer> q) {
//         Stack<Integer> st1 = new Stack<>();
//         Stack<Integer> st2 = new Stack<>();
//         int n = q.size();
//         for(int i=1; i<=n/2; i++){
//             st1.push(q.remove());
//         }
//         while(st1.size() > 0){
//             st2.push(st1.pop());
//         }
//         while(st2.size() > 0){
//             q.add(st2.pop());
//             q.add(q.remove());
//         }
//     }
// }
