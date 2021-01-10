package OOP;

/**
 * 
 * @author alancampbell
 * 
 * Nest Class refers to class within a class. It's purpose is to group common code together and make it more 
 * readable and maintainable.
 * 
 * In order to work with an inner class you can create an object. However, to do so you must create an object of the
 * outerClass first which is used to create an object of the inner class.
 * 
 * Inner Classes can be declared private or protected which is used when you do not want the outer object to get access
 * to the inner object's variables.
 * 
 * Inner Classes can be declared static, meaning you do not need an outer object created in order to create the inner object.
 * 
 */

class outerClass{
	int x = 10;
	
	class innerClass{
		int y = 5;
		
		public int myInternalValue() {
			return y;
		}
		
	}
	
	private class innerClass2{
		int z = 100;
	}
	
	protected class innerClass3 {
		int v = 99;
	}
	
	static class innerClass4 {
		int a = 1;
	}
	
}

public class OOP_InnerClass {
	
	public static void main(String [] args) {
		
		outerClass outerObj = new outerClass();							//outerClass object
		outerClass.innerClass innerObj = outerObj.new innerClass();		//innerClass object (NOTE: you need to create an outer object to do so)
		System.out.println("x: " + outerObj.x + " y: " + innerObj.y);
		
		
		outerClass.innerClass4 myObj = new outerClass.innerClass4();	//innerClass4 is static so no need to create outer object first
		System.out.println("a is " + myObj.a);
		
		System.out.println(innerObj.myInternalValue());					//Inner classes can have access methods
	}
	
}
