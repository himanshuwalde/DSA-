import java.util.Scanner;

public class minOfAllMaxEleOfRow {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        System.out.println("Enter elements of array: ");
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            if(max < min){
                min = max;
            }
        }
        System.out.println("Minimum of all maximum elements of each row: "+min);
    }
}
