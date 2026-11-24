package SkillBuilder;
import java.util.Scanner;

public class Exponentiation {

    // Return the first number raised to the power of the second
    public static double powerOf(double number, int exponent) {
        return Math.pow(number, exponent);
    }

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter the base number: ");
        double base = userinput.nextDouble();

        // Ask the user for the exponent
        System.out.print("Enter the exponent: ");
        int exponent = userinput.nextInt();

        // Display the result
        System.out.println(base + " to the power of " + exponent
                + " is " + powerOf(base, exponent));

        userinput.close();
    }
}