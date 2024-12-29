package J29_Java.OOP.Inheritance;

class A{
    public void printA(){
        System.out.println("Class A method ");
    }
}
class B extends A{
    public void printB(){
        System.out.println("Class B method ");
    }
}
class C extends A{
    public void printC(){
        System.out.println("Class C method ");
    }
}

public class Hierarchical_inheritance {
    public static void main(String[] args) {
    B obj = new B();
    obj.printB();

    C obj2 = new C();
    obj2.printC();
    }
}
