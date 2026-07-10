class Solution {
    public String largestOddNumber(String num) {
        char[] arr = num.toCharArray();
        int n = arr.length;
        if ((arr[n - 1] - '0') % 2 == 1) {
            return num;
        }
        int j = -1;
        for (int i = n - 1; i >= 0; i--) {
            if ((arr[i] - '0') % 2 == 1) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return "";
        }
        return num.substring(0, j + 1);
    }
}
