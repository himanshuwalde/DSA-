class Solution {
    public int[] mergeSort(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums;
        }
        int[] arr1 = new int[n/2];
        int[] arr2 = new int[n-n/2];
        int idx = 0;
        for(int i=0; i<arr1.length; i++){
            arr1[i] = nums[idx++];
        }
        for(int i=0; i<arr2.length; i++){
            arr2[i] = nums[idx++];
        }
        arr1 = mergeSort(arr1);
        arr2 = mergeSort(arr2);
        return merge(arr1, arr2);
    }
    
    public int[] merge(int[] arr1, int[] arr2){
        int[] tar = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                tar[k++] = arr1[i++];
            }
            else{
                tar[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){
            tar[k++] = arr1[i++];
        }
        while(j < arr2.length){
            tar[k++] = arr2[j++];
        }
        return tar;
    }
}
