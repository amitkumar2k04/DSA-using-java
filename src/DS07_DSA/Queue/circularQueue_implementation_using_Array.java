package DS07_DSA.Queue;

public class circularQueue_implementation_using_Array {
    public static class circularQueue_U_A{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) throws Exception{
            if(size == arr.length){  // cond for queue is full
                throw new Exception("Queue is full");
            }
            else if (size == 0){   // cond for queue empty
                front = rear = 0;
                arr[0] = val;
            }
            else if (rear < arr.length-1) { // Normal case // jab rear 0 se n-1 ke beech me ho
                arr[++rear] = val;
            }
            else if (rear == arr.length-1) {  // jab rear = n-1 ho jae elements piche se dalege
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty");
            }
//            else if (front == arr.length-1) {  // When front -> arrives at end
//                int val = arr[front];
//                front = 0;
//                return val;
//            }
//            else{    // when front does not -> arrives at end
//                int val = arr[front];
//                front++;
//                size--;
//                return val;
//            }
            else {
                int val = arr[front];
                if(front == arr.length-1) front = 0;
                else front++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty");
            }
            else return arr[rear];
        }

        public boolean isEmpty(){
            if (size == 0) return true;
            else return false;
        }
        
        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
                return;
            }
            else if (front <= rear){
                for(int i = front; i<= rear; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else {  // rear < front
                for (int i = front; i<arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i<=rear; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        circularQueue_U_A q = new circularQueue_U_A();
        q.display();  // Queue is empty

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();  // 1 2 3 4

        q.remove();  // 2 3 4
        q.display();

        q.add(5); // 2 3 4 5
        q.display();

        q.add(6);   //Array me aaisa ban raha hai - 6 2 3 4 5  -> but print aaisa hoga 2 3 4 5 6
        q.display();

        // q.add(7);  // because queue is full -> it gives exception - queue is full

        // printing array
        for(int i = 0; i<q.arr.length; i++){
            System.out.print(q.arr[i] + " ");   // 6 2 3 4 5
        }

    }
}
