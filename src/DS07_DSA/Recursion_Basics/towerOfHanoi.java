package DS07_DSA.Recursion_Basics;

public class towerOfHanoi {
    public static void tower_Of_Hanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println(" transfer disk " + n + " from " + src + " to " +dest);
            return;
        }
        tower_Of_Hanoi(n-1, src, dest, helper);
        System.out.println(" transfer disk " + n + " from " + src +  " to " +dest);
        tower_Of_Hanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 5;
        tower_Of_Hanoi(n, "S", "H", "D");
    }
}
