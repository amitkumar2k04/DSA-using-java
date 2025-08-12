package DS07_DSA.LInkedList.practice;

public class insertAtEnd {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class Linked_List{
        Node head = null;
        Node tail = null;

        // INSERT_AT_END
        void insertAtEnd (int val){
            Node temp = new Node(val);
                // case1 : For empty case
            if(head == null){
                head = temp;
                tail = temp;
            }
            else {
                // case2: For already existing LL
                tail.next = temp;
                tail = temp;
            }
        }

        // INSERT_AT_INDEX
        void insertAtIndex(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            for(int i = 0; i < idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        // INSERT_AT_END -> When only head is given
        void insertAtEnd(Node head, int val){
            Node temp = new Node(val);
            Node t = head;
            while (t.next != null){
                t = t.next;
            }
            t.next = temp;
        }

        // DELETE_AT_INDEX
        void delete_at_index(int idx){
            Node temp = head;
            for(int i = 0; i<idx -1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        // DISPLAY
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        // SIZE
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
    Linked_List ll = new Linked_List();
    ll.insertAtEnd(2);
    ll.insertAtEnd(5);
    ll.insertAtEnd(20);
    ll.insertAtIndex(2, 99);
    ll.delete_at_index(2);

    ll.display();

//    System.out.println();
//    System.out.println("The size of the LL are : "+ ll.size());

    }
}
