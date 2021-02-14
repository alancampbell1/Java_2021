package assessment_test;
import java.util.*;
/**
 * 
 * @author alancampbell
 * 
 * Which are true of the following:
 * 
 * Note: When we create the objects they hold a address location of that object, in a HEX Code.
 * 
 * In myMethod, two objects are created with different address locations.
 * After the line 'one = two', we are now saying that 'one' now points to the address location of 'two'.
 * This means the object at the address location of one's original object is eligible for garbage collection.
 * After the line 'two = null' we are saying that two is no longer pointing to an address location. However, its
 * original address location still exists as 'one' is pointing to it.
 * Finally, with the line 'one = null' the address location that was originally 'two' and re-assigned to 'one' is no
 * longer linked to an object so it is garbage collected too.
 * 
 *
 */


class Grasshopper {
	public Grasshopper (String n) {
		name = n;
	}
	
	public static void myMethod () {
		Grasshopper one = new Grasshopper("g1");
		Grasshopper two = new Grasshopper("g2");
		
		one = two;
		two = null;
		one = null;
	}
	
	private String name;
}


public class question10 {
	
}
