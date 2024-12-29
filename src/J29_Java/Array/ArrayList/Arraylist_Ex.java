package J29_Java.Array.ArrayList;

import java.util.ArrayList;

public class Arraylist_Ex {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        // methods

        // adding new element
        l1.add(5);  //5
        l1.add(6);  //5, 6
        l1.add(7);  //5, 6, 7
        l1.add(8);  //5, 6, 7, 8

        // get an element at index i
        System.out.println(l1.get(1));   //6

//        // printing with loop
//        for(int i = 0; i < l1.size(); i++){
//            System.out.println(l1.get(i));     // 5,6,7,8
//        }

        // printing the arraylist directly
        System.out.println(l1);   // [5,6,7,8]

        // adding element at some particular index i  // [5,100,6,7,8]
        // Note: agar aap .add method me do value pass karte ho to that means 1st val is Index, and 2nd val is element
        l1.add(1, 100);
        System.out.println(l1);

        // modifying element at index i
        l1.set(1, 10);
        System.out.println(l1);  // [5, 10, 6, 7, 8]

        // removing an element at index i
        l1.remove(1);
        System.out.println(l1); // [5, 6, 7, 8]

        //removing an element e, if we don't know the particular index
        l1.remove(Integer.valueOf(7));   // pass directly val not index
        System.out.println(l1);  //[5,6,8]

        // checking if an element exists in the ArrayList
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        // if you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("pqres");
        l.add(1);
        l.add(true);
        System.out.println(l);
    }
}
