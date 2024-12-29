package J29_Java.OOP.Encapsulation_;

class Student{
    private String name;
    private int age;
    private int roll_no;

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getRoll_no(){
        return roll_no;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setRoll_no(int rollNo){
        this.roll_no = rollNo;
    }
}

public class demo {
    public static void main(String[] args) {
    Student obj = new Student();
    obj.setName("Amit");
    obj.setAge(24);
    obj.setRoll_no(19);

    System.out.println(obj.getName());
    System.out.println(obj.getAge());
    System.out.println(obj.getRoll_no());
    }
}
