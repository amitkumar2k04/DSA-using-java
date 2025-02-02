package DS07_DSA.Queue;

// Note: hume khud ka queue bana rahe hai

public class array_Implementation_in_Queue {
    public static class queueArray{
        int front = -1;
        int rear = -1;

        int size = 0;
        int[] arr = new int[5];

        // addition function
        public void add(int val){
            if(rear == arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1) {   // queue is currently empty
                front = rear = 0;
                arr[0] = val;
            }
            else {
                arr[rear+1] = val;
                rear++;
            }
            size++;
        }
        // remove function
        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty");   // bez jab queue empty hai tab kuch bhi remove nahi hoga
                return -1;
            }
            int x = arr[front];
            front++;
            size--;
            return x;
        }
        // peek function  (to access elements from top)
        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[front];
        }
        // empty function
        public boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
        // display queue function
        public void disply(){
            if(size == 0){
                System.out.println("Queue is Empty");
            } else{
                for(int i = front; i<= rear; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueArray q = new queueArray();
        q.disply();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.disply();

//        q.remove();
//        q.disply();


        System.out.println(q.peek());
    }
}
