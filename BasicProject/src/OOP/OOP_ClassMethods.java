package OOP;

/**
 * 
 * @author alancampbell
 *
 * Reminder: Methods are declared within a class and are used to perform certain actions.
 *
 */

public class OOP_ClassMethods {
	
/**
 * This first example prints out the message when called from the Main Method
 */
	static void myMethod() {
		System.out.println("Called from myMethod");
	}
	
/**
 * Static vs non-Static:
 * - A Static method means it can be accessed without creating an object of a class.
 * 
 * - A non-Static method means it can only be accessed by objects
 */
	
	public void secondMethod() {
		System.out.println("Called from secondMethod");
	}
	
	
	public static void main(String [] args) {
		myMethod();
		
		OOP_ClassMethods myObj = new OOP_ClassMethods();
		
		myObj.secondMethod();
		
	}
	

}
