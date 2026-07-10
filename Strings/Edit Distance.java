public class EditDistance {
    public static void main(String[] args){
        String s = "ycce";
        String t = "ycsces";
        int a = s.length();
        int b = t.length();
        int  i=0, j=0, count = 0;
        if(a > b) System.out.println(a-b);
        else if(b > a) System.out.println(b-a);
        else {
            while (i < s.length()) {
                if (s.charAt(i) != t.charAt(j)) {
                    count++;
                }
                i++;
                j++;
            }
            System.out.println(count);
        }
    }
}
