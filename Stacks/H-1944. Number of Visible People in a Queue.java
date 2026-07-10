class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        arr[n-1] = 0;
        st.push(heights[n-1]);
        for(int i=n-2; i>=0; i--){
            int count = 0;
            while(st.size() > 0 && heights[i] >= st.peek()){
                count++;
                st.pop();
            }
            if(st.size() > 0){
                count++;
            }
            arr[i] = count;
            st.push(heights[i]);
        }
        return arr;
    }
}
