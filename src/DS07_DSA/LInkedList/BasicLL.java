package DS07_DSA.LInkedList;

public class BasicLL {
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void disp_Recursively(Node head){
        // Base case
        if(head == null) return;
        // self work
        System.out.print(head.data + " ");
        // recursively
        disp_Recursively(head.next);
    }
    public static int length(Node a) {
        int count = 0;
        while (a != null){
            count++;
            a = a.next;
        }
        return count;
    }
    public static void inserAtEnd(Node head, int val){
        Node temp = new Node(val);
        Node t = head;
        while (t.next!= null){
            t = t.next;
        }
        t.next = temp;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        /*
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(c.data);
        System.out.println(b.next.next.data);
        System.out.println(a.next.next.next.next.data);

        System.out.println(a.next);   // null
         */
        /*
        Node temp = a;
        while (temp!= null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
         */

        //display(a);
        //disp_Recursively(a);
        System.out.println(length(a));

        inserAtEnd(a, 87);
        display(a);

    }
}
