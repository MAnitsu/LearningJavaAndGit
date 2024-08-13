package week2;

import java.util.Scanner;

public class positiveCheck {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double number;

        System.out.print("Insert a number and the program will tell you if it is positive, negative, or zero: ");
        number = keyboard.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
