class Solution {
    public int distinctAverages(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : nums){
            minHeap.add(ele);
            maxHeap.add(ele);
        }
        HashSet<Double> set = new HashSet<>();
        while(minHeap.size() > 0){
            double avg = (minHeap.remove() + maxHeap.remove())/2.0;
            set.add(avg);
        }
        return set.size();
    }
}
