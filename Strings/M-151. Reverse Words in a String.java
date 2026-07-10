class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            while (i >= 0 && arr[i] == ' ') {
                i--;
            }
            if (i < 0) break;
            int j = i;
            while (j >= 0 && arr[j] != ' ') {
                j--;
            }
            for (int k = j + 1; k <= i; k++) {
                ans.append(arr[k]);
            }
            if (j > 0) {
                ans.append(" ");
            }
            i = j;
        }
        return ans.toString().trim();
    }
}
