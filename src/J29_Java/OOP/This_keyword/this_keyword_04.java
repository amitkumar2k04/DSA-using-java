package J29_Java.OOP.This_keyword;
/*
Use of 'this' keyword: No object creation to invoked method.

So, If you want to call any constructor within another constructor, then you can use 'this' keyword
 */
class B{
    B(){
        this(5);
        System.out.println("hello A");
    }
    B(int x){
        System.out.println(x);
    }
}
public class this_keyword_04 {
    public static void main(String[] args) {
        B a = new B();
    }
}
