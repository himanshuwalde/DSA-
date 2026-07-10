import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of matrix 1: ");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns of matrix 1: ");
        int c1 = sc.nextInt();
        System.out.println("Enter number of rows of matrix 2: ");
        int r2 = sc.nextInt();
        System.out.println("Enter number of columns of matrix 2: ");
        int c2 = sc.nextInt();
         if(c1 != r2){
             System.out.println("Multiplication not possible.");
             System.exit(0);
         }
         int[][] arr1  = new int[r1][c1];
        System.out.println("Enter the elements of matrix 1: ");
         for(int i=0; i<r1; i++){
             for(int j=0;j<c1; j++){
                 arr1[i][j] = sc.nextInt();
             }
         }
        System.out.println();
        int[][] arr2  = new int[r2][c2];
        System.out.println("Enter the elements of matrix 2: ");
        for(int i=0; i<r2; i++){
            for(int j=0;j<c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] arr3  = new int[r1][c2];
        System.out.println("Matrix Multiplication: ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for(int i=0; i<r1; i++){
            for(int j=0;j<c2; j++){
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
