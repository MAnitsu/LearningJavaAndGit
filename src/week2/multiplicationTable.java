package week2;

public class multiplicationTable {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println();
            for (int j = 0; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
