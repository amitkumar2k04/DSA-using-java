package J29_Java;

public class prob35 {
    public static void main(String[] args) {
        int n = 5478;
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            // task
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
