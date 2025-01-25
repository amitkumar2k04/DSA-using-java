package DS07_DSA.LInkedList.LL_problems;

public class delete_nth_node_from_end {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node Delete_nth_From_End(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i = 1; i<= n; i++){
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
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(13);
        Node b = new Node(1);
        Node c = new Node(100);
        Node d = new Node(50);
        Node e = new Node(20);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Originl List: ");
        display(a);

        System.out.println("After removal: ");
        a = Delete_nth_From_End(a, 5);
        display(a);
    }
}
