package J29_Java;

public class CWH_08_if_else {
    public static void main(String[] args) {
//    int a = 0x100; // Hexadecimal
//        System.out.println(a);

        // Ques 18:
//        int a = 47, b = 21, c = 96;
//        int great = a;
//        if(b > great){
//            great = b;
//        }
//        if(c > great) {
//            great = c;
//        }
//        System.out.println(great);

        // Ques 19:
        // solved by using nested conditions
//        int year = 2021;
//        if(year % 100 == 0) {
//            // century
//            if(year % 400 == 0)
//                System.out.println("Leap");
//        } else {
//            // not century
//            if(year % 4 == 0)
//            System.out.println("Leap");
//            else{
//                System.out.println("Not leap");
//            }
//        }


        // Ques 20:
        // Range creation
        double amt = 11000;

        if(amt >= 1 && amt <= 5000){
            System.out.println("Final amt = " + amt);
        } else if(amt > 5000 && amt <= 7000){
            System.out.println(amt * 0.9);
        } else if( amt > 7000 && amt <= 10000){
            System.out.println(amt * 0.8);
        } else if( amt > 10000){
            System.out.println(amt * 0.7);
        }


        // Ques 21:
        // Electricity bill are divided into multiple bands.
        // H.W


        // Ques 22:
        // H.w
        //char = 'a';
        // for more clarification about the problems check group on 10-08
    }
}
