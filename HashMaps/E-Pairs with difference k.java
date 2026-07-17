class Solution {
    int countPairs(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int ele : arr){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        for(int ele :map.keySet()){
            int rem1 = ele - k;
            int rem2 = ele + k;
            if(map.containsKey(rem1)){
                count += map.get(ele) * map.get(rem1);
            }
            if(map.containsKey(rem2)){
                count += map.get(ele) * map.get(rem2);
            }
        }
        count = count/2;
        return count;
    }
}
