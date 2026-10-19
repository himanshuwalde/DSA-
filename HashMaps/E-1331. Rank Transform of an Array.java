class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] newArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int i=0; i<newArr.length; i++){
            if(map.containsKey(newArr[i])){
                map.put(newArr[i], map.get(newArr[i]));
            }
            else{
                map.put(newArr[i], rank++);
            }
        }
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}
