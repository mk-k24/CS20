
package Mastery;

import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner userinput = new Scanner(System.in);

        // Ask the user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int number = userinput.nextInt();

        // Find the place value of the first digit
        int divisor = 1;
        while (number / divisor >= 10) {
            divisor *= 10;
        }

        // Display each digit from left to right
        while (divisor > 0) {
            int digit = number / divisor;
            System.out.println(digit);
            number %= divisor;
            divisor /= 10;
        }

        userinput.close();
    }
}
