package J29_Java.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaxFreq {

    public static void main(String[] args) {
        int[] arr = {1,4,5,1,4,4,6,4,4,4,6,2,2};
        Map<Integer,Integer> freq = new HashMap<>();
        for(int el : arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }
        System.out.println("Frequency Map " + freq.entrySet());

        int maxFreq = 0, ansKey = 0;
        // Aab hume map traverse karna hai -> 2 ways either we can traverse 1. entrySet or 2.keySet
                // 1st way of traversing by using entrySet
        for(var e : freq.entrySet()){
            if(e.getValue() > maxFreq){
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
                // 2nd way of traversing by using keySet
//        for (var key : freq.keySet()){
//            if(freq.get(key) > maxFreq){
//                maxFreq = freq.get(key);
//                ansKey = key;
//            }
//        }
        System.out.printf("%d has max frequency and it occurs %d times",ansKey,maxFreq);
    }
}
