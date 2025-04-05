package J29_Java.Stringss;

public class printAllSubstrings {
    public static void main(String[] args) {
        /* Ques:
        Input: s = "abcd"
        Output: a ab abc abcd b bc bcd c cd d    -- Print all its substrings
         */

        String str = "abcd";   // 0 to 3
        for(int i = 0; i<=3; i++){
            for(int j = i+1; j<=4; j++){
                System.out.print(str.substring(i,j) + " ");
            }
        }
    }
}
