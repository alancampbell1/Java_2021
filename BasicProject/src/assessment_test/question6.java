package assessment_test;

/**
 * 
 * @author alancampbell
 * 
 * What is the result of the following code:
 * 
 * The answer is 15.
 * 
 * Note: When calling on a static method that does not come from an object you can do so in two ways:
 * By referencing the class it is in, following by .nameOfMethod(), e.g. question6.addToInt(a, b);
 * 
 * Alternatively, you can just go the nameOfMethod();, e.g. addToInt(a, b);
 * 
 */

public class question6 {
	
	public static void addToInt(int x, int amountToAdd) {
		x = x + amountToAdd;
	}
	
	
	public static void main(String [] args) {
		int a = 15;
		int b = 10;
		
		question6.addToInt(a, b);
		
		System.out.println(a);
		
	}

}
