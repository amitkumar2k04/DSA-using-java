package J29_Java.ExceptionHandling;

public class exception02 {
    public static void divisionDemo(int dividend, int divisor)throws ArithmeticException{
        System.out.println("The result is: " +dividend/divisor);
    }
    public static void main(String[] args) {
        divisionDemo(10, 0);
    }
}
