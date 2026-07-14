class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele: nums){
            pq.add(ele);
        }
        int[] arr = new int[pq.size()];
        int i = 0;
        while(pq.size() > 0){
            arr[i++] = pq.remove();
        }
        return arr;
    }
}
