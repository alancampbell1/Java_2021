package assessment_test;

/**
 * 
 * @author alancampbell
 * 
 * What is the output of the following program: BearShark
 * 
 * We have a ternary operator. 
 * luck is not less than 10 so we take the second '--luck' statement. This instantly reduces luck by 1 to 9 before being
 * compared to 10. 
 * 9 < 10 so Bear is printed.
 * On the second if statement, 9 is less than 10 so Shark is printed.
 * 
 */

public class question13 {
	
	public static void main(String [] args) {
		
		int luck = 10;
		
		if((luck<10 ? luck++ : --luck) < 10) {
			System.out.print("Bear");
		} if (luck < 10 ) System.out.println("Shark");		
	}
}