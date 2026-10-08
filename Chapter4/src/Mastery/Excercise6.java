package Mastery;

import java.util.Scanner;

public class Excercise6 {
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        // Generate two random numbers from 1 to 10
        int number1 = (int)(Math.random() * 10) + 1;
        int number2 = (int)(Math.random() * 10) + 1;

        // Generate a random operator
        int operator = (int)(Math.random() * 4);

        int answer;
        String symbol;

        // Choose the math operation
        switch (operator) {
            case 0:
                symbol = "+";
                answer = number1 + number2;
                break;

            case 1:
                symbol = "-";
                answer = number1 - number2;
                break;

            case 2:
                symbol = "*";
                answer = number1 * number2;
                break;

            default:
                symbol = "/";
                answer = number1 / number2;
                break;
        }

        // Display the question
        System.out.print("What is " + number1 + " " + symbol + " " + number2 + "? ");
        int userAnswer = userinput.nextInt();

        // Check the answer
        if (userAnswer == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + answer + ".");
        }
    }
}