package Interview_questions;
// Count the number of object created

 class Abc {
     static int count = 0;
     Abc(){
         count++;
     }
     static void display(){
         System.out.println(count);
     }
 }
public class Count_no_of_object_created {
    public static void main(String[] args) {
    Abc obj1 = new Abc();
    Abc obj2 = new Abc();
    Abc obj3 = new Abc();
    Abc obj4 = new Abc();
    Abc obj5 = new Abc();
    Abc.display();
    }
}
