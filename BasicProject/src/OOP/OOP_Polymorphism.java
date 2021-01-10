package OOP;

/**
 * 
 * @author alancampbell
 * 
 * Polymorphism means 'Many Forms' and it occurs when we have many classes that relate to each other by inheritance.
 * 
 * Reminder, Inheritance lets us inherit attributes and methods from another class.
 * 
 * Polymorphism uses these methods to perform different tasks, i.e. perform a single action in different ways
 * 
 * In the following example, we have an Animal superclass with a method that prints a statement.
 * We then have two sub-classes than inherit from the Animal superclass. They both have the same method of animalSound()
 * but different print outcomes.
 * Depending on the type of object you create, you will get a different output.
 * 
 * Why use Polymorphism:
 * - Useful for code re-usability
 * 
 */

class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("The Dog goes: woof");
	}
}

class Cat extends Animal{
	public void animalSound() {
		System.out.println("The cat goes: meow");
	}
}

public class OOP_Polymorphism {
	
	public static void main(String [] args) {
		
		Animal obj1 = new Animal();		//Animal object
		Animal obj2 = new Dog();		//Dog object
		Animal obj3 = new Cat();		//Cat object
		
		obj1.animalSound();				//Prints statement from Animal class
		obj2.animalSound();				//Prints statement from Dog class
		obj3.animalSound();				//Prints statement from Cat class
		
	}
	
}
