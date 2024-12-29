package J29_Java.OOP;

class Square{
    int side;

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

public class practice_prob_03 {
    public static void main(String[] args) {

        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.side);
        System.out.println(sq.perimeter());
    }
}
