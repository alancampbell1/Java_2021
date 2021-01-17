package OOP;

/**
 * 
 * @author alancampbell
 * 
 * Java Enums:
 * An enum is a special class in Java that represents a groups of constants, i.e. variables that cannot be changed.
 * We use the keyword enum to create a class like this.
 * 
 * Enum is short for enumerations which means specifically listed.
 * 
 * An enum cannot be used to create an object.
 * 
 * They are useful when you have values that are not going to change, such as the months of the year.
 * 
 * The following is an example of an enum. It is called Level and has three values.
 * To access these values we go Level.LOW in standard Java method.
 * 
 */

enum Level {
	LOW,
	MEDIUM,
	HIGH	
	
}

public class OOP_Java_Enums {
	
	//enums can be declared inside a class like so.
	enum test {
		name,
		age,
		weight
	}
	
	public static void main(String [] args) {
		
		
		System.out.println(Level.LOW);	//This will print LOW
		
		System.out.println(test.age);	//This will print age
		
		//A common use of enums is in Switch statements
		test myVar = test.name;
		
		switch(myVar) {
		case name:
			System.out.println("Found: " + myVar);
			break;
		
		
		case age:
			System.out.println("Found: " + myVar);
			break;
		
	
		case weight:
			System.out.println("Found: " + myVar);
			break;

		}
		
		//You can also loop through an enum
		for (test myVar2: test.values()) {
			System.out.println(myVar);
		}
	}
}
