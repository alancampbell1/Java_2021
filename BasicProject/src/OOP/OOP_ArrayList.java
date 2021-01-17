package OOP;

/**
 * 
 * @author alancampbell
 * 
 * The ArrayList class is a re-sizable array found in the java.util package.
 * To add elements to an ArrayList, you use the .add() method
 * To return an element we use the .get() method starting at 0.
 * To modify a specific element we use the .set() method with the index number and new value we want in its place.
 * To remove a value, we use the .remove() method with the index number. This pushes up all the elements up that come
 * after it.
 * To get the size of your ArrayList, use the .size() method.
 * To completely wipe your ArrayList, use the .clear() method.
 * 
 * You can print ArrayLists out directly. However, they appear with [] at the start and end. To remove the [] you must
 * use a standard for loop.
 */

import java.util.ArrayList;
import java.util.Collections;
public class OOP_ArrayList {

	public static void main(String [] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("Skoda");
		cars.add("Toyota");
		
		System.out.println(cars);
		
		System.out.println(cars.get(0));
		
		cars.set(2, "VM");
		
		cars.remove(2);
		
		System.out.println("Removed: " + cars);
		
		System.out.println("Size: " + cars.size());
		
		/**	
		   To loop through an Arraylist, you use a for loop and a the .size() method
		**/
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		cars.clear();
		
		/**
		 * ArrayLists are not limited to Strings but can be any of the following: Boolean, Character, Double, Integer
		 */
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		myNums.add(4);
		myNums.add(8);
		myNums.add(1);
		myNums.add(3);
		myNums.add(9);
		
		/* Using a for-each loop to print out the contents	*/
		for (int i: myNums) {
			System.out.println(i);
		}
		
		/**
		 * Another useful package that can be used is from java.util is Collections. This includes a .sort() method for
		 * storing ArrayLists alpha and numerically.
		 */
		
		Collections.sort(myNums);
		System.out.println(myNums);
		
		
	}
}
