package assessment_test;
import java.util.*;

/**
 * 
 * @author alancampbell
 * 
 * What statement can be inserted into line '______ tadpole = amphibian;'
 * Answer: CanSwim, Amphibian, Object.
 * 
 * Amphibian is allowed because we are assigning into an amphibian object.
 * CanSwim is allowed too because Amphibian inherits from it.
 * Object is inherited although we cannot see it.
 * 
 */

interface CanSwim{}

class Amphibian implements CanSwim {}

class Tadpole extends Amphibian {}

public class question15 {
	
	public static void main(String [] args) {
		
		List<Tadpole> tadpoles = new ArrayList<Tadpole>();
		for(Amphibian amphibian : tadpoles) {
			
			Object tadpole = amphibian;
			
		}
		
	}
	
}
