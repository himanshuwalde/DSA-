class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int n) {
        List<Boolean> ans = new ArrayList<>();
        int max = arr[0];
        int i = 0;
        while(i < arr.length){
            if(arr[i] > max){
                max = arr[i];
            }
            i++;
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j] + n >= max){
                ans.add(true);
            }
            else{
                ans.add(false);
            } 
        }
        return ans;
    }
}
