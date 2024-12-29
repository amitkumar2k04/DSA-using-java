package J29_Java;

import java.util.HashMap;

public class Hashmap01 {
    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
//        // Use of methods
//        map.put("Amit", 5);
//        map.put("Ankit", 8);
//        map.put("Raj", 8);
//        map.put("akash", 4);
//        map.put("Amit", 6);
//        System.out.println(map.get("akash"));
//        map.remove("Raj");
//        System.out.println(map);
//        System.out.println(map.containsKey("Amit"));
//        System.out.println(map.containsValue(6));
//        System.out.println(map.size());



        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1,2,3,1,1,4,4,2,2};
        for (int i = 0; i<arr.length; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);

    }
}
