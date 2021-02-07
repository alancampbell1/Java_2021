package OOP_TutorialsPoint;

/**
 * 
 * @author alancampbell
 * 
 * Java Overriding:
 * Overriding means to override the functionality of an existing method.
 * 
 * The benefit of overriding is that the user can define the behavior that's specific to the subclass type and can 
 * use the superclass' method of the same name based on their requirements.
 * 
 * In the following example, we have a super and sub class with two methods of the same name but with different outputs.
 * Then in the main method, we have two types of objects defined:
 * One object has a reference of myAnimal and is also a myAnimal object.
 * The second object has a reference of myAnimal but is a myDog object.
 * 
 * At compile time, the JVM first checks the references types. However, at runtime, it looks at the object types and runs
 * the method associated with object defined. 
 * As a result, we get two different outputs.
 * 
 * Now, say we call on bark() using the object defined with a myAnimal reference and equals a myDog object. This will 
 * fail because at compile time the JVM will look for bark() in the myAnimal class which does not exist.
 * 
 * Using super:
 * We also have two methods defined in each class called sleep() with different outputs. 
 * However, in the subclass, myDog, we call on the sleep() method in the superclass using super.sleep().
 * This means at output, the sleep() method in the superclass is called which prints a certain output and this is followed 
 * by the sleep method in the subclass.s
 * 
 */


class myAnimal {
	public void move() {
		System.out.println("Animals can move");
	}
	
	public void sleep() {
		System.out.println("Animals can sleep");
	}
}

class myDog extends myAnimal {
	public void move() {
		System.out.println("Dogs can run & walk");
	}
	
	public void bark() {
		System.out.println("Dogs can bark");
	}
	
	public void sleep() {
		super.sleep();
		System.out.println("Dogs can sleep");
	}
	
}

public class Overriding_OOP {
	
	public static void main(String [] args) {
		
		myAnimal a = new myAnimal();	//myAnimal reference and myAnimal object
		myAnimal b = new myDog();		//myAnimal reference but myDog object
		
		a.move();						//Calls on the method in the myAnimal class
		b.move();						//Calls on the method in the myDog class
		
		b.sleep();
		
	}
}

/**
 * Rules for Method Overriding:
 * 
 * - The argument list should be the same, i.e. parameters coming in and out.
 * - The return type should be the same.
 * - If a superclass method is public, the subclass method can be public, private or protected.
 * - Methods can only be overridden if they are inherited by the subclass.
 * - A method declared final cannot be overridden.
 * - A method declared static cannot be overridden but can be re-declared.
 * - If a method cannot be inherited, then it cannot be overridden.
 * - Constructors cannot be overridden.
 */


