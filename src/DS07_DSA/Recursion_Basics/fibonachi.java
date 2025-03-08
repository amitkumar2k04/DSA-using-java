package DS07_DSA.Recursion_Basics;

public class fibonachi {
    public static int fib(int n){
        if(n == 0 || n == 1) return n;

        //return fib(n -1) + fib(n-2);

        // subproblems - Recursive Work
        int prev = fib(n-1);
        int prevPrev = fib(n-2);

        // self work
        int ans = prev + prevPrev;
        return ans;
    }

    public static void main(String[] args) {
        for(int i = 0; i<=10; i++){
            System.out.println(fib(i));
        }
    }
}


// next ques based on HCF
// next question based on LCM