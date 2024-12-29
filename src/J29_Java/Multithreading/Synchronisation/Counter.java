package J29_Java.Multithreading.Synchronisation;

public class Counter {
    private int count = 0;

    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }

}
