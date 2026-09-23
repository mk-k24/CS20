package SkillBuilder;

import java.util.Scanner;

public class RandomNum 
{

    public static void main(String[] args) 
    { 
    	//Declare the minimum and max variables
    	int min, max;
    	
    	//Scanner class for user input
    	Scanner input = new Scanner(System.in);
    	
    	//Prompt the user for minimum number
    	System.out.println("Enter a minimum number: ");
    	
    	//Store the minimum number
    	min = input.nextInt();
    	
    	//Prompt the user for max number
    	System.out.println("Enter a maximum number: ");
    	
    	//Store the max number
    	max = input.nextInt();
    	
    	//Generate the random numbers
    	System.out.println("Random Number: "
    			        + (int)((max - min + 1) * Math.random()
    			        + min));
    }

    
    
    
}