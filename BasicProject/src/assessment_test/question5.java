package assessment_test;

/**
 * 
 * @author alancampbell
 * 
 * What is the output of the following code:
 * a is printed.
 * The 'try' statement is entered and b is printed.
 * The exception is thrown which is caught in the catch statement and c is printed.
 * The finally block is entered and d is printed
 * Then at the end e is printed.
 * 
 * Note: IllegalArgumentException is a sub-method of RuntimeException in the java documents. So 'e' can take an exception
 * of IllegalArgumentException into its which is of type 'RuntimeException'.
 *
 */

public class question5 {
	
	public static void main(String [] args) {
		
		System.out.print("a");
		try {
			System.out.print("b");
			throw new IllegalArgumentException();
		} catch (RuntimeException e) {
			System.out.print("c");
		} finally {
			System.out.print("d");
		}
		System.out.print("e");
		
	}

}
