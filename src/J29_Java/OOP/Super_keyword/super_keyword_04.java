package J29_Java.OOP.Super_keyword;

class Points2D{
    double x, y;

    // Default constructor initialization
    Points2D() {
        x = 0.0;
        y = 0.0;
    }

    // Parameterized constructor
    Points2D(double x, double y){
        this.x = x;
        this.y = y;
    }
}


class Points3D extends Points2D{
    double z;

    // default constructor initialization
    Points3D(){
        super();
        z = 0.0;
    }

    // Parameterized constructor for 3D points
    Points3D(double x, double y, double z){
        super(x, y);  // Call parent class constructor
        this.z = z;
    }
}

public class super_keyword_04 {
    public static void main(String[] args) {
        Points3D obj =  new Points3D(2.0, 3.0,4.0);


    }
}
