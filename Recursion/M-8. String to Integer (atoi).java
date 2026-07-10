class Solution {
    public int myAtoi(String s) {
        return SToI(s, 0, 1, 0, false);
    }

    public int SToI(String s, int idx, int sign, long res, boolean started) {
        
        // end of string
        if (idx >= s.length()) {
            return (int)(sign * res);
        }

        char ch = s.charAt(idx);

        // skip leading spaces only before starting
        if (!started && ch == ' ') {
            return SToI(s, idx + 1, sign, res, false);
        }

        // handle sign only before starting
        if (!started && ch == '-') {
            return SToI(s, idx + 1, -1, res, true);
        }

        if (!started && ch == '+') {
            return SToI(s, idx + 1, 1, res, true);
        }

        // if not a digit, stop parsing
        if (!Character.isDigit(ch)) {
            return (int)(sign * res);
        }

        // process digit
        int digit = ch - '0';
        res = res * 10 + digit;

        // overflow check
        if (sign == 1 && res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (sign == -1 && -res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return SToI(s, idx + 1, sign, res, true);
    }
}
