package J29_Java.OOP;
/*     CONSTRUCTOR OVERLOADING
Note: We already see that how we can initialized the obj at the time of obj creation i.e. constructor///
      -> Now, constructor has its more dimensions it also gives lots of flexibility to a programmer to initialized n obj in a different way so,
         this concept is known as constructor overloading. In the prev ex we see that how automatic initialization by means of constructor with 3 parameters.


Now, here we see another way of initializing

 */

class Circle04{
    double x, y;
    double r;

    // creating 3 constructors that takes diff-diff parameters
    Circle04(double a, double b, double c){
        x=a; y=b; r=c;
    }
    Circle04(double c){
        x=0; y=0; r=c;
    }
    Circle04(){
        x=0.0; y=0.0; r=1.0;
    }

    // Creating methods
    double Circumference() {
        return 2 * Math.PI * r;
    }

    double Area() {
        return Math.PI * r * r;
    }
}
public class Initialization_of_obj_04 {
    public static void main(String[] args) {
    Circle04 c1 = new Circle04(3.0, 4.0, 5.0);  // c1 obj is created with the 1st constructor
    Circle04 c2 = new Circle04(5.0);                  // c2 obj is created with the 2nd constructor
    Circle04 c3 = new Circle04();                        // c3 obj is created with the 3rd constructor


    System.out.println("Circumference Circle 1: " + c1.Circumference());
    System.out.println("Area Circle 1: " + c1.Area());
    System.out.println("Circumference Circle 2: " + c2.Circumference());
    System.out.println("Area Circle 2: " + c2.Area());
    System.out.println("Circumference Circle 3: " + c3.Circumference());
    System.out.println("Area Circle 3: " + c3.Area());
    }
}
