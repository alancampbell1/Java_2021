package assessment_test;

/**
 * 
 * @author alancampbell
 * 
 * What is the output:
 * DeerReindeer,false
 * 
 * An reference to question8 is created, which causes the default constructor to be called and print 'Deer'.
 * Next, the Reindeer object is created, which passes 5 to the parameterised constructor which prints 'Reindeer'.
 * The comma is then included, hasHorns() is called. The method from the superclass takes precedence and returns false.
 * 
 * 
 */

public class question8 {
	
	public question8() {	System.out.print("Deer");	}
	
	public question8(int age) {	System.out.println("DeerAge");}
	
	private boolean hasHorns()	{	return false;	}
	
	public static void main(String [] args) {
		
		question8 deer = new Reindeer(5);
		
		System.out.println(","+ deer.hasHorns());
		
		
	}
}

class Reindeer extends question8 {
	public Reindeer (int age) {	System.out.print("Reindeer"); }
	
	public boolean hasHorns() {	return true;	}
}