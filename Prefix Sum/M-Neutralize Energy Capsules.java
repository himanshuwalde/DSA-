import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            int currSum = arr[i];
            for(int j=i+1; j<n-1; j++){
                currSum += arr[j];
                if(currSum == arr[j+1]){
                    for(int k=i; k<=j+1; k++){
                        arr[k] = 0;
                    }
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
