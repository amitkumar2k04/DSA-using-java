package J29_Java;

public class Prob49 {
    public static void main(String[] args) {
        int n = 5;
        for(int i =n; i>= 1; i--){
            //cols
            for(int j =1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
