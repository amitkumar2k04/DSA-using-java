package J29_Java.Multithreading;

public class test {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        //System.out.println(Thread.currentThread().getName());
        world world = new world();  // New
        //world.start();   // Runnable
        Thread t1 = new Thread(world);
        t1.start();

        for(; ; ) {  // Running
            System.out.println("Hello");
        }
    }
}
