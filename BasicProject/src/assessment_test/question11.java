package assessment_test;

/**
 * 
 * @author alancampbell
 * 
 * What is the output of the following program:
 * 
 * We enter OUTER, we enter INNER. i becomes 1 and x becomes 6.
 * x is 5 which is not greater than 10 so INNER is not broken out of.
 * x += 4 makes x becomes 10.
 * j is incremented by 1 to 1.
 * j is less than or equal to 2 so the do loop is repeated.
 * i is incremented to 2 and x is incremented to 11.
 * 11 is greater than 10 so the INNER is broken out of.
 * i is 2 which is less than 3 in the for loop so INNER is entered again.
 * i is incremented to 3 and x is incremented to 12.
 * 12 is greater than 10 so the INNER loop is broken out of.
 * i which is 3 is not less than 3 in the for loop so OUTER is broken out of.
 * x is 12 and is printed.
 * 
 * NOTE: Notice how the for loop does not have {} but works as if there are {}. This is due to the immediate presence
 * of the INNER.
 * 
 * 
 */

public class question11 {
	
	public static void main(String [] args) {
		
		int x = 5, j = 0;
		
		OUTER: for(int i = 0; i < 3; )
			INNER: do {
				i++; x++;
				
				if(x > 10) break INNER;
				
				x += 4;
				j++;
			} while (j <= 2);
		
		System.out.println(x);
		
	}
}
