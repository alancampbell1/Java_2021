package OOP;

/**
 * 
 * @author alancampbell
 * 
 * Java Packages:
 * A package in Java is used to group related classes. It can be thought as a folder in a file directory where
 * the files are related or common in some way.
 * We create Packages for the following reasons:
 * - Avoid naming conflicts
 * - Write better maintainable code
 * - Navigate easier around a project
 * 
 * Packages in Java can be divided into the following types:
 * - Built-in Packages (from the Java API)
 * - User-defined Packages (created ourselves)
 * 
 */

/**
 * 
 * @author alancampbell
 * 
 * Built-in packages:
 * The Java API is a library of pre-written classes included in the Java Development Environment.
 * The library contains components/classes for assistance in managing inputs, database programming etc.
 * 
 * The library is divided into packages and classes. Meaning you can import an entire package or a single class file.
 * This is done with the keyword import
 * 
 * Syntax used:
 * import package.name.Class;	//Import a single Class
 * import package.name.*;		//Import an entire package
 * 
 */

/**
 * 
 * @author alancampbell
 * 
 * A classic example of a class import into an class file is the Scanner class. 
 * This is used to help get user input information.
 * To use the Scanner class we create an object of the Scanner class and it's internal method nextLine() 
 * to allow a user to type directly into the console. 
 *
 */

import java.util.Scanner;

public class OOP_Packages {
	
	public static void main(String [] args) {
		
		Scanner myObj = new Scanner(System.in);			//Scanner object created
		System.out.println("Enter Username: ");		
		
		String username = myObj.nextLine();				//Calling on nextLine() to allow the user to input text which is assigned to variable username
		
		System.out.println("Welcome: " + username);
	}

}
