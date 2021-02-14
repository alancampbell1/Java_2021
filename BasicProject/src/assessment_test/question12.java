package assessment_test;

/**
 * 
 * @author alancampbell
 * 
 * What is the result of the following program:
 * The result is "Color: null".
 * 
 * First point to note, even though we have a private variable called 'color', we can access it from an object in the
 * main method because the object is in the same class as its type. If we created an object outside of the class 'question12'
 * we would not be able to access the private variable.
 * 
 * Second point to note, we have a default constructor with the line 'this("white")'. This is correct syntax so long as
 * there is a second parameterised constructor that can take the value "white".
 * 
 * Why the output is null?  We create an object called 'e'. Because we do not pass any values in its creation, we call on
 * the default constructor. Here, we take the value 'white' and pass it to the parameterised constructor. The statement
 * 'color=color;' does not refer to the private variable version of color. So we are simply assigning the value coming in
 * to itself and private String color stays as null.
 * 
 */


public class question12 {
	
	private String color;
	
	public question12() {
		this("white");
	}
	
	public question12(String color) {
		color = color;
	}
	
	public static void main(String [] args) {
		
		question12 e = new question12();
		
		System.out.println("Color: " + e.color);
		
	}

}
