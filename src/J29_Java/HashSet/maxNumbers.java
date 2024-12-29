package J29_Java.HashSet;

import java.util.HashSet;

public class maxNumbers {
    static int maximumNumbersOnTable(int[] bag){
        HashSet<Integer> table = new HashSet<>();
        int maxNumbers = 0;
        for(int i = 0; i<bag.length; i++){
            int num = bag[i];
            if(table.contains(num)){
                table.remove(num);
            } else {
                table.add(num);
                maxNumbers = Math.max(maxNumbers, table.size());
            }
        }
        return maxNumbers;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,1,3,2,3};
        System.out.println(maximumNumbersOnTable(nums));
    }
}
