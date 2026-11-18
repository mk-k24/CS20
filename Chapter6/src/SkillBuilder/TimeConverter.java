package SkillBuilder;
import java.util.Scanner;

public class TimeConverter {

    // Convert hours to minutes
    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    // Convert days to hours
    public static double daysToHours(double days) {
        return days * 24;
    }

    // Convert minutes to hours
    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    // Convert hours to days
    public static double hoursToDays(double hours) {
        return hours / 24;
    }

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Time Converter");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Days to Hours");
        System.out.println("3. Minutes to Hours");
        System.out.println("4. Hours to Days");

        System.out.print("Choose a conversion (1-4): ");
        int choice = userinput.nextInt();

        System.out.print("Enter the amount of time: ");
        double time = userinput.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + hoursToMinutes(time) + " minutes");
                break;

            case 2:
                System.out.println("Result: " + daysToHours(time) + " hours");
                break;

            case 3:
                System.out.println("Result: " + minutesToHours(time) + " hours");
                break;

            case 4:
                System.out.println("Result: " + hoursToDays(time) + " days");
                break;

            default:
                System.out.println("Invalid choice. Please choose 1-4.");
        }

        userinput.close();
    }
}