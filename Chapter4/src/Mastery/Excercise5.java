package Mastery;

import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        // Ask the user for their percentage
        System.out.print("Enter your percentage: ");
        int percentage = userinput.nextInt();

        // Determine the letter grade
        if (percentage >= 90) {
            System.out.println("The corresponding letter grade is: A");
        } else if (percentage >= 80) {
            System.out.println("The corresponding letter grade is: B");
        } else if (percentage >= 70) {
            System.out.println("The corresponding letter grade is: C");
        } else if (percentage >= 60) {
            System.out.println("The corresponding letter grade is: D");
        } else {
            System.out.println("The corresponding letter grade is: F");
        }
    }
}