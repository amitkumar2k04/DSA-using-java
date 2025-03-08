package J29_Java.OOP;
// Write a program to calculate the circumference and area of the circle
class Circle {
    double x, y;
    double r;

    double Circumference() {
        return 2 * Math.PI * r;
    }
    double Area() {
        return Math.PI * r * r;
    }

//    // Created function with parameters -> This function we need to call it explictly
//    void setCircle(double a, double b, double c) {
//        x = a;
//        y = b;
//        r = c;
//    }

    // This is the constructor -> this is very similar to the setCircle -> But here we don't need to call it explictly
    Circle(double a, double b, double c) {
        this.x = a;  // x-coordinate
        this.y = b;
        this.r = c;
    }
}

    // Created an another class i.e (Box)
    class Box {
        double width;
        double height;
        double depth;

        double area() {
            double a;
            a = (width * height + height * depth + width * depth) * 2;
            return a;
        }

        double volume() {
            double v;
            v = width * height * depth;
            return v;
        }
    }

    public class Constructor {
        public static void main(String[] args) {
            // that means, the circle object is created, we pass the values, the constructor will take this value and pass it to the c1 objects and then c1 will be initialized.
            Circle C1 = new Circle(3.0, 4.0, 5.0); // While using objects we can call it while obj creation with the parameters
            Box b = new Box();

            // Initialization of the Box
            b.width = 3.0; b.height = 4.0; b.depth = 5.0;


            // Initialize the circle => This initialization are done in more pragmatic way by using constructors
            //        C1.setCircle(3.0, 4.0, 5.0);
            //        C2.setCircle(-4.0, 8.0, 10.0);


            System.out.println("Circumference of the circle: " + C1.Circumference());
            System.out.println("Area of the circle: " + C1.Area());

            System.out.println("Area of the Box: " + b.area());
            System.out.println("Volume of the Box: " + b.volume());
        }
    }

