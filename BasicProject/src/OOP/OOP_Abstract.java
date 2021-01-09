package OOP;

/**
 * 
 * @author alancampbell
 * 
 * An abstract method belongs to an abstract class and does not have a body. The body is provided by a subclass
 * that 'extends' the abstract class.
 * 
 * An abstract class can have regular methods too.
 * 
 * A subclass than inherits an abstract class that contains abstract methods must provide the abstract methods
 * with a method body or else errors are thrown.
 * 
 */

abstract class abClass {
	public String name = "Alan";
	public int age 	   = 29;
	
	public abstract void study();	//The abstract class' abstract method
	
	public void toWork() {
		System.out.println("Going to work");
	}
	
}

class actions extends abClass{
	public void study() {
		System.out.println("Going to Study");
	}
}

public class OOP_Abstract {

	public static void main(String [] args) {
		
		//Creating an object of 'actions' that inherits everything from abClass
		actions myObj = new actions();
		
		System.out.println(myObj.age);		//This will come directly from the abstract class
		System.out.println(myObj.name);
		myObj.toWork();						//This will come directly from the abstract class
		myObj.study();						//This is declared in the abstract class but given context in the subclass
		
	}
	
}
