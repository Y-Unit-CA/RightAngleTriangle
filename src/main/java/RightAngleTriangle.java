import java.util.Scanner;

/**
 * 
 * * Creating a right angle triangle pattern with an input number.
 * 
 * @Justin_Jun
 * @Roger_Yau
 * 
	Write a Java program to display the pattern like a right angle triangle with a number.
	Test Data
	Input number of rows : 10
	Expected Output :
	1
	12
	123
	1234
	12345
	123456
	1234567
	12345678
	123456789
	12345678910
 * 
 */

public class RightAngleTriangle {
	
	public static void main ( String[ ] args ) {

		RightAngleTriangle rightAngleTriangle = new RightAngleTriangle();
		int input = requestInput ();
		rightAngleTriangle.createRightAngleTriangle(input);
	}
	
	public void createRightAngleTriangle (int numRows) {
		 
		int rows = numRows;
		for ( int i = 1; i <= rows; i++ ) {
	            for ( int j = 1; j <= i; j++ ) {
	               System.out.print ( j + " " );
	            }
	            System.out.println ( );
	     }
	 }
	
	private static int requestInput () {
			int userInput = 0;
			try {
				Scanner sc = new Scanner (System.in);
				System.out.println ("Enter a number to creatre a right triangle:");
				userInput = sc.nextInt ();
				if (userInput > 1) {
					System.out.println ( );
					System.out.println ("Here we go:");
					System.out.println ( );
					sc.close(); 
				} else {
					System.out.println ( );
					System.out.println ("invalid input. Please restart the program and enter a positive-integer.");
				}
			} catch (Exception e) {
				System.out.println ( );
				System.out.println ("invalid input. Please restart the program and enter a positive-integer.");
				e.printStackTrace ();
			}
		return userInput;
	}


}

