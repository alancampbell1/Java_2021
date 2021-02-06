package OOP_TutorialsPoint;

/**
 * @author alancampbell
 * 
 * Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another class.
 * This makes the information manageable in a hierarchical order.
 * 
 * The class which inherits the properties of another class is known as the subclass.
 * The class whose properties are inherited is known as the superclass.
 * 
 * extends is the keyword used to inherit the properties of a class.
 * 
 */

/*
 * The following example demonstrates Java Inheritance. We have a class called 'calculation' and a class which extends
 * 'calculation' called 'my_Calculation'.
 * 
 * 'my_Calculation' has access to the variable 'z' and the two methods 'addition' and 'subtraction', to use as it needs.
 */

class Calculation {
	int z;
	
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("Addition output: " + z);
	}
	
	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("Subtraction output: " + z);
	}
}

class my_Calculation extends Calculation{
	
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("Multiplication: " + z);
	}
	
}

/**
 * @author alancampbell
 * 
 * The 'super' keyword is similar to the 'this' keyword and is used in the following scenarios:
 * - Used to differentiate the members of a superclass from the members of a subclass that have the same name.
 * - Used to invoke the use of a superclass constructor from a subclass.
 * 
 * The following example demonstrates how to use the 'super' keyword.
 * 
 * Notice how when using 'super' we simply go 'super.' with the name of method or variable we want to use without using
 * the object previously created.
 * 'super' cannot be used on static methods.
 * 
 */

class super_class {
	int num = 20;
	
	public void display() {
		System.out.println("Display called from the Super Class");
	}
}

class sub_class extends super_class {
	int num = 10;
	
	public void display() {
		System.out.println("Display called from the Sub Class");
	}
	
	public void myMethod() {
		
		sub_class myObj = new sub_class();			//Creating a subclass object
		
		myObj.display();  							//Calling the subclass 'display' method
		
		super.display(); 							//Calling the superclass 'display' method
		
		System.out.println("Value of num from sub class: " + myObj.num);	//printing num from sub class object
		
		System.out.println("Value of num from super class: " + super.num);	//printing num from super class using 'super' keyword
	}
}

/**
 * @author alancampbell
 * When a class is inheriting the properties of another class, the subclass inherits the default constructor of the superclass.
 * However, if the superclass has a parameterized constructor, you can call it from the subclass using the 'super' keyword and
 * passing the matching variables with it.
 * 
 * In the following example we have a superclass with a parameterized constructor that sets value of a variable called 'age'.
 * We also have a method that prints the contents of the variable.
 * We then have a subclass that inherits the superclass. This subclass also has a parameterized constructor, except it takes
 * an int value and calls on the constructor in the superclass using the 'super' keyword and passes the int value to the
 * super constructor where it is assigned to 'age'.
 * In the main method we create an object of the subclass and this passes a value to the subclass constructor which is
 * passed to the superclass constructor and assigned to 'age'.
 */

class mySuperClass {
	int age;
	
	mySuperClass(int age){
		this.age = age;
	}
	
	public void getAge() {
		System.out.println("The age is " + age);
	}
}

class mySubClass extends mySuperClass {
	
	mySubClass(int age){
		super(age);
	}
	
	public void myMethod() {

		getAge();
	}
}

public class inheritance_OOP {
	
	public static void main (String [] args) {
		
		/*
		 * In the following example we create an object of my_Calculation.
		 */
		my_Calculation myCal = new my_Calculation();
		myCal.addition(5, 3);
		myCal.subtraction(7, 2);
		myCal.multiplication(1, 4);
		
		/*
		 * In the following example we have a superclass reference variable called myCal2, that holds a subclass
		 * object, i.e. = new myCalculation.
		 * However, you cannot use the subclasses methods such as 'multiplication'.
		 * It is good practice to always have your reference variable be of the subclass type.
		 */
		Calculation myCal2 = new my_Calculation();
		myCal2.addition(5, 1);
		myCal2.subtraction(8, 1);
		
		/*
		 * Also you cannot have a reference variable of type subclass and hold a superclass object, e.g.
		 * my_Calculation = new Calculation();	This will fail.
		 */
		
		System.out.println("*****************");
		
		sub_class myObjClass = new sub_class();
		myObjClass.myMethod();
		
		System.out.println("*****************");
		
		mySubClass myObj2 = new mySubClass(29);
		myObj2.myMethod();
		
		System.out.println("*****************");
		
		Dogs myObj3 = new Dogs();
		myObj3.checkInstance();
	}
}

/**
 * IS-A Relationship:
 * IS-A is a way of saying the object is type of that object. 
 * 
 * In the following example, we have an Animal superclass. The Mammal object extends Animal so a 'Mammal' IS A 'Animal'.
 * We have a Reptile subclass that extends the Animal superclass so a 'Reptile' is IS A 'Animal'.
 * We then have a Dog class that extends Mammal so 'Dog' IS A 'Mammal'. Also because Mammal extends Animal, 'Dog IS A 'Animal'.
 * 
 */

class Animal {
}

class Mammal extends Animal {	
}

class Reptile extends Animal {	
}

class Dog extends Mammal {
}

/**
 * The instanceof keyword:
 * We can use the instanceof keyword to determine if a class is a subclass of a superclass.
 * In the following example we have a class called Animal, our superclass.
 * We then have a class called Mammal which extends Animal, i.e. is a subclass.
 * We then have a further subclass called Dog which extends Mammal, i.e. another subclass
 * Using instanceof returns a boolean value as to whether a class is a subclass of another.
 *
 */

class Animals {
	
}

class Mammals extends Animals {
	
}

class Dogs extends Mammals {
	
	public void checkInstance() {
		Mammals m = new Mammals();
		Dogs d    = new Dogs();
		
		System.out.println(m instanceof Animals);
		
		System.out.println(d instanceof Mammals);
	
		System.out.println(d instanceof Animals);
	}
}

/**
 * HAS-A Relationship:
 *
 */

/**
 * Interfaces and Inheritance:
 * 
 */


