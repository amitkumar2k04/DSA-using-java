package J29_Java.OOP.practice.java;

class student {
    String name;
    int id;
    int age;
    student(int id, int age){
        this.id = id;
        this.age = age;
    }
    void print(){
        System.out.println();
    }

}

public class constructor1 {
    public static void main(String[] args) {
    student st = new student(21, 12);
    }
}
