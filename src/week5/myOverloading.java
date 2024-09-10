package week5;

import java.util.Random;

public class myOverloading {
    public static void main(String[] args) {
        int result1 = addNumbers(3, 2);
        double result2 = addNumbers(3.1, 2.7);
        int result3 = addNumbers(3, 2, 5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        addNumbers();
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static double addNumbers(double a, double b) {
        return a + b;
    }

    public static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public static void addNumbers() {
        Random r = new Random();
        System.out.println(r.nextInt(6) + r.nextInt(6));
    }

}
