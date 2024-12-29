package J29_Java;

import java.io.IOException;

public class Wrapper_class {
    public static void main(String[] args) throws IOException {

        Integer i = Integer.valueOf(4);
        System.out.println(i);


//        int num = 7;
////        Integer num1 = new Integer(num); // we're taking a primitive value and storing in the Wrapper obj - this concept is called Boxing.
//        Integer num1 = num;              // here, Boxing happens automatically  - num is a primitive variable and num2 is a reference variable so, it's an object -> so, here conversion happening automatically so, that's why we called it as autoboxing.
//
//        // How to assign the value to again -> Primitive type
//        int num2 = num1.intValue();  // unboxing -> bcz we're getting a value from obj type to primitive type
//
//        System.out.println(num2);
//
//
//
//        String str = "12";
//        //System.out.println(str*2); // It won't work bez str is a string, you can't perform any operation
//
//        int num3 = Integer.parseInt(str);
//        System.out.println(num3*2);






//        int a = Integer.parseInt("123");
//        int b = Byte.parseByte("15");
//        System.out.println(a+1);
//        System.out.println(b);


                    //InputStreamReader API
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);   //Ye existing input methods ko tej kar deta hai
//        System.out.println("Enter a number");
//        int a = Integer.parseInt(br.readLine());
//        System.out.println("Enter Name");
//        String name = br.readLine();
//        System.out.println("Enter another number: ");
//        int b = Integer.parseInt(br.readLine());
//        System.out.println(a + b+ ", " + name);
    }
}
