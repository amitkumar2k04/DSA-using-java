package DS07_DSA.LInkedList.LL_problems;

import org.w3c.dom.Node;

public class Find_nthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    // here In this method we're traversing the complete node two times
    public static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        temp = head;
        int m = size - n + 1;  // mth node from start
        for(int i = 1; i<= m-1; i++){
            temp = temp.next;
        }
        return temp;
    }

    // here In this method we're traversing the complete node one times
    public static Node Find_nth_Node_In_One_traversal(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i = 1; i<=n; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // 100, 13, 4, 5, 12, 10
       // Node q = nthNode(a, 3);
        //System.out.println(q.data);

        Node r =  Find_nth_Node_In_One_traversal(a, 2);
        System.out.println(r.data);


    }
}
