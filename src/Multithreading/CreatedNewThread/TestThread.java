package Multithreading.CreatedNewThread;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread starts");
        try {
            for(int i = 1; i<=10; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("MyThread Ends");
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Starts");
        MyThread m1 = new MyThread();
        m1.start(); // start() method helps to move MyThread from new to runnable
        System.out.println(m1.isAlive());
        m1.join();  // Explicit join mode  ... Note: join() mode :  means jab tak sari thread khatam nahi hoga, main thread wapas nahi aaega!! =>  In another terms : Main method is waiting to m1 to get finish
        System.out.println(m1.isAlive()); // ish method se hum aapne thread ka live status dekh sakte hai
        System.out.println("Main Thread Ends");
    }
}
