package J29_Java.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void HashmapMethods(){
        // Syntax
        Map<String,Integer> mp = new HashMap<>();
        // Adding elements
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);
        // Getting value of a key from the Hashmap
        System.out.println(mp.get("Yash"));  // 16
        System.out.println(mp.get("Rahul"));  // null
        // Changing/Updating value of a key in the Hashmap
        mp.put("Akash", 25); // Updating age to 21->25
        System.out.println(mp.get("Akash"));
        // Removing a pair from the Hashmap
        System.out.println(mp.remove("Akash"));  // 25
        System.out.println(mp.remove("Riya"));  //null
        // Checking if a key is in the Hashmap
        System.out.println(mp.containsKey("Akash"));  // false
        System.out.println(mp.containsKey("Yash"));  // true
        // Adding a new entry only if the new key doesn't exist already
                //1st way
        if(!mp.containsKey("Yash")) mp.put("Yash", 30);
                //2nd way by using method
        mp.putIfAbsent("Yash", 30); // It checks "Yash" already exist or not, if exist then not enter // not enter
        mp.putIfAbsent("Yashika", 30);  // will enter
        // Get all keys in the Hashmap
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        // Get all entries in the Hashmap
        System.out.println(mp.entrySet());
        // Traversing all entries of Hashmap
                //1st way -> all keys pe traverse kro by using keySet()
        for (String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
                //2nd way -> to traverse though the entries by using entrySet()
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();

                // after Java 10 -> No need to specify ki hum kis type ka data read kane wale hai .. Just use var keyword
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        HashmapMethods();
    }

}
