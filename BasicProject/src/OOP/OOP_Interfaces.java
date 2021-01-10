package OOP;

/**
 * 
 * @author alancampbell
 * 
 * Another way of achieving abstraction is with Interfaces.
 * Reminder: Abstraction is the process of hiding certain details and showing only essential information to the user.
 * 
 * An interface is a completely abstract class in that it does not allow methods to be created with bodies.
 * Interfaces cannot be used to create objects.
 * When you implement an interface, with a sub-class, you must 'override'/provide a body for all its methods.
 * Interfaces are abstract and public by default.
 * They cannot contain a constructor.
 * 
 * Why use interfaces:
 * - Again security as they can be used to hide key pieces of information
 * - Java does not support multiple inheritance, see next example.
 */

interface vehicle {			//Interface declared with two methods with no body
	public void toMove();	
	public void toStop();
}

class myTruck implements vehicle{
	public void toMove() {
		System.out.println("The truck moves forward");
	}
	
	public void toStop() {
		System.out.println("The truck stops");
	}
} 


public class OOP_Interfaces {
	
	public static void main(String [] args) {
		myTruck truckObject = new myTruck();
	
		truckObject.toMove();
		truckObject.toStop();
		
		demoClass demoObj = new demoClass();
		demoObj.hello();
		demoObj.goodbye();
		
	}
}

/**
 * Multiple Interfaces:
 * 
 * Java does not support multiple inheritance from numerous abstract classes into a single sub-class.
 * However, this can be achieved with interfaces as shown below.
 * Interfaces just need to be separated with a comma.
 *
 */

interface firstInterface{
	
	public void hello();
	
}

interface secondInterface{
	
	public void goodbye();
	
}

class demoClass implements firstInterface, secondInterface{		//Multiple inheritance
	
	public void hello() {
		System.out.println("Hello");
	}
	
	public void goodbye() {
		System.out.println("Goodbye");
	}
}







