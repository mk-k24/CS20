package SkillBuilder;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        // Create Scanner object from
        Scanner userinput = new Scanner(System.in);

        //Get The Two-Digit Number 
        System.out.print("Enter a two-digit number: ");

        
        //Ask User For Whole Number
        int number = userinput.nextInt();
        
        //Use division to decipher the tens place from the ones place
        int tens = number / 10;
       
       //The % Symbol finds the remainder from previous equation
        int ones = number % 10;

        //Display the ones and tens place digits
        System.out.println("Tens place digit: " +tens);
        System.out.println("Ones place digit: " +ones);
    }
}