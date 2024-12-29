package J29_Java;

// followed ques 22 (i.e same ques)

public class Prob75 {
    public static void main(String[] args) {
        String s = "hellobrohow";
        int c = 0, v = 0;
        for(char ch : s.toCharArray()){ // we are converting string to the character array
            switch(ch){
                case 'a','e','i','o', 'u' -> v++;
                default -> c++;
            }
        }
        System.out.println("Consonant = " + c + ", Vowels = " +v);

    }
}
