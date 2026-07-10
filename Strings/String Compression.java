import java.util.*;

class StringCompression {
    public static void main(String[] args) {
        String s1 = "aabbb";
        StringBuilder s = new StringBuilder();
        for(int i = 0; i<s1.length(); i++) {
            int count = 1;
            int j = i;
            while(j < s1.length()-1 && s1.charAt(j) == s1.charAt(j+1)) {
                count++;
                j++;
            }
            s.append(s1.charAt(i));
            s.append(count);
            i = j;
        }
        System.out.println(s);
    }
}
