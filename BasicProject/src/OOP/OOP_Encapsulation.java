package OOP;

/**
 * 
 * @author alancampbell
 * 
 * Encapsulation refers to hidding 'sensitive' data from users.
 * To achieve this, you must do the following:
 * - declare class variables/attributes as private
 * - provide public GET and SET methods to access and update the value of the private variables
 * 
 * Setting a variable as private means no one outside of the class can access it.
 * However, it is possible to access them with the user of GET and SET Methods
 * 
 * The GET Method returns the variable's value.
 * The SET Method sets the variable's value
 * 
 * In the example below, we have a class with a private String.
 * To access this variable, we declare two public methods:
 * - getName (the GETTER Method) which returns the value stored in the private String.
 * - setName (the SETTER Method) which reads in a String value and assigns it to the private String.
 * 
 * In the Main Method, we can declare a Person object and using the getName() and setName() methods, we can
 * assign the private variable 'name' a value and display it, all outside the class' scope.
 * 
 */

class Person {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String sName) {
		this.name = sName;
	}
}


public class OOP_Encapsulation {
	
	public static void main(String [] args) {
		
		Person myObj = new Person();
		
		myObj.setName("John");					//Setting the name
			
		System.out.println(myObj.getName());	//Getting/returning the name
		
	}

}

/**
 * Reasons to incorporate Encapsulation:
 * - Better control of class attributes and methods
 * - Increased security
 * - Class attributes can or cannot be read-only, depending on preferences needed in project
 */
