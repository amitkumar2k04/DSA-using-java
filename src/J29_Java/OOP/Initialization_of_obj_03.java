package J29_Java.OOP;
/*
Note: In this we see that how the automatic object initialization using constructor
 */
class Circle02 {
    double x, y;
    double r;

    double Circumference() {
        return 2 * Math.PI * r;
    }

    double Area() {
        return Math.PI * r * r;
    }

    Circle02(double a, double b, double c) {
        x = a;
        y = b;
        r = c;
    }
}

public class Initialization_of_obj_03 {
    public static void main(String[] args) {

        Circle02 c1 = new Circle02(3.0, 4.0, 5.0);

        System.out.println("Circumference Circle: " + c1.Circumference());
        System.out.println("Area Circle: " + c1.Area());
    }
}
