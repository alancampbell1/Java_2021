package OOP;

/**
 * 
 * @author alancampbell
 * 
 * In Java it is possible to inherit methods and attributes from one class into another.
 * 
 * Broadly, classes that do this are broken into two categories:
 * - subclass (child): inherits methods or attributes from another class
 * - superclass (parent): the class other classes inherit from
 * 
 * The following is a basic example of inheritance. We have a superclass with attributes and methods. We also have
 * a subclass that uses the superclass' attributes and methods because it is inherited.
 * 
 * NOTE: The variable in the class car, type, is 'protected'. 'protected' variables can only be accessed by the class
 * they are in and in subclasses. If 'type' was private, the code would fail as the 'OOP_Inheritance' object would require
 * GET and SET Methods to get access to 'type'.
 * 
 */

class car {															//This is the superclass
	protected String type = "Skoda";
	
	public void toStart() {
		System.out.println("The car is starting");
	}
	
}


public class OOP_Inheritance extends car {							//This is the subclass
	
	public static void main(String [] args) {
		OOP_Inheritance myObj = new OOP_Inheritance();			    //OOP_Inheritance object created
		
		System.out.println("I own a " + myObj.type + " car.");		//Object has access to the car class' attributes and methods
		
		myObj.toStart();
		
	}
	
}

/**
 * 
 * @author alancampbell
 *
 * If you have a class that you do not want any subclass to be able to inherit, then we use the keyword final in its declaration
 *
 */

final class truck{
	
	
}
