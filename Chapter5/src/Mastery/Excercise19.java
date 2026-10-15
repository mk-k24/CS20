
package Mastery;

import java.util.Scanner;

public class Excercise19 {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner userinput = new Scanner(System.in);

        // Ask the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = userinput.nextLine();

        // Ask the user for the string to remove
        System.out.print("Enter the string to remove: ");
        String remove = userinput.nextLine();

        // Remove every occurrence of the string
        sentence = sentence.replace(remove, ""); 

        // Display the updated sentence
        System.out.println("Updated sentence: " + sentence);

        userinput.close();
    }
}
