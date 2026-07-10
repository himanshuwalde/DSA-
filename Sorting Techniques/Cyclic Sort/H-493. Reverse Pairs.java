class Solution {
    static int count;
    public int reversePairs(int[] nums) {
        count = 0;
        mergeSort(nums);
        return count;
    }
    public void mergeSort(int[] nums){
        int n = nums.length;
        if(n == 1){
            return;
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
        mergeSort(arr1);
        mergeSort(arr2);
        inversions(arr1, arr2);
        merge(arr1, arr2, nums);
    }
    public void inversions(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] > (long)2 * arr2[j]){
                count += (arr1.length - i);
                j++;
            }
            else{
                i++;
            }
        }
    }
    public void merge(int[] arr1, int[] arr2, int[] nums){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                nums[k++] = arr1[i++];
            }
            else{
                nums[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){
            nums[k++] = arr1[i++];
        }
        while(j < arr2.length){
            nums[k++] = arr2[j++];
        }
    }
}
