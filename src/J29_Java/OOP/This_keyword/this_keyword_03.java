package J29_Java.OOP.This_keyword;
/*
 This program to demonstrate use of this: to invoke the current class method.

 Note:  If we want to access the same method in some other method, we have only learned that in order to access a method we should create an object.

 Example: A then 'this' will call the method m as well as method n. So, this so, so, when a.n; that means,we call the method n; it will print hello n and then it will print that hello m.
 */
class A{
    void m (){
        System.out.println("hello m");
    }
    void n (){
        System.out.println("hello n");
        this.m();
    }
}
public class this_keyword_03 {
    public static void main(String[] args) {
        A a = new A();
        a.n();
    }
}
