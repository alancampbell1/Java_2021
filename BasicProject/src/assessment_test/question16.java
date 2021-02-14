package assessment_test;

/**
 * 
 * @author alancampbell
 * 
 * What changes would allow the following code to compile:
 * 
 * public interface Animal { public default String getName() { return null; } }
 * interface Mammal { public default String getName() { return null; } }
 * abstract class Otter implements Mammal, Animal {}
 * 
 * Answer:
 * D: Remove the default method modifier and method implementation on lines 1 and 2
 * 
 * F: Override the getName() method with an abstract method in the Otter class.
 * 
 * G: Override the getName() method with a concrete method in the Otter class.
 * 
 * NOTE:
 * An interface method can contain a body if it has default in its method signature.
 * Removing default means you must remove the method's body too.
 * Default methods are only allowed in Interfaces.
 * An abstract class can have concrete and abstract methods. If it implements an Interface,
 * this needs a copy of the methods in the Interface with or without a body depending on if it is abstract or not.
 * Methods coming from an Interface into an abstract class can be abstract or concrete.
 * Concrete classes cannot have abstract methods.
 * 
 * 
 */


interface Animal { public default String getName() { return null;}}

interface Mammal { public default String getName() {return null;}}

abstract class Otter implements Mammal, Animal {
	
	public String getName() {
		return "Alan";
	}
	
}


public class question16 {

}
