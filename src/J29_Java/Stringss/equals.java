package J29_Java.Stringss;

public class equals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2);   //--> Return True   bcz due to interning s1 & s2 pointing to the same string
        System.out.println(s1 == s3);   //--> Return False  bcz here we avoid interning s3 occupy separate memory
        // (==) equals operator values as well as address that's why we should avoid to use this operator in case of string instead of this operator use .equals()
        System.out.println(s1.equals(s3)); // -> Returns True
    }
}
