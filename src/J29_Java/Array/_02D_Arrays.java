package J29_Java.Array;

import java.util.Scanner;

public class _02D_Arrays {

    static void printArray(int[][] arr){
        for (int i = 0; i<arr.length; i++){ //row
            //System.out.println(arr[i]);
            for(int j = 0; j<arr[i].length; j++){ //column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // taking 2D array input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int c = sc.nextInt();

//    int [][]  arr2 = {
//            {1, 5, 6},
//            {7, 9, 11},
//            {8, 1, 1}
//    };

        int [][] arr3 = new int[r][c];

        System.out.println("Enter " + r*c + " elements");
        for(int i = 0; i < r; i++){ // row
            for(int j = 0; j<c; j++){ // column
                arr3[i][j] = sc.nextInt();
            }
        }
    printArray(arr3);


























//        int [] marks; // 1-D Arrays
//        int [][] flats; // 2D-Arrays
//        flats = new int [2][3];
//        flats[0][0] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
//        // Displaying 2D arrays
//        for(int i = 0; i<flats.length; i++){
//            for(int j = 0; j<flats[i].length; j++){
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("\n");
//        }


    }
}
