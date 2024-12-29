package DS07_DSA.Recursion_Basics;

public class Power {
    static int pow(int p, int q){
        // Base case
        if(q == 0){
            return 1;
        }
        //return pow(p, q-1) * p;

        // 2nd approach -> Optimised T.C
        int smallPow = pow(p, q/2);
        if(q % 2 == 0){  // When q is even
            return smallPow * smallPow;
        } else {  // q->odd
            return p * smallPow * smallPow;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(5,4));
    }
}
