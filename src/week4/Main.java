package week4;

public class Main {
    public static void main(String[] args) {
        Mouse1 m1 = new Mouse1();

        m1.leftClick();
        m1.rightClick();
        m1.setColor("black");
        System.out.println(m1.getColor());

        Mouse m = new Mouse();
        m.leftClick();
    }
}