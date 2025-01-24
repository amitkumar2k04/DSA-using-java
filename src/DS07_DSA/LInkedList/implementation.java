package DS07_DSA.LInkedList;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
        }
        void insertAtHead(int val) {
            Node temp = new Node(val);
                if(head == null){  //empty list
                    head = temp;
                    tail = temp;
                }
                else{
                    temp.next = head;
                    head = temp;
                }
        }

        void insertAtIndex(int ind, int val){
            Node t = new Node(val);
            Node temp = head;
             //handling jab hum insert size ke aage kare // then handling tail case
            if(ind == size()){
                insertAtEnd(val);
                return;
            } else if (ind == 0) {
                insertAtHead(val);
                return;
            } else if (ind < 0 || ind > size()) {
                System.out.println("wrong input");
                return;
            }
            for(int i = 1; i<=ind-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        int getAtIndex(int ind){
            Node temp = head;
            for(int i = 1; i<= ind; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAtIndex(int ind){
            if(ind == 0) head = head.next;
            Node temp = head;
            for(int i = 1; i < ind-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
        }

        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(4); // 4
        ll.display();
        ll.insertAtEnd(5);  //4 -> 5
        ll.display();
        ll.insertAtEnd(12); //4 -> 5 -> 12
        ll.display();

        ll.insertAtHead(13); // 13 -> 4 -> 5 -> 12
        ll.display();

        ll.insertAtIndex(2, 10);   // 13 -> 4 -> 10 -> 5 -> 12
        ll.display();
        ll.insertAtIndex(5, 93);
        ll.display();
        ll.insertAtIndex(0, 100);  // 100 13 4 10 5 12 93
        ll.display();
        System.out.println(ll.tail.data);

        ll.deleteAtIndex(0);
        ll.display();
        System.out.println(ll.tail.data);

        //System.out.print("The value of given index is: "+ ll.getAtIndex(3));
        //System.out.println(ll.size());
        //System.out.println(ll.tail.data);
    }
}
