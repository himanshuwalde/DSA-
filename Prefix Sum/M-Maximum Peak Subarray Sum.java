import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long[] incSum = new long[n];
        long[] decSum = new long[n];
        int[] incLen = new int[n];
        int[] decLen = new int[n];

        // Increasing from left
        incSum[0] = arr[0];
        incLen[0] = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                incSum[i] = incSum[i - 1] + arr[i];
                incLen[i] = incLen[i - 1] + 1;
            } else {
                incSum[i] = arr[i];
                incLen[i] = 1;
            }
        }

        // Decreasing from right
        decSum[n - 1] = arr[n - 1];
        decLen[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                decSum[i] = decSum[i + 1] + arr[i];
                decLen[i] = decLen[i + 1] + 1;
            } else {
                decSum[i] = arr[i];
                decLen[i] = 1;
            }
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            if (incLen[i] >= 2 && decLen[i] >= 2) {
                ans = Math.max(ans, incSum[i] + decSum[i] - arr[i]);
            }
        }

        System.out.println(ans);
    }
}
