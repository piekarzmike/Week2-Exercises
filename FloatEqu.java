//*********************************************************************************************
//
//	FloatEqu.java					Author: Mike Piekarz
//
//	Lab: # 2						Exercise: #5
//
// 	Assess values between two variables to determine if they are equal, not equal, or approximately equal 
//  Notify user of the results
// 		
//*********************************************************************************************

public class FloatEqu {
	
	//-----------------------------------------------------------------------------------------
	// 	Exercise 5
	//	Make a Java program called FloatEqu.java and implement the following:
	// 	 a) Declare a double variable and initialize it to(1.0/10) * (1.0/10)
	// 	    Declare another double variable and initialize it to(1.0/100)
	// 	    Insert an if … else statement and print out "EQUAL" if both variables are equal (use ==)
	// 	    and "NOT EQUAL" otherwise. Run the program and check the output. Is it what you would
	//      expect?
	// 	 b) Modify the program by adding a conditional statement to determine if the variables are
	// 	    approximately equal, using the approach discussed in the lecture.
	//-----------------------------------------------------------------------------------------

	public static void main(String[] args) {
		
		// Declare variables
		double var1 = (1.0/10) * (1.0/10);
		double var2 = (1.0/100);
		final float TOLERANCE = .0001f;
		
		
		// Compare variables and communicate if they are equal or not to the user
		if (var1 == var2)
		{	
			System.out.println("EQUAL");
		}
		else
		{
			System.out.println("NOT EQUAL");
		}
	
		//Note: the above should not be performed using the equality operator (==) when comparing 
		// floating point values due to the majority of the time they will not be equal.
	
		
		// Compare the equality of the variables by computing the absolute value of the difference between
		// them and comparing to the define threshold (.0001) and notify user if they are essentially equal or not
		if (Math.abs(var1 - var2) < TOLERANCE)
		{
			System.out.println("\nEQUAL");
		}
		else
		{
			System.out.println("\nNOT EQUAL");
		}
		
	}

}
