package LinkedLists;

/**
 * @author alancampbell
 * 
 * Next to Arrays, LinkedLists are the second most commonly used general purpose storage structure.
 * They are quite versatile and conceptually easier to understand than trees.
 * 
 * In a linkedlist, each data item is embedded in a link. A link is an object of a class and generally called 'link'.
 * A link class generally contains the following information: the data item and a link object that will refer to the next
 * link in the list.
 * It also contains a constructor that allows us to assign a piece of data to the link object.
 * It also contains a method to display the data within the current link. Used with a simple print statement.
 * 
 * To work with a link we create a second object of a class called linkedList. This class will contain all the methods
 * needed to insert a link, delete a link, display the contents of a link, check if it is empty.
 * For example, the method insertFirst, adds a link to the beginning of the list and points its internal link object
 * to the previous first link in the list. 
 * 
 * This linkedList object is worked with in the Main Method when an object of it is created.
 * 
 */

class link {
	int iData;
	link next;
	
	public link(int x) {
		iData = x;
	}
	
	public void displayLink() {
		System.out.println("The contents of this link is " + iData);
	}
}

class linkedList {
	private link first;
	
	public linkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		if (first == null) 
				return true;
		else
			return false;
	}
	
	public void insertFirst(int userData) {
		
		link newLink = new link(userData);		//Create a brand new link and pass in the data from the user
		
		newLink.next = first;					//Assign the new link's internal link to the content in current 'first' link
		
		first = newLink;		//Re-assign newLink as the first link so the next link created will know to work with this link
	}
	
	public link deleteFirst() {
		
		link temp = first;			//Create a temporary link that contains the contents of the first link
		
		first     = first.next;	//Update first so that it now contains the content of internal content of the first.next, aka the second link in the list
		
		return temp;	//Return the broken off link to the user to use as they need
	}
	
	public void displayList() {
		System.out.println("From the first to the last link:");
		
		link current = first;				//Get the first link in the list
		while (current != null) {			//While the current link is not empty do the following
			
			current.displayLink();			//Print the data embedded in the link
			current = current.next;			//Update current to be equal to the next link in the list and repeat.	
		}	
		System.out.println("Finished.");
	}
	
	/**
	 * A more complex method a linkedList can contain is to find a specific link in a linked list using the a key
	 * and embedded data within each link object created.
	 * 
	 * 
	 */
	
	public link findLink (int key) {
		
		link current = first;				//We get the first link in the list
		
		while(current.iData != key) {		//We check if its embedded data does not equal the key we are looking for.
			
			if (current.next == null) 		//We check if the next link in the list is null, if so we could not locate the specific link
				return null;
			else
				current = current.next;		//Otherwise, we update current to contain the contents of the current link's next link in the list
		}
		return current;						//If a match is made, the current link is returned to the user
	}
	
	public link deleteLink (int key) {
		
		link current = first;				//We create two temporary links both initially pointing to the first link
		link previous = first;
		
		while (current.iData != key) {		//We loop through like before looking for a match between iData and key
			
			if (current.next == null)		//If the next link in the list is null, we found no match and null is returned
				return null;
			else {							
				previous = current;			//When we re-assign our temp links, previous will get the contents of the current
				current  = current.next;	//And current will be updated to the contents of next link in the list
			}
		}
		
		//If a match is made we get to this section of the code

		if (current == first)				//If the match was made on the first link, we simply update first to contain the contents of the next link
			first = first.next;				//and the contents of the original first are lost
		else
			previous.next = current.next;	//Otherwise, previous' next link is made to skip current's link and go straight to current's next link
		
		return current;						//The deleted link is now in current and returned to the user
	}
}

public class basicLinkedList {
	
	public static void main(String [] args) {
		
		linkedList myLinkedList = new linkedList();
		
		myLinkedList.insertFirst(7);
		myLinkedList.insertFirst(3);
		myLinkedList.insertFirst(9);
		myLinkedList.insertFirst(1);
		
		link deletedLink = myLinkedList.deleteFirst();
		System.out.println("Deleted the first link in the list: " + deletedLink.iData);
		
		System.out.println("Is the linked list Empty: " + myLinkedList.isEmpty());
		
		myLinkedList.displayList();
		
		
		link foundLink = myLinkedList.findLink(3);
		System.out.println("Found specific link: " + foundLink.iData);
		
		myLinkedList.deleteLink(3);
		
		myLinkedList.displayList();
		
		
		
	}
	
}
