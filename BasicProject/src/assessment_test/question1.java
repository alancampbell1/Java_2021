package assessment_test;

/**
 * 
 * @author alancampbell
 * 
 * What is the result of the below code?
 * Answer: it fails on the second print statement. Non-static variables need assignment before they can be
 * printed.
 * 
 * Notes:
 * - A static variable can be printed out without assignment. It will default to zero.
 * - $ is an acceptable value for both a static and non-static variable name.
 * 
 */


public class question1 {
	
	private static int $;
	
	public static void main(String [] args) {
		
		String a_b;
		System.out.println($);
		/**
		System.out.println(a_b);
		**/
		
	}

}
