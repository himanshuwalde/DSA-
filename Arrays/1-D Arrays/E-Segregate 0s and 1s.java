class Solution {
    void segregate0and1(int[] arr) {
        int i = 0, j = 0;
        while(j != arr.length){
            if(arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }
}
