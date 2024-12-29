package J29_Java.OOP;

class cellphone{

    public void ring(){
        System.out.println("Ringing ...");
    }

    public void vibrate(){
        System.out.println("Vibrating ...");
    }

    public void callFriend(){
        System.out.println("Calling Mukul ...");
    }
}


public class Practice_prob_02 {
    public static void main(String[] args) {

        cellphone asus = new cellphone();
        asus.callFriend();
        asus.vibrate();
        asus.vibrate();

    }
}
