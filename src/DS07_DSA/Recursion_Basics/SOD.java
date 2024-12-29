package DS07_DSA.Recursion_Basics;

public class SOD {
    static int sumOfDigits(int n){
        // Base case
        if(n >= 0 && n <= 9){
            return n;
        }
        return sumOfDigits(n / 10) + n % 10;


//        // Recursive Work
//        int smallAns = sumOfDigits(n / 10);
//
//        // self work
//        int ans = smallAns + n%10;
//        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(856));
    }
}
