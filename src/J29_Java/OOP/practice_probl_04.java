package J29_Java.OOP;

class Reactngle{
    int length;
    int bredth;

    public int Area(){
        return length * bredth;
    }

    public int perimeter(){
        return 2 * (length + bredth);
    }
}

public class practice_probl_04 {
    public static void main(String[] args) {
        Reactngle rc = new Reactngle();

        rc.length = 8;
        rc.bredth = 9;

        System.out.println(rc.Area());
        System.out.println(rc.perimeter());
    }
}
