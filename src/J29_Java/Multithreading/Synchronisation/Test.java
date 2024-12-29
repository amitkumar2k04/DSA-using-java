package J29_Java.Multithreading.Synchronisation;

public class Test {
    public static void main(String[] args) {
    Counter counter = new Counter();
    MyThread t1 = new MyThread(counter);
    MyThread t2 = new MyThread(counter);
    t1.start();
    t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(counter.getCount());
    }
}

// Note: Jab ek object multiple threads ke saath share hoti hai to ho sakta hai ki incorrect result aa jae, kyuki comman data share ho raha hai.
// wo jagah jaha shared resources access or modify kiya ja raha hai, usi part of prog ko bolte hai .. critical section ... jaha synchronised keyword laga hai
// jab hum synchronied use nahi kar rahe the use condition ko bolte hai -> raised condition. bcz jab multiple threads ek shared resources par kaam kar rahe ho, aur unki timing ulti-sidhi ho jae agar to result bhi ulti-sidhi aata hai. i.e is called raised cond.
// By using synchronized keyword we make sure jab ek bar ek thread run ho raha ho to to dusra wait karega
// hum kisi method ko bhi bana sakte hai synchronised ya kisi particular block ko bhi kar sakte hai