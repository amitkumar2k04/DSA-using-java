package J29_Java.Array.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class problems {
    static void reverseList(ArrayList<Integer> list){
    int i = 0, j = list.size() - 1;
    while (i<j){
        /*  // swap cond
        int temp = a;
        a = b;
        b = temp;
         */
//        Integer temp = Integer.valueOf(list.get(i));
//        list.set(i, list.get(j));
//        list.set(j, temp);
//        i++;
//        j--;
    }
    }
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(10);
    list.add(3);
    list.add(5);
    list.add(22);
    list.add(10);
    System.out.println("Original List " + list);
    //reverseList(list);
        Collections.reverse(list);   // this is the 2nd method
        System.out.println("Reversal List " + list);


        // prob2: sorting by using inbuilt methods inside collections class
        Collections.sort(list);
        System.out.println("Ascending order: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Desc order: " + list);


        // creating list of string jise hume sort karne hai
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Arrah");
        l1.add("Zila");
        System.out.println("Original list: " + l1);
        Collections.sort(l1);
        System.out.println("Sorted: " + l1);

        // sorting in descending order by passing as a comparitor
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Desc order sorted: " + l1);

    }
}
