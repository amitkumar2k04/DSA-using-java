package J29_Java.OOP.Super_keyword;

// case 1: Invoking class instance variable
// Super can be used to reference the parent class instance variable

class Animal01{
    String color = "white";
}
class Dog01 extends Animal01{
    String color = "black";
    void printColor(){
//        System.out.println(color);
        System.out.println(super.color);
    }
}

public class super_keyword_01 {
    public static void main(String[] args) {
        Dog01 d = new Dog01();
        d.printColor();
    }
}
