package J29_Java.Stringss;

public class str_Performance {
    public static void main(String[] args) {
        String str = "";
        for(int i = 1; i<=10; i++){
            str += i;
        }
        System.out.println(str);
        // Note: Isme prob hai .. Ye empty string me aaisa nahi hai ki one-by-one sare num add/update ho rahe hai.. Yaha har baar new string banegi
        // i.e   "" "1"  "12" "123" ... aaise new-new string har baar banti jaegi -> to yaha totol 55 operations performed ho rahe hai
        // Note: Ish performance ko hum improve kar sakte hai by using stringBuilders
    }
}
