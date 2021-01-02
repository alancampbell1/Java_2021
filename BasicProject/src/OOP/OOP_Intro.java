package OOP;

/**	
 * Notes on Object Oriented Programming:
 * 
 * OOP is about creating objects that contain both data and methods
 * 
 * OOP has several advantages:
 * - Faster and easier to execute
 * - Provides a clear structure for the program
 * - Easier to modify, debug and allows for code to not repeat itself 
 * 
 * Classes and objects are very important in OOP.
 * For example, you can have a class called 'fruit' and a series of objects called 'Apple, Banana, Mango'
 * 
 * A Class is a template to create an object. An Object is a instance of a class. In the example above, we were able to
 * create 3 different instances of 'fruit' called Apple, Banana and Mango.
 * 
 *
**/


/**
 * 
 * @author alancampbell
 * 
 * In Java, an object is created from a class. 
 * 
 * In the example below, we have a class called 'main'. Within it, it has a single variable declaration of int x = 5. This
 * can be treated as an object.
 * 
 * In the class OOP_Intro, we create an instance of this object and call it myObj.
 * Then using this object, we print the value associated with its internal variable 'x', aka 5.
 *
 */


public class OOP_Intro {
	
	int x = 6;
	
	public static void main(String [] args) 
	{
		
		main myObj = new main();
		
		System.out.println(myObj.x);
		
		/**
		 * You can create multiple objects of a class file in a method, so long that they have unique names.
		 * As shown below, we create a second object and print the value associated in it's x value
		 */
		
		main myObj2 = new main();
		System.out.println(myObj2.x);
		
		/**
		 * You can also create an object from a class whilst in that class. 
		 * The object below is an instance of OOP_Intro and we are in the OOP_Intro class.
		 * It acts just like the other objects.
		 */
		
		OOP_Intro myObj3 = new OOP_Intro();
		System.out.println(myObj3.x);
		
	}

}

class main {
	
	int x = 5;
	
}
