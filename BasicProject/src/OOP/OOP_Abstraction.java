package OOP;

/**
 * 
 * @author alancampbell
 * 
 * Data Abstraction is the process of hiding certain details and showing only essential info. to the user.
 * 
 * It is normally achieved by the use of abstract classes or with interfaces.
 * 
 * abstract is a non-access modifier for classes and methods and does the following:
 * - Abstract Class: a restricted class that cannot be used to create an object. To access its contents it must be
 * inherited into a sub-class where an object is created from.
 * - Abstract Methods: Can only be used in an abstract class and does not have a body. Its body is provided by the subclasses
 * that inherit it.
 * 
 * An abstract class can have both abstract and regular methods.
 * 
 * Why use abstract classes and methods:
 * - Added security by hiding certain information to the end user.
 * 
 * The following is an example of an Abstract class
 * 
 */

abstract class WildAnimal{
	
	public abstract void animalSound();			//An abstract method with no body
	
	public void sleep() {						//A regular method in an abstract class
		System.out.println("Zzzz");
	}
	
}

class Wolf extends WildAnimal{					//Sub-class of WildAnimal
	public void animalSound() {					//A body is given to the abstract method animalSound()
		System.out.println("Woof");
	}
}

public class OOP_Abstraction {
	
	public static void main(String [] args) {
	
		Wolf myWolf = new Wolf();				//Wolf object created
		myWolf.animalSound();					//Calling on the originally abstract method but now has a body
		
	}

}
