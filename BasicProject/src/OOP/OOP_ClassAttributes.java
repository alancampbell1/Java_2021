package OOP;

/**
 * @author alancampbell
 *
 * When we define variables in a class, they are referred to as attributes of that class.
 * 
 * When we define an object of a class, we access these attributes directly and print or edit them accordingly
 *
 * In the following example, we take three attributes of a class in an object and print their contents and update
 * a attribute value too.
 *
 */

public class OOP_ClassAttributes {
	
	String fname = "Alan";
	String sname = "Campbell";
	int age = 28;
	
	public static void main(String [] args) 
	{
		
		OOP_ClassAttributes myObj = new OOP_ClassAttributes();
		
		System.out.println("The objects name is " + myObj.fname + " " + myObj.sname);
		
		myObj.age += 1;
		
		System.out.println("The object's age is " + myObj.age);
		
	}
}
