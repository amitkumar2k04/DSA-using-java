package J29_Java.OOP.Super_keyword;

// case 2: Invoking parent class method

class Animals{
    void eat(){System.out.println("eating ...");}
}
class Dogs extends Animals{
    void eat(){System.out.println("eating bread ....");} // this eat() method are the overridden method to above one.
    void bark(){System.out.println("barking ....");}
    void work(){
        super.eat(); //This eat() method are refers to the parent class
//        bark();
//        eat();
    }
}

public class super_keyword_02 {
    public static void main(String[] args) {
    Dogs d = new Dogs();
    d.work();
    }
}
