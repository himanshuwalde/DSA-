class Solution {
    public int findPages(int[] books, int k) {
        if(k > books.length){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for(int pages : books){
            max = Math.max(max, pages);
            sum += pages;
        }
        long low = max;
        long high = sum;
        long ans = high;
        while(low <= high){
            long mid = low + (high - low)/2;
            if(isPossible(mid, books, k)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return (int)ans;
    }
    public boolean isPossible(long maxPages, int[] books, int k){
        int students = 1;
        long pages = 0;
        for (int book : books) {
            if (pages + book <= maxPages) {
                pages += book;
            } else {
                students++;
                pages = book;

                if (students > k)
                    return false;
            }
        }
        return true;
    }
}
