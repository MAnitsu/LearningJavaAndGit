package week2;

import java.util.Scanner;

public class forgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello! What is your name? ");
        String name = keyboard.nextLine();
        System.out.print("Hi, " + name + "! How old are you? ");
        int age = keyboard.nextInt();
        System.out.print("So you're " + age + ", eh? That's not old at all!\n How much do you make, " + name + "? ");
        double salary = keyboard.nextDouble();
        System.out.println(salary + "! I hope that's per hour and not per year! LOL");
    }
}
