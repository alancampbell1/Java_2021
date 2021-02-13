package assessment_test;

/**
 * 
 * @author alancampbell
 * 
 * What is the output of the following code: This code fails in three locations:
 * - Firstly, line 'protected int getTailLength() { return 4; }' you cannot reduce the visibility of a method
 * declared public in an interface and used in class 'Puma'. You even need to include the word 'public' as not including
 * an access modifier will be picked up.
 * - Secondly, the line 'public class question3 extends Puma' throws a compile error because of the first error.
 * - Thirdly, the line 'Puma puma = new Puma();' is incorrect. They are trying to create an object from an abstract
 * class which is not allowed
 *
 */
/**
interface HasTail{ int getTailLength(); }

abstract class Puma implements HasTail {
	protected int getTailLength() { return 4; }
}

public class question3 extends Puma {
	public static void main(String [] args) {
		
		Puma puma = new Puma();
		
	}
	
	public int getTailLength(int length) { return 2; }
} **/
