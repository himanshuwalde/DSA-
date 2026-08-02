import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for(int i=0; i<n; i++){
            s[i] = sc.nextInt();
        }
        int[] w = new int[n];
        for(int i=0; i<n; i++){
            w[i] = sc.nextInt();
        }
        float maxScore = Integer.MIN_VALUE;
        float avg = 0;
        for(int i=0; i<n-1; i++){
            float numerator = s[i] * w[i];
            float denominator = w[i];
            for(int j=i+1; j<n; j++){
                numerator += (s[j] * w[j]);
                denominator += w[j];
                avg = numerator/denominator;
                maxScore = Math.max(maxScore, avg);
            }
        }
        System.out.printf("%.2f", maxScore);
    }
}
