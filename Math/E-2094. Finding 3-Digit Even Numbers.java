class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if (digits[i] == 0) {
                continue;
            }
            for(int j=0; j<n; j++){
                if(j == i){
                    continue;
                }
                for(int k=0; k<n; k++){
                    if(k == j || k == i) {
                        continue;
                    }
                    if(digits[k] % 2 != 0){
                        continue;
                    }
                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    set.add(number);
                }
            }
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for(int ele : set){
            arr[i++] = ele;
        }
        Arrays.sort(arr);
        return arr;
    }
}
