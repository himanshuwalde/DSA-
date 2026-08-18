class Pair implements Comparable<Pair>{
    int val;
    int wt;
    double ratio;
    Pair(int val, int wt){
        this.val = val;
        this.wt = wt;
        this.ratio = (double) val/wt;
    }
    public int compareTo(Pair p){
        return Double.compare(this.ratio, p.ratio);
    }
}
class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;
        Pair[] arr = new Pair[n];
        for(int i=0; i<n; i++){
            arr[i] = new Pair(val[i], wt[i]);
        }
        Arrays.sort(arr);
        double profit = 0;
        for(int i=n-1; i>=0 && capacity > 0; i--){
            if(arr[i].wt <= capacity){
                profit += arr[i].val;
                capacity -= arr[i].wt;
            }
            else{
                profit += (double)capacity * arr[i].ratio;
                break;
            }
        }
        return profit;
    }
}

// class Pair implements Comparable<Pair>{
//     double div;
//     int idx;
//     Pair(double div, int idx){
//         this.div = div;
//         this.idx = idx;
//     }
//     public int compareTo(Pair p){
//         return Double.compare(this.div, p.div);
//     }
// }
// class Solution {
//     public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
//         int n = val.length;
//         PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//         for(int i=0; i<n; i++){
//             maxHeap.add(new Pair((double)val[i]/wt[i], i));
//         }
//         double profit = 0;
//         while(capacity > 0 && maxHeap.size() > 0){
//             Pair top = maxHeap.remove();
//             int idx = top.idx;
//             if(wt[idx] <= capacity){
//                 profit += val[idx];
//                 capacity -= wt[idx];
//             }
//             else{
//                 profit += (double)capacity * val[idx]/wt[idx];
//                 capacity = 0;
//             }
//         }
//         return profit;
//     }
// }
