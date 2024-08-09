import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        String operation;

        System.out.print( "Insert first number: " );
        firstNumber = keyboard.nextDouble();
        System.out.print( "Insert second number: " );
        secondNumber = keyboard.nextDouble();
        System.out.print( "What operation do you want? (sum, difference, product, quotation) " );
        operation = keyboard.next().toLowerCase();

        if (operation.equals("sum")) {
            double sum = firstNumber + secondNumber;
            System.out.println("The sum of the numbers is: " + sum);
        } else if (operation.equals("difference")) {
            double diff = firstNumber - secondNumber;
            System.out.println("The difference of the numbers is: " + diff);
        } else if (operation.equals("product")) {
            double prod = firstNumber * secondNumber;
            System.out.println("The product of the numbers is: " + prod);
        } else if (operation.equals("quotation")) {
            double quot = firstNumber / (double) secondNumber;
            System.out.println("The quotient of the numbers is: " + quot);
        } else {
            System.out.println("Invalid choice");
        }


    }
}
