package NPTEL;

public class Main {
    public static void main(String[] args) {
        // Commented-out code seems to be a previous test. Uncomment if needed.
        // int a , b = 0;
        // a = 123;
        // b = 45;
        // int c = a + b;
        // System.out.println("The Sum is: " + c);

        int my3DArray[][][] = new int[3][4][5];
        int i, j, k;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                for (k = 0; k < 5; k++)
                    my3DArray[i][j][k] = i * j * k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(my3DArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
