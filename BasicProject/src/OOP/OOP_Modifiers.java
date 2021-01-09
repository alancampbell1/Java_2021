package OOP;

/**
 * @author alancampbell
 * 
 * Modifiers are found in a declaration.
 * 
 * Used to set access for classes, methods and constructors.
 * 
 * They can be divided into two groups:
 * - Access Modifiers: controls the access levels
 * - Non-Access Modifiers: other functionality apart from access control
 * 
 * *****************
 * 
 * Access Modifiers:
 * 
 * For Classes, you can either use public or default:
 * - public: is accessible by any other class
 * - default: only accessible by classes in the same package
 * 
 * For attributes, methods or constructors, you can use the following:
 * - public: the code is accessible for all classes.
 * - private: Only accessible within the declared class.
 * - default: Only accessible in the same package. When you do not specify a modifier.
 * - protected: Accessible in the same package and subclasses.
 * 
 * *********************
 * 
 * Non-Access Modifiers:
 * 
 * For Classes, you can use final or abstract
 * - final: Cannot be inherited by other classes
 * - abstract: Class cannot be used to create objects, it must be inherited
 * 
 * For attributes and methods, use the following:
 * - final:			Cannot be overridden or modified
 * - static:		the attributes and methods belong to the class rather than an object
 * - abstract:		Can only be used in an abstract class. Can only be used on methods
 * - transient:		Skipped when serialising the object containing them
 * - synchronized:	Methods can only be accessed by one thread at a time
 * - volatile:		Always read from the "main memory"
 * 
 */

public class OOP_Modifiers {
	
	//Static method
	static void myStaticMethod() {
		System.out.println("This method can be called without creating an object");
	}
	
	//Public method
	public void myPublicMethod() {
		System.out.println("This method must be called from an object");
	}
	
	public static void main(String [] args) {
		myStaticMethod();	//Called without an object
		
		OOP_Modifiers myObj = new OOP_Modifiers();
		myObj.myPublicMethod();		//Called from an object
	}
	
}
