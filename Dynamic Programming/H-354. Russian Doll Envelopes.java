class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a,b) -> (a[0]!=b[0]) ? Integer.compare(a[0],b[0]) : Integer.compare(b[1],a[1]));
        ArrayList<Integer> ans = new ArrayList<>();

        // find LIS
        for(int[] arr : envelopes){
            int ele = arr[1];
            if(ans.size() == 0 || ele > ans.get(ans.size()-1)){
                ans.add(ele);
            }
            else{
                replaceWithLowerBound(ele, ans);
            }
        }
        return ans.size();
    }
    public void replaceWithLowerBound(int ele, ArrayList<Integer> ans) {
        int low = 0;
        int high = ans.size()-1;
        int lb = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(ans.get(mid) >= ele){
                lb = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        ans.set(lb, ele);
    }
}
