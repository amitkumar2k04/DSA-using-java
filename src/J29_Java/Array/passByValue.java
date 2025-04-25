package J29_Java.Array;

public class passByValue {

    static void changeValue(int a){
        a = a * 100;
    }
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before changing value: " + a);
        changeValue(a);
        System.out.println("After changing value : " + a);
    }
}
