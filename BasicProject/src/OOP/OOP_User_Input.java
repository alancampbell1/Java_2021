package OOP;

/**
 * 
 * @author alancampbell
 * 
 * The Scanner class is used to get a user input. It is found in the java.util package.
 * To use the scanner class, create an object of the class and use any of the available methods found in the Scanner
 * class documentation.
 * Example: nextLine() is used to read strings in.
 * 
 * The following example uses nextLine() method for Strings. However, there are specific methods for other data types:
 * - nextBoolean()	- Booleans
 * - nextDouble()	- Doubles
 * - nextInt()		- Integers
 * - nextLong()		- Longs
 * 
 */

import java.util.Scanner;

public class OOP_User_Input {
	
	public static void main (String [] args) {
		
		Scanner myObj = new Scanner(System.in);	//Creates a Scanner object
		
		System.out.println("Enter a username:");
		
		String userName = myObj.nextLine();
		System.out.println("Thank you: " + userName);
		
	}

}
