package DS07_DSA.Stacks;

public class LL_implementation {
    public static class Node{     // user defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class LL_Stack{    // user defined data structure
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }


        void displayRec(Node h){
            if(h == null) return;
            displayRec(h.next);
            System.out.print(h.val + " ");
        }
        // we need to print ulta LL
        void display(){
            displayRec(head);
            System.out.println();
        }


        // Ye sidhi LL print kar raha hai
        void displayReverse(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        int pop(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int peek(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }

        boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
    }


    public static void main(String[] args) {
        LL_Stack st = new LL_Stack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();  // 4 5 1

        //System.out.println(st.size()); // 3
        //st.pop();
        //st.display();  // 4 5

        //System.out.println(st.size());  // 2
        //st.push(7);  // 4 5 7
        //st.push(0);  // 4 5 7 0

    }
}
