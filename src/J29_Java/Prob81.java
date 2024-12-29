package J29_Java;

public class Prob81 {
    public static void main(String[] args) {
        String s = "orbhaikyahaalchal";

//        for(char i = 'a'; i<='z'; i++){
//            int c = 0;
//            for(int j = 0; j<s.length(); j++){
//                if(s.charAt(j) == i){
//                    c++;
//                }
//            }
//            if(c>0){
//                System.out.println(i+ " -> " +c);
//            }
//        }



        // 2nd approach
        int bit[] = new int[26];

        for(char ch : s.toCharArray())
            bit[ch-97] ++;

        for(int i = 0; i<bit.length; i++){
            if(bit[i] > 0){
                System.out.println((char) (i+97) + " -> " +bit[i]);
            }
        }
    }

}
