class Solution {
    public int minimumSum(int num) {
        String s = String.valueOf(num);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int n1 = (arr[0] - '0')*10 + (arr[2] - '0');
        int n2 = (arr[1] - '0')*10 + (arr[3] - '0');
        return n1 + n2;
    }
}
