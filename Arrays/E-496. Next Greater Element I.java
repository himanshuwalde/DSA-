class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        st.push(nums2[n2-1]);
        map.put(nums2[n2-1], -1);
        for(int i=n2-2; i>=0; i--){
            while(st.size() > 0 && nums2[i] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                map.put(nums2[i], -1);
            }
            else{
                map.put(nums2[i], st.peek());
            }
            st.push(nums2[i]);
        }
        for(int i=0; i<n1; i++){
            arr[i] = map.get(nums1[i]);
        }
        return arr;
    }
}

// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int n1 = nums1.length;
//         int n2 = nums2.length;
//         int[] arr = new int[n1];
//         for(int i=0; i<n1;  i++){
//             int j = 0;
//             while(j < n2 && nums1[i] != nums2[j]){
//                 j++;
//             }
//             j++;
//             for(int k=j; k<n2; k++){
//                 if(nums2[k] > nums1[i]){
//                     arr[i] = nums2[k];
//                     break;
//                 }
//             }
//             if(arr[i] == 0){
//                 arr[i] = -1;
//             }
//         }
//         return arr;
//     }
// }
