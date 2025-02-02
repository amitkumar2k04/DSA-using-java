package DS07_DSA.Queue;

public class LL_implementation_in_Queue {
    public static class Node{    // user defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class queue_LL{
        Node head = null;
        Node tail = null;

        int size = 0;
        // add function
        public void add(int num){
            Node temp = new Node(num);
            if(size == 0){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }
        // remove function
        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x = head.val;  // val stored in x;
            head = head.next;
            size--;
            return x;
        }
        // display function
        public void display(){
            if(size == 0){
                System.out.print("queue is empty");
                return;
            }
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        queue_LL q1 = new queue_LL();
        //q1.display();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();

        System.out.println(q1.peek());

        q1.remove();
        q1.display();
    }
}
