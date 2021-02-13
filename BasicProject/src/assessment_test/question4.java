package assessment_test;

/**
 * 
 * @author alancampbell
 * 
 * What is the output?
 * 
 * The first thing to keep in mind is (count++ < 3). Count is 0 and 0 is less than 3, so we enter the loop. However, the
 * ++ means we increment count by 1 so it is now 1. Everything in the loop is carried out and we come back to the conditional
 * but with count equaling 1. 1 is less than 3 so enter the loop, increment count by 1 to 2 and carry out everything in
 * the loop. We return to the check with count as 2. 2 is less than 3 so we enter the loop, increment count to 3 and 
 * carry out everything. Finally, 3 is not less than 3 and the loop ends.
 * 
 * But what if we had '(++count < 3)' ?: In this instance, count is incremented by 1 before being compared to 3. So count
 * will not start at 0 but at 1. 1 is less than 3 so the loop is entered and count stays as 1. When we return to the check
 * we increment count by 1 to 2. 2 is less than 3 so we enter the loop and carry everything out. When we return to the 
 * check, we increment count by 1 to 3. 3 is not less than 3 so the loop ends.
 * In this instance we have one less iteration.
 * 
 * Steps broken down:
 * - count is 0 and is less than 3, so we enter the loop and increment count by 1.
 * - y equals (1 + 2 * 1) % 3 => (3) % 3 => 0.
 * - We enter the switch statement and hit 'case 0' which is means x is now '2'.
 * NOTE: There is a break statement here. This means we break out of the switch statement and NOT the loop as a whole.
 * - Loop starts again, we enter and count is now 2.
 * - y equals (1 + 2 * 2) % 3 => (5) % 3 => 2 (i.e. 3 divides into 5 once, remainder 2).
 * - There is no case for '2' but the 'default:' is marked as case '0' so 'x' becomes '1' and we break out of the 
 * switch statement.
 * - 2 is less than 3 so we enter the loop, count now becomes 3. 
 * - y equals (1 + 2 * 3) % 3 => (7) % 3 => 1.
 * NOTE: We are following the rules of BOMDAS - brackets, multiplication, division, addition, subtraction
 * - We now hit case 1 where x is 1 plus 5 so it equals 6.
 * 
 * Modulus: Very important to know.
 * The bigger number should be to the left of the expression:
 * Example 1: 6 % 3 = 0
 * Example 2: 6 % 4 = 2
 * 
 * Having it the other way around (smaller number to the left) means the answer is always the smaller number.
 * 
 */

public class question4 {
	
	public static void main(String [] args) {
		
		boolean keepGoing = true;
		int count = 0;
		int x = 3;
		
		while(count++ < 3) {
			
			System.out.println("Count: " + count);
			
			int y = (1 + 2 * count) % 3;
			
			System.out.println("y: " + y);
			
			switch(y) {
				default:
				case 0: x -= 1; break;
				case 1: x += 5; 
			}
			
			System.out.println("x: " + x);

		}
		System.out.println(x);
	}

}
