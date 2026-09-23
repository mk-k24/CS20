package Mastery;

import java.util.Scanner;

public class Excercise5 {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner userinput = new Scanner(System.in);

        // Ask the user for an amount of change
        System.out.print("Enter an amount of change in cents: ");
        int change = userinput.nextInt();

        // Find the number of quarters
        int quarters = change / 25;
        change = change % 25;

        // Find the number of dimes
        int dimes = change / 10;
        change = change % 10;

        // Find the number of nickels
        int nickels = change / 5;
        change = change % 5;

        // Find the number of pennies
        int pennies = change;

        // Display the minimum number of coins
        System.out.println("The minimim number of coins is:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}