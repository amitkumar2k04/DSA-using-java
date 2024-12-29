package J29_Java.OOP.Inheritance;
//Inheritance example: Initialize through constructor
//In this we see that: Initialization of the subclass object by the constructors that are there in the superclass
class Box{
    double width;
    double height;
    double depth;

    Box(){
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width*height*depth;
    }
}
// here, Box is extended to include weight.
class BoxWeight extends Box{
    double weight;   // weight of the box

    // constructor of BoxWeight
    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class Ex3 {
    public static void main(String[] args) {
    Box mybox1 = new Box();
    BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);

    double vol;
    vol = mybox1.volume();
    System.out.println("Volume of myBox1 is: " +vol);
    System.out.println();

    vol = mybox2.volume();
    System.out.println("Volume of myBox1 is: " +vol);
    System.out.println("Volume of myBox2 is: " +mybox2.weight);

    }
}
