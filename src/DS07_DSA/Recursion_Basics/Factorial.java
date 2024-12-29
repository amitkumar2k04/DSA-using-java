package DS07_DSA.Recursion_Basics;

public class Factorial {
    static int Factorials(int n ){
        // Base case
        if(n == 0) return 1;

        return n*Factorials(n-1);
    }


    public static void main(String[] args) {
        System.out.println(Factorials(5));
    }
}
