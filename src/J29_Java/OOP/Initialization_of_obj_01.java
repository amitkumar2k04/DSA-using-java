package J29_Java.OOP;
// In this we see how initialization can be done by calling methods
class Point {
    int x, y;
    void setPoint(){
        // Here, we did initialization via: setPoint()
        /*
         Note1: If we create any other objects and we call setPoint() -> Then it will always initialised with the same value as
         e.g = x = 10, y = 20 -> So, this is not a good way to initialised the methods.

         Note2: Here we have to explicitly initialised the objects at the time of defining the methods.
         */
        x = 10;
        y = 20;
    }
}

public class Initialization_of_obj_01 {
    public static void main(String[] args) {
    Point p = new Point();
    p.setPoint();
        System.out.println("x = " + p.x);
        System.out.println("y = " + p.y);
    }
}
