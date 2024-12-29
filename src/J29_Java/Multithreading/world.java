package J29_Java.Multithreading;

//public class world extends Thread{
public class world implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            System.out.println("world");
        }
    }
}
