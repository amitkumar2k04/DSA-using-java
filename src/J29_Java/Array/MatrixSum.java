package J29_Java.Array;

import java.util.Scanner;

public class MatrixSum {
    static void printArray(int[][] arr){
        for (int i = 0; i<arr.length; i++){ //row
            //System.out.println(arr[i]);
            for(int j = 0; j<arr[i].length; j++){ //column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input - Addition not possible");
            return;
        }
        int[][] sum = new int[r1][r2];
        for(int i = 0; i < r1; i++){  // row number
            for(int j = 0; j < c1; j++){  // column number
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printArray(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows and colm of matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter matrix values: ");
        for (int i = 0; i < r1; i++){
            for (int j = 0; j< c1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter no of rows and colm of matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter matrix values: ");
        for (int i = 0; i < r2; i++){
            for (int j = 0; j< c2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printArray(a);

        System.out.println("Matrix 2");
        printArray(b);

        System.out.println("Sum of Matrix 1 and matrix 2 ");
        add(a, r1, c1, b, r2, c2);
    }
}
