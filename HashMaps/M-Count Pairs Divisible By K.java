class Solution {
    public int countKdivPairs(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele%k, map.getOrDefault(ele%k, 0) + 1);
        }
        long pairs = 0;
        // check for zero remainders
        long zeroCount = map.getOrDefault(0, 0);
        pairs += (zeroCount * (zeroCount-1))/2;
        map.remove(0);
        // check for k/2 remainders
        if(k%2 == 0 && map.containsKey(k/2)){
            long halfCount = map.get(k/2);
            pairs += (halfCount * (halfCount-1))/2;
            map.remove(k/2);
        }
        pairs = pairs * 2;
        for(int ele : map.keySet()){
            int rem = k - ele;
            if(map.containsKey(rem)){
                pairs += map.get(ele) * map.get(rem);
            }
        }
        pairs = pairs/2;
        return (int)pairs;
    }
}
