package week2;

import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Your height in m: ");
        double height = keyboard.nextDouble();
        System.out.print("Your weight in kg: ");
        int weight = keyboard.nextInt();

        double BMI = weight / (height * height);
        System.out.print("Your BMI is " + BMI);

        }
}
