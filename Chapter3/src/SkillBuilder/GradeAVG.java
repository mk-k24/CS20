package SkillBuilder;

import java.util.Scanner;

public class GradeAVG {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        //Get each grade from the user
        System.out.print("Enter Grade 1: ");
        int grade1 = userinput.nextInt();

        System.out.print("Enter Grade 2: ");
        int grade2 = userinput.nextInt();

        System.out.print("Enter Grade 3 : ");
        int grade3 = userinput.nextInt();

        System.out.print("Enter Grade 4: ");
        int grade4 = userinput.nextInt();

        System.out.print("Enter Grade 5: ");
        int grade5 = userinput.nextInt();

       //Calculate the average by adding every grade and dividing by 5
        double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5.0;

        //Display the Grade average
        System.out.println("The average of the grades is: " + average);
    }
}