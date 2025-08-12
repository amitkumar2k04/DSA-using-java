package Multithreading.CreatedNewThread;

// Way-1 = By extending thread class
//public class World extends Thread {
// Way-2 = By implementing runnable interface
public class World implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i<1000; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

// By - Way 1 (steps to perform)
// Here a new thread created that extends the Thread class.
// A new class world is created that extends thread.
// The Run Method is overridden to define the code that constitutes the new thread.
// start() method is called to initiate the new thread.


// By - way 2 (steps to perform)
// A new class world is Created that implements Runnable.
// The run method is overridden to define the code that continues the new thread.
// A thread object is created by passing an instance of MyRunnable.
// start() method is called on the Thread object to initiate the new thread.
