package assessment_test;

/**
 * 
 * @author alancampbell
 * 
 * How many times is true printed? Answer: three
 * 
 * Note:
 * We declared two variables called s1 and s2. Because they share the same content, Java automatically assigns them the
 * same memory location.
 * However, if we declare s1 as 'String s1 = new String('Java');', we give it a new memory location.
 * == checks if both objects point to the same memory location.
 * .equals() compares the values within both variables.
 * 
 */

public class question2 {
	
	public static void main(String [] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
		
		
	}

}
