//*********************************************************************************************
//	
//	DistCalc.java					Author: Mike Piekarz
//	
//	Lab: # 2						Exercise: #2
//
// 	Calculate the distance between two coordinates and provide the calculated distance
//
//*********************************************************************************************

// Import the DecimalFormat class from the Java.text package
import java.text.DecimalFormat;

public class DistCalc {
	
	//-----------------------------------------------------------------------------------------
	//	Exercise 2
	//	Write an application called DistCalc that reads the (X, Y) coordinates for two points then
	//	compute the distance between them using the distance formula and display the result with 
	//	three decimal places to the screen
	//-----------------------------------------------------------------------------------------

	public static void main(String[] args) {
		
		// Declare and initialize variables
		double dist;
		int cordX1 = 3;
		int cordY1 = 2;
		int cordX2 = 9;
		int cordY2 = 8;
		
		// Calculate the horizontal (X) and vertical distance between the coordinates.  
		// Step is separate to ensure readability of the distance formula
		int horizontalDis = cordX2 - cordX1;
		int verticalDis = cordY2 - cordY1;
		
		// Calculate the distance between the coordinates by utilizing the Distance Formula by inputing the calculated horizontal and vertical distance
		dist = Math.sqrt((Math.pow((horizontalDis),2) + Math.pow((verticalDis), 2)));
		
		// Format end result to 3 decimal places
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		// Print the calculated distance between the coordinates
		System.out.println(fmt.format(dist));
		
		
		
	}

}
