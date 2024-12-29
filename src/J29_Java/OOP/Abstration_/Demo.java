package J29_Java.OOP.Abstration_;

abstract class car{
    abstract public void fueltype();
    public void color(){
        System.out.println("Black color");
    }
}
class tata extends car{
    public void fueltype(){
        System.out.println("Diesel");
    }
}

public class Demo {
    public static void main(String[] args) {
    tata obj = new tata();
    obj.fueltype();
    obj.color();
    }
}

// Abstration ke help se yaha -- user ko kewal fueltype() dekhai dega ..
// fueltype() fun ke andar implementation/print_stat .. etc - wo kaha se aa raha hai
// to ye chiz hume Abstraction provide krata hai .. user ko nahi pta hai fueltype() fun ki implementation aa kaha se rahi hai .. But user fun ko access kar to pa raha hai..
// So, Due to this security will be enhanced.

// Note: Static methods can never be abstracted.
// Note: Abstract class ka object nahi bana sakte