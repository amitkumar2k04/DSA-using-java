package DS07_DSA.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class basicCF {


    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        //System.out.println(q.isEmpty()); // return boolean based on the queue empty or not
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);  // aise print karne pe extra space bhi lag raha hai, aur print ke baad queue se elements gayab ho jaege

        //System.out.println(q.size());

        //q.remove(); // remove from front
        //q.poll();   // remove from front
        //System.out.println(q);


        //System.out.println(q.element());  // access elements from front
        //System.out.println(q.peek());     // access elements from front


    }
}
