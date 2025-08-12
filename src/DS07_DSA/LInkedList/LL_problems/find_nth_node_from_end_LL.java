package DS07_DSA.LInkedList.LL_problems;

import javax.crypto.NoSuchPaddingException;

public class find_nth_node_from_end_LL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node nthNode(Node head, int n){
        // step 1 : finding size
        int size = 0;
        Node temp = head;
        while (temp != null){
            size++;
            temp = temp.next;
        }

        int m = size - n + 1;
        // Now, we have to find mth Node from start
        temp = head;
        for(int i = 1; i<= m - 1; i++){
            temp = temp.next;
        }
        return temp;
    }

    // -----------------------------------------------------
    // 2nd way : In one pass by slow and fast pointer
    public static Node nthfrom_End2(Node head, int x){
        Node slow = head;
        Node fast = head;

        for(int i = 1; i<= x; i++){
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    // ____________________________________________
    // Delete nth from end
    public static Node delete_nth_from_end(Node head, int n){
        Node slow = head;
        Node fast = head;

        for (int i=1; i<=n; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
    }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
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

        // 100 13 4 5 12 10
//        Node q = nthfrom_End2(a, 2); // want to find 3rd node from last
//        System.out.println(q.data);

        display(a);
        a = delete_nth_from_end(a, 4);
        display(a);
    }
}
