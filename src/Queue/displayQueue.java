package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // rear -> 5 4 3 2 1 -> front

        Queue<Integer> helper = new ArrayDeque<>();
        while (q.size() > 0){
            System.out.print(q.peek() + " ");  // step1: print the queue elements -> After printing hume elements ko nikal kar dusre queue me dalna hai
            helper.add(q.poll());          // step2: elements stored in helper queue
            /*  Note: we can also do this, instead of above
            int x = q.poll();
            helper.add(x);
             */
        }
        //step3 : wapaas helper se elements utha kar ush queue me daal do
        while (q.size() > 0){
            q.add(helper.poll());
        }

    }
}
