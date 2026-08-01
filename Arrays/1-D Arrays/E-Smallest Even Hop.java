import java.util.*;

public class Main {
    private static int hop(int n,int[] arr){
        int ans = Integer.MAX_VALUE;
        for(int h=1; h<n; h++){
            boolean valid = true;
            for(int i=0; i<n; i+=h){
                if(arr[i]%2 != 0){
                    valid = false;
                    break;
                }
            }
            if(valid){
                ans = Math.min(ans, h);
                break;
            }
           
        }
        return (ans == Integer.MAX_VALUE)? -1 : ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(hop(n, arr));
    }
}
