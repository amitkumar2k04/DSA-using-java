package DS07_DSA.LInkedList.DoublyLL;

public class insertionAtHead_Tail {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead_ (Node head, int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static Node insertAtEnd_(Node head, int x){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
        return  head;
    }
    public static Node insertAtAnyIndex(Node head, int idx, int x){
        Node temp = head;
        for(int i = 0; i<idx-1; i++){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next.prev = t;
        t.prev = temp;
        t.next = temp.next;
        temp.next = t;
        return head;
    }
    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        Node newHead = insertAtHead_(a, 35);
        display(newHead);
        Node newTail = insertAtEnd_(a, 89);
        display(newTail);
        Node newVal = insertAtAnyIndex(a, 3, 8507);
        display(newVal);

    }
}
