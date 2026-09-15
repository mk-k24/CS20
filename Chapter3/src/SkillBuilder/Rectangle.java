package SkillBuilder;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args)
	{
      //Declaration
		int length;
		int width;
		int area;
		int per;
		
		//Create Scanner object from 
		Scanner userinput = new Scanner(System.in);
		
		//Get the width from the keyboard
		System.out.print("Enter width: ");
		width = userinput.nextInt();
		
		//Get the length from the keyboard
		System.out.print("Enter length: ");
		length = userinput.nextInt();
		
		//Display the length and width
		System.out.println("The Length is: " + length);
		System.out.print("The width is: " + width);
		
		per = (2*length + 2*width);
		
		area = length * width;
		
		System.out.print("The area is: " + area);
		
		System.out.println("The perimeter is: " + per );
		
      
	}

}
