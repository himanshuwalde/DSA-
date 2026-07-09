class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] arr = new int[n];
        boolean[] arr1 = new boolean[n];
        for(int i=0; i<n; i++){
            arr1[i] = false;
        }
        for(int i=0; i<n; i++){
            if(!arr1[index[i]]){
                arr[index[i]] = nums[i];
                arr1[i] = true;
            }
            else{
                for(int j=n-1; j>index[i]; j--){
                    arr[j] = arr[j-1];
                }
                arr[index[i]] = nums[i];
                arr1[i] = true;
            }
        }
        return arr;
    }
}
