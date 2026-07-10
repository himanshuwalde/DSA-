class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int posIdx = 0;
        int negIdx = 1;
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                arr[posIdx] = nums[i];
                posIdx+=2;
            }
            else{
                arr[negIdx] = nums[i];
                negIdx+=2;
            }
        }
        return arr;
        
        // int n = nums.length;
        // ArrayList<Integer> ans1 = new ArrayList<>();
        // ArrayList<Integer> ans2 = new ArrayList<>();
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int i=0; i<n; i++){
        //     if(nums[i]>0){
        //         ans1.add(nums[i]);
        //     }
        //     else if(nums[i]<0){
        //         ans2.add(nums[i]);
        //     }
        // }
        // int idx1 = 0, idx2 = 0;
        // while(idx1 < n/2){
        //     ans.add(ans1.get(idx1));
        //     idx1++;
        //     ans.add(ans2.get(idx2));
        //     idx2++;
        // }
        // return ans.stream().mapToInt(Integer::intValue).toArray();   
    }
}
