package J29_Java.OOP.Inheritance;
// In this ex we see that: How subclass object can be initialized with the help of superclass constructor.
//Inheritance example: Initialize through constructor
//In this we see that: Initialization of the subclass object by the constructors that are there in the superclass
// Note : Same ex as ex3 here diff is that we're initialised with the help of super keyword
class Box_{
    double width;
    double height;
    double depth;

    Box_(){
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }
    Box_(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width*height*depth;
    }
}
// here, Box is extended to include weight.
class BoxWeight_ extends Box_{
    double weight;   // weight of the box

    // constructor of BoxWeight
    BoxWeight_(){
        super(); // call the overloaded constructor in the subclass
        weight = 0.0;
    }
    BoxWeight_(double w, double h, double d, double m){
        super(w, h, d); // call the overloaded constructor in the subclass
        weight = m;
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Box_ mybox1 = new Box_(10, 20 , 15);
        BoxWeight_ mybox2 = new BoxWeight_(2, 3, 4, 0.076);

        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of myBox1 is: " +vol);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of myBox1 is: " +vol);
        System.out.println("Volume of myBox2 is: " +mybox2.weight);

    }
}

