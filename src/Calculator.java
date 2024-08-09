public class Calculator {
    public static void main(String[] args) {
        double x = 15.5;
        int y = 5;
        double sum = x + (double) y;
        double diff = x - (double) y;
        double prod = x * (double) y;
        double quot = x / (double) y;
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The difference of the numbers is: " + diff);
        System.out.println("The product of the numbers is: " + prod);
        System.out.println("The quotient of the numbers is: " + quot);
    }
}
