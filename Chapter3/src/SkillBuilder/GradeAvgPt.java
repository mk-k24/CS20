package SkillBuilder;

import java.util.Scanner;

public class GradeAvgPt 
{

    public static void main(String[] args) 
    {

        // Create Scanner object
        Scanner userinput = new Scanner(System.in);

        // Create a variable to store the total of the grades
        int total = 0;

        // Get the first grade and add it to total
        System.out.print("Enter grade 1: ");
        int grade1 = userinput.nextInt();
        total += grade1;

        // Get the second grade and add it to total
        System.out.print("Enter grade 2: ");
        int grade2 = userinput.nextInt();
        total += grade2;

        // Get the third grade and add it to total
        System.out.print("Enter grade 3: ");
        int grade3 = userinput.nextInt();
        total += grade3;

        // Get the fourth grade and add it to total
        System.out.print("Enter grade 4: ");
        int grade4 = userinput.nextInt();
        total += grade4;

        // Get the fifth grade and add it to total
        System.out.print("Enter grade 5: ");
        int grade5 = userinput.nextInt();
        total += grade5;

        // Calculate the average using real division
        double average = total / 5.0;

        // Display the average as a percentage
        System.out.printf("Average grade: %.2f%%%n", average);

    }

}

