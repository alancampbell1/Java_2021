package OOP;

/**
 * 
 * @author alancampbell
 * 
 * A constructor in Java is a special method that is used to initialize objects. It is called when an object of a class is 
 * created. 
 * 
 * It is generally used to set initial values for object attributes.
 * 
 * It is defined by having the same name as the class itself.
 * 
 * 
 */


public class OOP_Constructors {
	
/**
 * In this example, we have a variable 'x' that is set a value of 5 when the object is created.
 */

	int x;	//Creating a class attribute
	
	public OOP_Constructors() {
		x = 5;	//Set an initial value to 5
	}
	
	public static void main(String [] args) {
		
		OOP_Constructors myObj = new OOP_Constructors();
		System.out.println(myObj.x);
		
		OOPCon myObj2 = new OOPCon(10);
		System.out.println(myObj2.y);
		
	}
	
}

/**
 * 
 * Constructors can also have parameters passed in which are done in the () of the object's initialization.
 *
 */

class OOPCon {
	
	int y;
	
	public OOPCon (int x) {
		y = x;
	}
}
