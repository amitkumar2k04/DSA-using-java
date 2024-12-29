package J29_Java.OOP.This_keyword;
// The following program shows the use of this() to avoid the name space collision.
class student{
    String name;
    int rollNo;
    String course;
    float fee;

    student(int rollNo, String name, String course, float fee){
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.fee = fee;
    }
    void display(){
        System.out.println(name+ " " +rollNo+ " " + course + " " + fee);
    }
}
public class this_keyword_02 {
    public static void main(String[] args) {
    student s1 = new student(19, "amit","Java",3999);

    s1.display();
    }
}
