package DS07_DSA.Recursion_Basics;

public class COD {
    static int countOfDigits(int n){
        // base case
        if(n >= 0 && n <= 9){
            return 1;
        }
        return countOfDigits(n/10) + 1;
    }

    public static void main(String[] args) {
        System.out.println(countOfDigits(567898568));
    }
}
