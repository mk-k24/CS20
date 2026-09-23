package Mastery;

import java.util.Scanner;

public class Excercise6 {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner userinput = new Scanner(System.in);

        // Get the three-digit number
        System.out.print("Enter a three-digit number: ");

        int number = userinput.nextInt();

        // Find the hundreds, tens, and ones digits
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        // Display the digits
        System.out.println("The hundreds place digit is: " + hundreds);
        System.out.println("The tens place digit is: " + tens);
        System.out.println("The ones place digit is: " + ones);

    }
}