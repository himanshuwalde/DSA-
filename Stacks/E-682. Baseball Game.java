class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i].equals("+")){
                int fTop = st.pop();
                int sTop = st.peek();
                int sum = fTop + sTop;
                st.push(fTop);
                st.push(sum);
            }
            else if(arr[i].equals("D")){
                st.push(2 * st.peek());
            }
            else if(arr[i].equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(arr[i]));
            }
        }
        int sum = 0;
        while(st.size() != 0){
            sum += st.pop();
        }
        return sum;
    }
}
