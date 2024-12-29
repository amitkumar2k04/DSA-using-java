package J29_Java.OOP;

/*
 Let's see the best way to initialised the objects -> By using passing arguments -> This initialization will be done while the object is created itself.
 -> This concept of the automatically initialization at the time of obj creation is called constructor.
 */
class Point02{
    int x, y;
    void setPoint(int a, int b) {
        x = a;
        y = b;
    }
}

public class Initialization_of_obj_02 {
    public static void main(String[] args) {
    Point02 p = new Point02();

    p.setPoint(15, 20 );

        System.out.println("x = " + p.x);
        System.out.println("y = " + p.y);
    }
}
