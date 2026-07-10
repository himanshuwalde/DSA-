class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[0] = 1;
        st.push(0);
        for(int i=1; i<n; i++){
            while(st.size() > 0 && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                ans[i] = i - (-1);
            }
            else{
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            result.add(ans[i]);
        }
        return result;
    }
}
