package SkillBuilder;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        // Ask the user for the package dimensions
        System.out.print("Enter the length: ");
        double length = userinput.nextDouble();

        System.out.print("Enter the width: ");
        double width = userinput.nextDouble();

        System.out.print("Enter the height: ");
        double height = userinput.nextDouble();

        // Check if any dimension is greater than 10
        if (length > 10 || width > 10 || height > 10) {
            System.out.println("Reject");
        } else {
            System.out.println("Accept");
        }
    }
}