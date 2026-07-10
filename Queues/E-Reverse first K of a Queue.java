class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (q.isEmpty() || k > q.size())
            return q;
        if (k <= 0)
            return q;
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i=1; i<=k; i++){
            st.push(q.remove());
        }
        while(st.size() > 0){
            q.add(st.pop());
        }
        for(int i=1; i<=n-k; i++){
            q.add(q.remove());
        }
        return q;
    }
}
