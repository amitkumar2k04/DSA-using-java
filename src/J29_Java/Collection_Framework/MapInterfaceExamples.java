package J29_Java.Collection_Framework;

import java.util.*;

public class MapInterfaceExamples {

    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();
        //LinkedHashMap<Integer, String> mp = new LinkedHashMap<>();
        //TreeMap<Integer, String> mp = new TreeMap<>();

        mp.put(3, "Aman");
        mp.put(2, "Rohan");
        mp.put(1, "Riya");

        mp.put(1, "Priya"); // overridden with the new value
        // If we don't want Overriding then function used putIfAbsent()
        mp.putIfAbsent(1, "Priya"); // if key not avl then it accepts otherwise not.

        //System.out.println(mp.entrySet());  // to get whole key and value
        //System.out.println(mp.keySet());  // ise hume kewal keys mil jaegi
        //System.out.println(mp.values());  // isse hume kewal values mil jaegi

        // Iterating over keys on a map
        for(Integer i : mp.keySet()){
            System.out.println(i);
        }
        // Iterating over values on a map
        for(String i : mp.values()){
            System.out.println(i);
        }
        // Iterating over key-values mapping
        for(var e: mp.entrySet()){
            System.out.println(e);
            //System.out.println(e.getKey());
            //System.out.println(e.getValue());
        }


        System.out.println(mp);
        System.out.println(mp.get(2)); // key ke corresponding vales milega .. o/p Rohan
        System.out.println(mp.containsKey(4));  // It return boolean ki 4 exist or not .. o/p false
        System.out.println(mp.containsValue("Riya")); // check values exist or not .. o/p True
    }
}
