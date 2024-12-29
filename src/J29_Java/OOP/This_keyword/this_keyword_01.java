package J29_Java.OOP.This_keyword;

class EkClass{
    int a;

    public int getA() {
        return a;
    }

    public EkClass(int a) {
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}

public class this_keyword_01 {
    public static void main(String[] args) {

        EkClass e = new EkClass(5);
        System.out.println(e.getA());

    }
}
