
public class testFile {

	public static void main(String [] args) 
	{
		
		System.out.println("A Call from the Main Method.");
		
		int result = addition(5, 10);
		
		System.out.println("Result equals: " + result);
		
	}
	
	public static int addition(int valueX, int valueY)
	{
		int result = 0;
		
		System.out.println("Inside addition method");
		
		result = valueX + valueY;
		
		
		return result;
		
		
	}
	
	
}
