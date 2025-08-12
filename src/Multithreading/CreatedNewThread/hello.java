package Multithreading.CreatedNewThread;

public class hello {
    public static void main(String[] args) {
        //way1 - creating object of World class
//        World world = new World();
//        world.start();
        // way2 - By implementing Runnable Interface
        World world = new World();
        Thread t1 = new Thread(world);
        t1.start();
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
