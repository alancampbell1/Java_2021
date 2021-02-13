package assessment_test;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author alancampbell
 * 
 * What is the outcome of the following code:
 * The answer is 9.
 * 
 * 6 is added to the list object.
 * 8 is then added to the list object.
 * The value 8 is then changed to 9.
 * The value at element 0 is removed, aka 6 is removed.
 * Finally, 9 is printed.
 * 
 * Note:
 * List is an interface from which different types of lists can be created, such as ArrayLists and LinkedLists.
 * In the example below, we create an ArrayList object that is of type Integer.
 * 
 * 		List<Integer> mylist = new ArrayList<>();
 * 
 * Because, List is an Interface, creating an object that is a List will fail:
 * 
 *		List<Integer> mylist = new List<>(); 
 *
 * Alternatively to the first version, you could simply declare the object with the following statement:
 * 
 * 		ArrayList<Integer> mylist = new ArrayList<>();
 * 
 */

public class question7 {
	
	public static void main(String [] args) {
		
		int [] array = {6, 9, 8};
		
		List<Integer> list = new ArrayList<>();
		
		ArrayList<Integer> mylist = new ArrayList<>();
		
		list.add(array[0]);
		list.add(array[2]);
		list.set(1, array[1]);
		list.remove(0);
		System.out.println(list);
		
	}

}
