package DS07_DSA.LInkedList.practice;

public class len_of_LL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static int len (Node a){
        int count = 0;
        while (a != null){
            count++;
            a = a.next;
        }
        return count;

    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(18);
        Node c = new Node(7);
        Node d = new Node(17);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("The size of the LL is : " + len(a));
    }
}
