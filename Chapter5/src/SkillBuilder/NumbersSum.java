
package SkillBuilder;

import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner userinput = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = userinput.nextInt();

        // Initialize the sum
        int sum = 0;

        // Display numbers and calculate their sum
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            sum += i;
        }

        // Display the total sum
        System.out.println("Sum: " + sum);

        userinput.close();
    }
}

