package OOP;

/**
 * 
 * @author alancampbell
 * 
 * LinkedLists can be utilized through a class called LinkedList.
 * 
 * LinkedLists vs ArrayLists:
 * - A LinkedList class is a collection which can contain may objects of the same type. The same is of an ArrayList.
 * - A LinkedList and an Array List both have the same methods as they implement the List interface.
 * 
 * - An ArrayList class has a regular Array within it. When an element is added it is placed into the Array. When the
 * array is too small, a larger array is made and used in its place.
 * 
 * - LinkedLists store its items in Containers. The list has a link to the first Container and this Container has a link
 * to the next Container in the list. When a new element is added to the list, the element is saved into a Container and
 * this Container is linked to a Container in the list.
 * 
 * When to use a LinkedList vs an ArrayList:
 * ArrayList:
 * - To access random items frequently.
 * - You only need to add or remove items at the end of the list.
 * 
 * LinkedList:
 * - Only accessed through looping not for random items.
 * - You need to add or remove items anywhere in the list.
 * 
 * LinkedLists have a number of unique methods to alter the LinkedList or get a specific element:
 * addFirst()		- adds an items to the beginning of the list
 * addLast()		- adds an item to the end of the list
 * removeFirst()	- removes the first item
 * removeLast()		- removes the last item
 * getFirst()		- returns the first item
 * getLast()		- returns the last item
 * 
 */

import java.util.LinkedList;

public class OOP_LinkedList {
	
	public static void main(String [] args) {
		
		//LinkedList object created called cars
		LinkedList<String> cars = new LinkedList<String>();
		
		//Add items to the LinkedList
		cars.add("Skoda");
		cars.add("BMW");
		cars.add("VW");
		cars.add("Toyota");
		
		System.out.println(cars);
		
		//We use the .size() method to get the length in order to loop through a LinkedList
		for(int i = 0; i < cars.size(); i++) {
			
			//We then use the .get() method to print each individual element
			System.out.println(cars.get(i));
			
		}
		
	}

}
