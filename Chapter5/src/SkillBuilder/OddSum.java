
package SkillBuilder;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner userinput = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = userinput.nextInt();

        // Initialize the sum
        int sum = 0;

        // Loop through the numbers and add odd numbers
        for (int i = 1; i <= number; i += 2) {
            sum += i;
        }

        // Display the sum
        System.out.println("Sum of odd numbers: " + sum);

        userinput.close();
    }
}
