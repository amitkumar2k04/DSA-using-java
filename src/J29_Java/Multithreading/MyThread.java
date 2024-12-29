package J29_Java.Multithreading;
// Thread Lifecycle
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is Running ...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
    MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join(); // main method wait for t1 to get finished
        System.out.println(t1.getState());
    }
}

