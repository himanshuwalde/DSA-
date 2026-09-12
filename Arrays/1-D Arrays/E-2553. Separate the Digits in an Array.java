class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int ele : nums){
            String s = String.valueOf(ele);
            for(int i=0; i<s.length(); i++){
                arr.add(s.charAt(i) - '0');
            }
        }
        int[] ans = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
