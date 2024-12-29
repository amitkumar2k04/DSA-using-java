package J29_Java.OOP;
/*
 Demonstration of constructor overloading


  constructor is basically using 3 parameters. Now, this constructor then can be used to define another constructor by means of this the methods.
  So, for example, the 2nd constructor : this we call the same constructor here by using the this and passing 0.0, 0.0 r similar is the second constructor we use this c.x c.y c.r.
  Here this and all these this basically indicates the one privilege constructor which is which has the three parameters and automatically it called them.


  Imp note: what the constructor overloading is concerned two constructors can be treated as different; if they are different in terms of the parameters:  1. number of parameters  2. the type of parameters .
 */
class Circle05{
    double x, y;
    double r;

    Circle05(double x, double y, double r){
        this.x = x; this.y = y; this.r = r;
    }
    Circle05(double r){
        this(0.0, 0.0, r);
    }
    Circle05(){
        this(0.0, 0.0, 1.0);
    }

    double Circumference() {
        return 2 * Math.PI * r;
    }

    double Area() {
        return Math.PI * r * r;
    }
}
public class Constructor_overloading_with_this_keyword {
    public static void main(String[] args) {
    Circle05 c1 = new Circle05(3.4, 5.5, 5.0);
    Circle05 c2 = new Circle05(5.8);


        System.out.println("Circumference of the circle: " + c1.Circumference());
        System.out.println("Area of the circle: " + c1.Area());
    }
}
