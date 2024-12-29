package J29_Java;

public class Prob46 {
    public static void main(String[] args) {
        int n = 5;
        // Outer loop responsible for rows
        for(int i = 1; i <= n; i++){
            // inner loop responsible for the column
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
