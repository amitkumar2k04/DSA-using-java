package J29_Java.OOP.Inheritance;
// Multiple inheritance achieving by using Interfaces

interface AB{
    public void run();
}
interface BC{
    public void run();
}
class D implements AB,BC{
    public void run(){
        System.out.println("C class run method");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
    BC obj = new D();
    obj.run();
    }
}
