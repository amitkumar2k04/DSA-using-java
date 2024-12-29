package J29_Java.OOP;

interface Car{
    public void start();
}
class ElectricCar implements Car{
    public void start(){
        System.out.println("Electric car starts");
    }
}
class DieselCar implements Car{
    public void start(){
        System.out.println("Diesel CAr starts ");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
    Car Tesla = new ElectricCar();
    Car XUV700 = new DieselCar();

    Tesla.start();
    XUV700.start();
    }
}
