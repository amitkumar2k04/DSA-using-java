package DS07_DSA.Recursion_Basics;

public class print_String_In_reverse_order {
    public static void printRev(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        printRev(str, idx -1);
        System.out.print(str.charAt(idx));

    }
    public static void main(String[] args) {
        String str = "abcd";
        printRev(str, str.length()-1);
    }
}
