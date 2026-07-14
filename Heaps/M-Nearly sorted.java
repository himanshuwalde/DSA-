class Solution {
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for(int ele: arr){
            pq.add(ele);
            if(pq.size() > k){
                arr[i++] = pq.remove();
            }
        }
        while(pq.size() > 0){
            arr[i++] = pq.remove();
        }
    }
}
