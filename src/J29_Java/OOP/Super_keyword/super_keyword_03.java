package J29_Java.OOP.Super_keyword;

/*
Case3: Invoking parent class constructor
 */
class Animal{
    Animal(){
        System.out.println("animal is created");
    }
}
class Dog extends Animal{
    Dog(){
        super();  // then Animal() constructor is also called here
        System.out.println("Dog is created");
    }
}

public class super_keyword_03 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
