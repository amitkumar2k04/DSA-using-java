package J29_Java.OOP;

class Employee{
    String name;
    int salary;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}


public class Custom_class01 {
    public static void main(String[] args) {
        Employee Amit = new Employee();  // Instantiating a new Employee Object

        // Setting the attributes
        Amit.setName("Sumit_Gupta");
        Amit.salary = 90;


        // printing the details
        System.out.println("My name is: " + Amit.getName());
        System.out.println("and my salary is: " + Amit.getSalary());

    }
}
