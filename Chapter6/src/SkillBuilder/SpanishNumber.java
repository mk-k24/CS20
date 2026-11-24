package SkillBuilder;
import java.util.Scanner;

public class SpanishNumber {

    // Display the Spanish word for the number entered
    public static void displaySpanish(int number) {
        switch (number) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            default:
                System.out.println("Please enter a number from 1 to 10.");
        }
    }

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        // Ask the user for 10 numbers
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter a number from 1 to 10: ");
            int number = userinput.nextInt();

            displaySpanish(number);
        }

        userinput.close();
    }
}