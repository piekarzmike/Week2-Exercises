//*********************************************************************************************
//
//	UserNames.java					Author: Mike Piekarz
//
//	Lab: # 2						Exercise: #3
//
// 	Ask user for their their first and last name and modify user's name 
// 		
//*********************************************************************************************

// Import the Scanner and Random class from the Java.util package
import java.util.Scanner;
import java.util.Random;

public class UserNames {
	
	//-----------------------------------------------------------------------------------------
	//	Exercise 3
	//	Write an application called UserNames that reads the user's first and last name (separately),
	//	then prints a string composed of the first 4 letters of the user's last name, followed by the first
	//	letter of the user's first name, followed by a random number in the range of 10 to 99 (inclusive).
	//	You can assume the first name is at least one letter long and the last name is at least 4 letters.
	//-----------------------------------------------------------------------------------------

	public static void main(String[] args) {
		
		// Declare Variables
		String modFirstName;
		String modLastName;
		int num;
		Scanner scan = new Scanner(System.in);
		Random randomNum = new Random();
		
	
		//Ask User to input their first name:
		System.out.print("Please, enter your first name here: ");
		
		//Read user input that was enter for their First name
		String firstName = scan.nextLine();
		
		//Ask User to input their last  name:
		System.out.print("Hi " + firstName + ", now please provide me your last name: ");
		
		//Read user input that was entered for their Last name
		String lastName = scan.nextLine();
		
		
		// Obtain first character of user's first name
		modFirstName = firstName.substring(0,1);
		
		// Obtain first 4 characters of user's last name
		modLastName = lastName.substring(0,4);
		
		// Initialize num Variable to a random number between 10 to 99
		num = randomNum.nextInt(89) + 10;
		
		
		//Display to user the first 4 characters in their last name followed by the first character in first name followed by a pseudo-random number
		System.out.println(modLastName + modFirstName + num);
		
		// Close Scanner
		scan.close();
		
	}

}
