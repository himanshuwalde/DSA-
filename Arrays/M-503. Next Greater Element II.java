class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            st.push(nums[i]);
        }
        for(int i=n-1; i>=0; i--){
            while(st.size() > 0 && nums[i] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                arr[i] = -1;
            }
            else{
                arr[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return arr;
    }
    // public int[] nextGreaterElements(int[] nums) {
    //     int n = nums.length;
    //     int[] arr = new int[n];
    //     Arrays.fill(arr, -1);
    //     for(int i=0; i<n; i++){
    //         for(int j=1; j<n; j++){
    //             int idx = (i+j)%n;
    //             if(nums[idx] > nums[i]){
    //                 arr[i] = nums[idx];
    //                 break;
    //             }
    //         }
    //     }
    //     return arr;
    // }
}
