package J29_Java.OOP.Inheritance;
// Example of a superclass variable referring to a subclass Object.

class Box01{
    double width;
    double height;
    double depth;

    Box01(){ // default constructor
    }
    Box01(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width*height*depth;
    }
}

// here, Box is extended to include weight.
class BoxWeight01 extends Box{
    double weight;   // weight of the box

    // constructor of BoxWeight
    BoxWeight01(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class Ex5 {
    public static void main(String[] args) {
    BoxWeight01 weightBox = new BoxWeight01(3,5,7,8.37);
    Box01 plainBox = new Box01();

    double vol;
    vol = weightBox.volume();
    System.out.println("Volume of myBox1 is: " +vol);
    System.out.println();

    // assign BoxWeight reference to Box reference
        //plainBox = weightBox;   // Here, we're referencing a subclass with the help of superclass. [plainBox is a superclass obj and weightBox is a subclass object]
        vol = plainBox.volume();
        System.out.println("Volume of the box is: "  + vol);

    }
}
