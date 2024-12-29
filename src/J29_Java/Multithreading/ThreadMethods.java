package J29_Java.Multithreading;

public class ThreadMethods extends Thread{

    public ThreadMethods(String name){
        super(name);
    }

//    @Override
//    public void run() {
//        System.out.println("Thread is Running...");
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }


    // Interrupt method
//    @Override
//    public void run() {
//        try{
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            System.out.println("Thread interrupted: " + e);
//        }
//    }

    // Yield method
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {
    ThreadMethods l = new ThreadMethods("Low priority Thread");
    ThreadMethods m = new ThreadMethods("Medium priority Thread");
    ThreadMethods h = new ThreadMethods("High priority Thread");
    //t1.start();
    //t1.join();    // here main method waits to gets t1 to complete. then after that it allows to executes its below part of the code.
//    l.setPriority(Thread.MIN_PRIORITY);
//    m.setPriority(Thread.NORM_PRIORITY);
//    h.setPriority(Thread.MAX_PRIORITY);
//    l.start();
//    m.start();
//    h.start();

    ThreadMethods t1 = new ThreadMethods("t1");
    ThreadMethods t2 = new ThreadMethods("t2");
    //l.interrupt();   // jish method par hum isse call kar rahe hai usko hum bol rahe hai ki aap wahi ruk jao
    //.yield();  // a/c to this method at every iteration ye method dusre thread ko bhi chance deta hai execute hone ko
        t1.start();
        t2.start();
    }
}

// start, run, sleep, join, setPriority, interrupt, yield, setDaemon