package DS07_DSA.LInkedList;

public class dispLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
//    public static void dispRecursive(Node head){
//        if(head == null) return;  // base case
//        System.out.print(head.data + " "); // self work
//        dispRecursive(head.next); // recursive work
//    }
    public static int size(Node a){
        int count = 0;
        while (a != null){
            count++;
            a = a.next;
        }
        return count;
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(3);

        a.next = b;
        b.next = c;
        c.next = d;

        //display(a);
        //dispRecursive(a);
        //System.out.println();
        //System.out.print("size: "+ size(a));


        ll.insertAtEnd(12);
        ll.display();
        ll.insertAtEnd(24);
        ll.display();
        ll.insertAtEnd(35);
        ll.display();
    }
}
