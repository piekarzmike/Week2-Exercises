//*********************************************************************************************
//
//	AgeGues.java					Author: Mike Piekarz
//
//	Lab: # 2						Exercise: #6
//
// 	Ask user to input a number and display the corresponding word to the user
// 		
//*********************************************************************************************

//Import Scanner class from the Util Package
import java.util.Scanner;

public class NumDisplay {
	
	//-----------------------------------------------------------------------------------------
	// 	Exercise 6
	//	Make a program called NumDisplay.java that prompts the user enter a number between 0
	//	and 9 and then display the corresponding word (i.e. "zero" for 0, "one" for 1, etc.). Use a
	//	switch statement to do this. Include a default case that lets the user know they entered a
	//	wrong number.
	//-----------------------------------------------------------------------------------------

	public static void main(String[] args) {

		// Declare variables
		int userInput;
		Scanner scan = new Scanner(System.in);
		
		// Prompt user to enter a number between 0 & 9
		System.out.print("Please enter a number between 0 to 9: ");
		
		// Read user input for the number that was enter
		userInput = scan.nextInt();
		
		// Notify user the number the entered by displaying the corresponding word (e.g.two)
		switch (userInput)
		{
			case 0:
				System.out.println("\nThe number you entered was zero.");
				break;
			case 1: 
				System.out.println("\nThe number you entered was one.");
				break;	
			case 2: 
				System.out.println("\nThe number you entered was two.");
				break;	
			case 3: 
				System.out.println("\nThe number you entered was three.");
				break;	
			case 4: 
				System.out.println("\nThe number you entered was four.");
				break;	
			case 5: 
				System.out.println("\nThe number you entered was five.");
				break;	
			case 6: 
				System.out.println("\nThe number you entered was six.");
				break;	
			case 7: 
				System.out.println("\nThe number you entered was seven.");
				break;
			case 8: 
				System.out.println("\nThe number you entered was eight.");
				break;	
			case 9: 
				System.out.println("\nThe number you entered was nine");
				break;
			default:
				System.out.println("\nThe number " + userInput + " is not between 0 and 9.  Please, re-run and enter a number within the specified range.");
		}
		
		// Close Scanner
		scan.close();
		
	}

}
