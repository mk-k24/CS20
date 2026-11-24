
package Mastery;
import java.util.Scanner;

public class Excercise5 {

    public static String getDollarAmount(int quarters, int dimes,
                                         int nickels, int pennies) {
        double total = quarters * 0.25
                     + dimes * 0.10
                     + nickels * 0.05
                     + pennies * 0.01;

        return String.format("$%.2f", total);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount of coins:");

        System.out.print("Quarters: ");
        int quarters = input.nextInt();

        System.out.print("Dimes: ");
        int dimes = input.nextInt();

        System.out.print("Nickels: ");
        int nickels = input.nextInt();

        System.out.print("Pennies: ");
        int pennies = input.nextInt();

        System.out.println();
        System.out.println("Total: " +
            getDollarAmount(quarters, dimes, nickels, pennies));

        input.close();
    }
}
