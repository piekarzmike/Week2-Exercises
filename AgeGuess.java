//*********************************************************************************************
//
//	AgeGues.java					Author: Mike Piekarz
//
//	Lab: # 2						Exercise: #1
//
// 	Ask user for their age and compare answer provided to the pseudo-random number utilizing
// 		
//*********************************************************************************************

// Import the Scanner and Random class from the Java.util package
import java.util.Scanner;
import java.util.Random;

public class AgeGuess {
	
	//-----------------------------------------------------------------------------------------
	//	Exercise 1
	//	Modify the AgeGuess program from the last lab to do the following:
	//		• Declare a new int variable age
	//		• Initialize age to a random integer between 0 and 100 (inclusive)
	//		• Asks the user for a guess, save the guess into the ageGuess variable
	//		• Display the user guess and the correct answer
	//-----------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		// Declare variables 
		int age;
		int ageGuess;
		Random randomNum = new Random();
		Scanner scan = new Scanner(System.in);
		
		// Initialize age Variable to a random number between 0 to 100
		age = randomNum.nextInt(101);
		
		// Ask User to input their age
		System.out.print
		("Take a guess at my age and enter here (Hint - age is between 0 & 100): ");
		
		// Read user input for their age and initialize the ageGuess variable
		ageGuess = scan.nextInt();
		
		// Display to user random number that was generated for the age
		System.out.print("\n"+"You guessed my age was " + ageGuess + " years old but I am " + age + " years old!!!");
		
		// Close Scanner
		scan.close();
	}

}
