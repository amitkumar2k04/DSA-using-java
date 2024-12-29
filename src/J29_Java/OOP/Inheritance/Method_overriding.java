package J29_Java.OOP.Inheritance;

class Bank{
    public void RateOfInterest(){
        System.out.println("General rate if interest is 5%");
    }
}
class SBI extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("Rate of interest for SBI is 6.5%");
    }
}
class PNB extends Bank{
    @Override
    public void RateOfInterest(){
        System.out.println("Rate of interest for PNB is 5.7%");
    }
}

public class Method_overriding {
    public static void main(String[] args) {
//        SBI obj = new SBI();
//        obj.RateOfInterest();

//        PNB obj2 = new PNB();
//        obj2.RateOfInterest();

        Bank obj3 = new Bank();
        obj3.RateOfInterest();
    }
}
