package SkillBuilder;

import java.util.Scanner;

public class PerfectSqaure {
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        // Ask the user for an integer
        System.out.print("Enter an integer: ");
        int number = userinput.nextInt();

        // Find the square root and truncate the decimal
        int root = (int) Math.sqrt(number);

        // Square the truncated square root
        int square = root * root;

        // Determine if the number is a perfect square
        if (square == number) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}